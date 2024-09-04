package p000;

import android.R;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: %NCUU9KPFQY */
/* renamed from: ۦ̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0082 extends AbstractC0100 implements Runnable, InterfaceC0090 {

    /* renamed from: ̀۬ */
    private int f196;

    /* renamed from: ̀　 */
    private int f197;

    /* renamed from: ۦ́ */
    public LinearLayout f198;

    /* renamed from: ۦۥ */
    private Handler f199;

    /* renamed from: ۦۦ */
    public EditText f200;

    /* renamed from: ۦ۬ */
    ProgressBar f201;

    /* renamed from: ۦ　 */
    C0150 f202;

    /* renamed from: ۬۬ */
    ListView f203;

    /* renamed from: ۬　 */
    EditText f204;

    public RunnableC0082(Object obj, int i, int i2) {
        super(obj, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f197 = ((Integer) this.f258[0]).intValue();
        this.f196 = ((Integer) this.f258[1]).intValue();
        if (this.f196 != 1) {
            this.f199 = null;
            super.mo24();
        } else {
            this.f199 = new HandlerC0079(this);
            super.mo24();
        }
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    protected final void mo23() {
        this.f198 = new LinearLayout(f255);
        this.f198.setBackgroundColor(-12303292);
        this.f198.setOrientation(1);
        TextView textView = new TextView(f255);
        textView.setText(this.f197 == 0 ? "创建对象" : "查找类");
        textView.setTextColor(-65536);
        m45(this.f198, textView);
        new C0167(AbstractC0100.f255, this.f260, this.f257, this.f198, false);
        this.f200 = new EditText(f255);
        this.f200.setHint("输入完整类名");
        this.f200.setText(this.f262.getString(this.f197 == 0 ? Constants.CJDX.value : Constants.CZL.value, ""));
        this.f200.setHintTextColor(Color.parseColor("#a2a2a2"));
        this.f200.setTextColor(-1);
        AbstractC0100 abstractC0100 = m45(this.f198, this.f200);
        ViewGroup viewGroup = this.f198;
        Button button = new Button(AbstractC0100.f255);
        button.setText("确定");
        abstractC0100.m46(viewGroup, button, this);
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        this.f257.width = i;
        this.f257.height = i;
        if (this.f199 != null) {
            this.f201 = new ProgressBar(f255, null, R.attr.progressBarStyleHorizontal);
            this.f201.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f201.setIndeterminate(true);
            this.f201.setVisibility(0);
            m45(this.f198, this.f201);
            this.f203 = new ListView(f255);
            this.f203.setFastScrollEnabled(true);
            this.f203.setOnItemClickListener(new C0081(this));
            this.f204 = new EditText(f255);
            this.f204.setHint("搜索类");
            this.f204.setTextColor(-1);
            this.f204.setHintTextColor(Color.parseColor("#a2a2a2"));
            this.f204.addTextChangedListener(new C0080(this));
            new Thread(this).start();
            this.f257.width = 800;
            this.f257.height = 1260;
        }
        this.f260.addView(this.f198, this.f257);
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        String trim = this.f200.getEditableText().toString().trim();
        if (trim == null || TextUtils.isEmpty(trim)) {
            ToastUtils.show("请输入正确的类名");
            return;
        }
        try {
            if (this.f197 == 0) {
                this.f262.edit().putString(Constants.CJDX.value, trim).apply();
            } else if (this.f197 == 1) {
                this.f262.edit().putString(Constants.CZL.value, trim).apply();
            }
            Class<?> cls = null;
            if (f256 != null) {
                cls = XposedHelpers.findClassIfExists(trim, f256.classLoader);
            }
            if (cls == null) {
                try {
                    cls = f255.getClassLoader().loadClass(trim);
                } catch (Exception e) {
                }
            }
            if (cls == null) {
                try {
                    f255.getClassLoader();
                    cls = ClassLoader.getSystemClassLoader().loadClass(trim);
                } catch (Exception e2) {
                }
            }
            if (cls != null) {
                if (this.f197 == 0) {
                    new C0030(this.f259, cls);
                } else if (this.f197 == 1) {
                    new C0063(cls);
                    ToastUtils.show("正在打开结果：" + cls.getName());
                }
            } else {
                ToastUtils.show("ClassNotFound：" + trim);
            }
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, th);
        }
        this.f260.removeView(this.f198);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object invoke;
        try {
            ArrayList arrayList = new ArrayList();
            ClassLoader classLoader = f255.getClassLoader();
            Field declaredField = classLoader.getClass().getSuperclass().getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            for (Object obj2 : (Object[]) declaredField2.get(obj)) {
                Field declaredField3 = obj2.getClass().getDeclaredField("dexFile");
                declaredField3.setAccessible(true);
                Object obj3 = declaredField3.get(obj2);
                if (obj3 != null && (invoke = obj3.getClass().getDeclaredMethod("entries", new Class[0]).invoke(obj3, new Object[0])) != null) {
                    Field declaredField4 = invoke.getClass().getDeclaredField("mNameList");
                    declaredField4.setAccessible(true);
                    String[] strArr = (String[]) declaredField4.get(invoke);
                    if (strArr != null && strArr.length != 0) {
                        arrayList.addAll(Arrays.asList(strArr));
                    }
                }
            }
            this.f199.obtainMessage(200, arrayList).sendToTarget();
        } catch (Throwable th) {
            if (this.f201 != null) {
                this.f201.setVisibility(8);
            }
            HandlerC0184.m102(AbstractC0100.f255, th);
        }
    }
}
