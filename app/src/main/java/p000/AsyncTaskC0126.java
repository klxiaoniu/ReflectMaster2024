package p000;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Build;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: 4GCF&GZ6CUM */
/* renamed from: ۬　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class AsyncTaskC0126 extends AsyncTask<Object, Object, String[]> {

    /* renamed from: ́ */
    private ProgressDialog f326;

    /* renamed from: ۬ */
    private C0063 f327;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(String[] strArr) {
        super.onCancelled(strArr);
        if (this.f326 != null && this.f326.isShowing()) {
            this.f326.dismiss();
        }
        ToastUtils.show("已取消操作");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String[] strArr) {
        String[] strArr2 = strArr;
        super.onPostExecute(strArr2);
        if (this.f326 != null && this.f326.isShowing()) {
            this.f326.dismiss();
        }
        if (strArr2 == null) {
            return;
        }
        HandlerC0184.m110(AbstractC0100.f255, new C0091(this.f327, strArr2[1]), strArr2[0] + strArr2[1]);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        super.onPreExecute();
        this.f326 = new ProgressDialog(C0063.f255);
        this.f326.setTitle("处理中...");
        this.f326.setProgressStyle(0);
        this.f326.setButton("取消", new DialogInterfaceOnClickListenerC0125(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: ۬, reason: merged with bridge method [inline-methods] */
    public String[] doInBackground(Object[] objArr) {
        try {
            return m53(objArr);
        } catch (Throwable th) {
            publishProgress(th);
            return null;
        }
    }

    /* renamed from: ́ */
    private String[] m53(Object[] objArr) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        String[] strArr;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        this.f327 = (C0063) objArr[2];
        if (str.equals("dex")) {
            publishProgress("获取Dex...");
            RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rw");
            Class cls = this.f327.f261;
            if (this.f327.f259 instanceof Class) {
                cls = (Class) this.f327.f259;
            }
            Method declaredMethod = cls.getClass().getDeclaredMethod("getDex", new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("getBytes", new Class[0]);
            if (!declaredMethod2.isAccessible()) {
                declaredMethod2.setAccessible(true);
            }
            byte[] bArr = (byte[]) declaredMethod2.invoke(invoke, new Object[0]);
            if (this.f327.f262.getBoolean(Constants.XFDEX.value, false)) {
                try {
                    String str3 = new String(C0171.m89(bArr));
                    if (!str3.contains("6465780a3033")) {
                        publishProgress("修复Magic...");
                        bArr = C0171.m88((str3.substring(0, 16).replace("0000000000000000", "6465780a30333500") + str3.substring(16)).toCharArray());
                    }
                } catch (Throwable th) {
                    ToastUtils.show("修复Magic失败：" + th.getMessage());
                }
            }
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            return new String[]{"写出成功, 文件位于" + str2, str2};
        }
        if (str.equals("multydex")) {
            publishProgress("加载Dex数组...");
            ArrayList arrayList = new ArrayList();
            ClassLoader classLoader = C0063.f255.getClassLoader();
            Field declaredField = classLoader.getClass().getSuperclass().getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object[] objArr2 = (Object[]) m54(declaredField.get(classLoader), "dexElements");
            publishProgress(objArr2);
            Method declaredMethod3 = classLoader.getClass().getSuperclass().getSuperclass().getDeclaredMethod("findClass", String.class);
            declaredMethod3.setAccessible(true);
            for (Object obj : objArr2) {
                if (isCancelled()) {
                    return null;
                }
                Object m54 = m54(obj, "dexFile");
                if (m54 != null) {
                    publishProgress("遍历类...");
                    Method declaredMethod4 = m54.getClass().getDeclaredMethod("entries", new Class[0]);
                    if (declaredMethod4.invoke(m54, new Object[0]) != null && (strArr = (String[]) m54(declaredMethod4.invoke(m54, new Object[0]), "mNameList")) != null && strArr.length != 0) {
                        publishProgress("提取Dex");
                        for (String str4 : strArr) {
                            if (isCancelled()) {
                                return null;
                            }
                            try {
                                Class cls2 = (Class) declaredMethod3.invoke(classLoader, str4);
                                Object invoke2 = cls2.getClass().getDeclaredMethod("getDex", new Class[0]).invoke(cls2, new Object[0]);
                                if (!arrayList.contains(invoke2)) {
                                    arrayList.add(invoke2);
                                }
                            } catch (Throwable th2) {
                            }
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                publishProgress(new UnsupportedOperationException("找不到Dex！"));
                return null;
            }
            File file = new File(str2);
            file.mkdirs();
            int i = 1;
            boolean z = this.f327.f262.getBoolean(Constants.XFDEX.value, false);
            Iterator it = arrayList.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    Object next = it.next();
                    if (isCancelled()) {
                        return null;
                    }
                    publishProgress("写出第" + i2 + "个Dex...");
                    byte[] bArr2 = (byte[]) next.getClass().getDeclaredMethod("getBytes", new Class[0]).invoke(next, new Object[0]);
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(file, "classes" + (i2 == 1 ? "" : Integer.valueOf(i2)) + ".dex"), "rw");
                    if (z) {
                        try {
                            String str5 = new String(C0171.m89(bArr2));
                            if (!str5.contains("6465780a3033")) {
                                publishProgress("修复Dex" + i2 + " Magic...");
                                bArr2 = C0171.m88((str5.substring(0, 16).replace("0000000000000000", "6465780a30333500") + str5.substring(16)).toCharArray());
                            }
                        } catch (Throwable th3) {
                            ToastUtils.show("修复Magic失败：" + th3.getMessage());
                        }
                    }
                    randomAccessFile2.write(bArr2);
                    randomAccessFile2.close();
                    i = i2 + 1;
                } else {
                    return new String[]{"处理成功，共写出 " + (i2 - 1) + " 个dex，文件夹位于", str2};
                }
            }
        } else {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onProgressUpdate(Object[] objArr) {
        super.onProgressUpdate(objArr);
        Object obj = objArr[0];
        ProgressDialog progressDialog = this.f326;
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if ((th instanceof NoSuchMethodException) && th.toString().contains("getDex")) {
                HandlerC0184.m102(AbstractC0100.f255, String.format("不支持的设备系统版本[Api %d]", Integer.valueOf(Build.VERSION.SDK_INT)));
                return;
            } else {
                HandlerC0184.m102(AbstractC0100.f255, th);
                return;
            }
        }
        progressDialog.setMessage(String.valueOf(obj));
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    /* renamed from: ۬ */
    private static Object m54(Object obj, String str) {
        if (obj != null && str != null) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Throwable th) {
                th.printStackTrace();
                return obj;
            }
        }
        return obj;
    }
}
