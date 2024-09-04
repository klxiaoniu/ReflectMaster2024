package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: 1PNKPG&KCNQI */
/* renamed from: 　　́ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class AsyncTaskC0177 extends AsyncTask<String, Exception, C0191> implements DialogInterface.OnClickListener {

    /* renamed from: ۦ */
    public static Activity f431;

    /* renamed from: 　　 */
    private static SharedPreferences f433;

    /* renamed from: 　۬ */
    private boolean f434 = false;

    /* renamed from: ۬ */
    private static final String f432 = "6.5";

    /* renamed from: ۥ */
    private static boolean f430 = false;

    /* renamed from: ́ */
    private static AsyncTaskC0177 f429 = new AsyncTaskC0177();

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(C0191 c0191) {
        AlertDialog.Builder builder;
        AsyncTaskC0177 asyncTaskC0177;
        C0191 c01912 = c0191;
        super.onPostExecute(c01912);
        if (c01912 == null || c01912.f476.equals("关")) {
            if (this.f434) {
                Toast.makeText(f431, "已经是最新版本！", 0).show();
                return;
            }
            return;
        }
        if (!this.f434 || !C0191.f459.equals(C0191.f458)) {
            if (!c01912.f478.startsWith("开") || !C0191.f459.equals(C0191.f458)) {
                String str = c01912.f469;
                Activity activity = f431;
                if (str.equals("默认白")) {
                    builder = new AlertDialog.Builder(activity, 5);
                } else if (str.equals("默认黑")) {
                    builder = new AlertDialog.Builder(activity, 4);
                } else if (str.equalsIgnoreCase("HOLO白")) {
                    builder = new AlertDialog.Builder(activity, 3);
                } else if (str.equalsIgnoreCase("HOLO黑")) {
                    builder = new AlertDialog.Builder(activity, 2);
                } else if (str.equals("传统")) {
                    builder = new AlertDialog.Builder(activity, 1);
                } else {
                    builder = new AlertDialog.Builder(activity);
                }
                builder.setTitle(Html.fromHtml(c01912.f466)).setMessage(Html.fromHtml(c01912.f471));
                if (c01912.f472.equals("关")) {
                    asyncTaskC0177 = this;
                } else {
                    builder.setPositiveButton(c01912.f468, this);
                    asyncTaskC0177 = this;
                }
                if (!c01912.f464.equals("关")) {
                    builder.setNegativeButton(c01912.f467, asyncTaskC0177);
                }
                if (!c01912.f463.equals("关")) {
                    builder.setNeutralButton(c01912.f462, asyncTaskC0177);
                }
                AlertDialog create = builder.create();
                if (c01912.f470.equals("关")) {
                    create.setCanceledOnTouchOutside(false);
                }
                if (c01912.f475.equals("开")) {
                    create.getWindow().setDimAmount(0.0f);
                }
                create.show();
                if (c01912.f477.equals("开")) {
                    try {
                        Field declaredField = create.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField.setAccessible(true);
                        declaredField.set(create, Boolean.FALSE);
                    } catch (Exception e) {
                        publishProgress(e);
                    }
                }
                try {
                    Field declaredField2 = AlertDialog.class.getDeclaredField("mAlert");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(create);
                    Field declaredField3 = obj.getClass().getDeclaredField("mTitleView");
                    declaredField3.setAccessible(true);
                    TextView textView = (TextView) declaredField3.get(obj);
                    if (textView != null) {
                        textView.setTextColor(Color.parseColor(c01912.f474));
                    }
                    Field declaredField4 = obj.getClass().getDeclaredField("mMessageView");
                    declaredField4.setAccessible(true);
                    TextView textView2 = (TextView) declaredField4.get(obj);
                    if (textView2 != null) {
                        textView2.setTextColor(Color.parseColor(c01912.f473));
                    }
                } catch (Exception e2) {
                    publishProgress(e2);
                }
                try {
                    create.getButton(-1).setTextColor(Color.parseColor(c01912.f465));
                } catch (Exception e3) {
                    publishProgress(e3);
                }
                try {
                    create.getButton(-2).setTextColor(Color.parseColor(c01912.f461));
                } catch (Exception e4) {
                    publishProgress(e4);
                }
                try {
                    create.getButton(-3).setTextColor(Color.parseColor(c01912.f460));
                    return;
                } catch (Exception e5) {
                    publishProgress(e5);
                    return;
                }
            }
            return;
        }
        Toast.makeText(f431, "已经是最新版本！", 0).show();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Exception[] excArr) {
        Exception[] excArr2 = excArr;
        super.onProgressUpdate(excArr2);
        Exception exc = excArr2[0];
        String stackTraceString = Log.getStackTraceString(exc);
        if (!f430 || excArr2 == null || exc == null || stackTraceString.isEmpty()) {
            return;
        }
        new AlertDialog.Builder(f431).setTitle("错误信息").setMessage(stackTraceString).setPositiveButton("复制", new DialogInterfaceOnClickListenerC0176(this, stackTraceString)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
    }

    static {
        Log.d("OnlineDialog", "6.5");
    }

    /* renamed from: ۬ */
    public static final void m97(Activity activity, String str) {
        f431 = activity;
        f433 = PreferenceManager.getDefaultSharedPreferences(activity);
        try {
            String str2 = new String(Base64.decode(str.getBytes("UTF-8"), 0), "UTF-8");
            if (str2.contains("ttp")) {
                str = str2;
            }
        } catch (Exception e) {
        }
        try {
            if (str.startsWith("Eh")) {
                f430 = true;
            } else {
                f430 = false;
            }
            Class.forName("android.os.AsyncTask");
            f429.execute(str.replace("Ehttp", "http"));
        } catch (Exception e2) {
        }
    }

    /* renamed from: ۬ */
    public static final void m98(Activity activity, String str, boolean z) {
        f431 = activity;
        f433 = PreferenceManager.getDefaultSharedPreferences(activity);
        try {
            String str2 = new String(Base64.decode(str.getBytes("UTF-8"), 0), "UTF-8");
            if (str2.contains("ttp")) {
                str = str2;
            }
        } catch (Exception e) {
        }
        try {
            if (str.startsWith("Eh")) {
                f430 = true;
            } else {
                f430 = false;
            }
            Class.forName("android.os.AsyncTask");
            AsyncTaskC0177 asyncTaskC0177 = new AsyncTaskC0177();
            asyncTaskC0177.f434 = true;
            PreferenceManager.getDefaultSharedPreferences(activity).edit().remove("dialogVer").apply();
            asyncTaskC0177.execute(str.replace("Ehttp", "http"));
        } catch (Exception e2) {
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        super.onPreExecute();
        if (this.f434) {
            Toast.makeText(f431, "正在检查更新，请稍后...", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: ۬, reason: merged with bridge method [inline-methods] */
    public C0191 doInBackground(String[] strArr) {
        C0191 c0191;
        String str = strArr[0];
        if (str == null || str.trim().isEmpty() || !str.contains("ttp")) {
            publishProgress(new Exception("配置链接错误：" + str));
            return null;
        }
        try {
            String m92 = m92(str);
            if (m92 == null || m92.trim().isEmpty()) {
                publishProgress(new Exception("获取弹窗配置失败或配置内容为空"));
                return null;
            }
            try {
            } catch (Exception e) {
                publishProgress(e);
                c0191 = null;
            }
            if (!m92.contains("〈/弹窗配置〉") || !m92.contains("〈弹窗配置〉")) {
                throw new Exception("emmm...请求结果貌似不包含配置内容");
            }
            c0191 = new C0191();
            int lastIndexOf = m92.lastIndexOf("〈/弹窗配置〉");
            int lastIndexOf2 = m92.lastIndexOf("〈弹窗配置〉", lastIndexOf);
            if (lastIndexOf2 == -1) {
                throw new Exception("糟糕 配置不完整");
            }
            C0191.f457 = m92.substring(lastIndexOf2, lastIndexOf).replace("\\\"", "\"").replace("&lt;", "<").replace("&gt;", ">").replace("<br  />", "<br>").replace("\\u003C", "<").replace("<p><br></p>", "<p></p>").replace("</div><div>", "<br>").replace("</p><p>", "<br>");
            c0191.f476 = m94("总开关");
            c0191.f478 = m94("智能弹出");
            C0191.f459 = m94("版本");
            String str2 = f431.getPackageManager().getPackageInfo(f431.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = f433;
            if (str2 == null || str2.isEmpty()) {
                str2 = "";
            }
            C0191.f458 = sharedPreferences.getString("dialogVer", str2);
            c0191.f477 = m94("强制性");
            c0191.f470 = m94("点击外部关闭弹窗");
            c0191.f469 = m94("弹窗风格");
            c0191.f475 = m94("外部背景透明");
            c0191.f466 = m94("标题");
            c0191.f474 = m94("标题颜色");
            c0191.f471 = m94("信息");
            c0191.f473 = m94("信息颜色");
            c0191.f472 = m94("同意按钮");
            c0191.f468 = m94("同意按钮文本");
            c0191.f465 = m94("同意按钮颜色");
            C0191.f454 = m94("同意按钮事件");
            c0191.f464 = m94("拒绝按钮");
            c0191.f467 = m94("拒绝按钮文本");
            c0191.f461 = m94("拒绝按钮颜色");
            C0191.f456 = m94("拒绝按钮事件");
            c0191.f463 = m94("中立按钮");
            c0191.f462 = m94("中立按钮文本");
            c0191.f460 = m94("中立按钮颜色");
            C0191.f455 = m94("中立按钮事件");
            return c0191;
        } catch (Exception e2) {
            publishProgress(e2);
            return null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String trim = C0191.f454.trim();
        String trim2 = C0191.f456.trim();
        String trim3 = C0191.f455.trim();
        switch (i) {
            case -3:
                if (trim3.startsWith("无")) {
                    try {
                        Field declaredField = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField.setAccessible(true);
                        declaredField.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        Toast.makeText(f431, e.toString(), 1).show();
                        return;
                    }
                }
                if (trim3.startsWith("退出")) {
                    try {
                        f431.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e2) {
                        Toast.makeText(f431, e2.toString(), 1).show();
                        return;
                    }
                }
                if (trim3.startsWith("智能")) {
                    try {
                        if (trim3.contains("提示")) {
                            Toast.makeText(f431, trim3.substring(trim3.indexOf("提示") + 2), 1).show();
                        }
                        f433.edit().putString("dialogVer", C0191.f459).apply();
                        Field declaredField2 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField2.setAccessible(true);
                        declaredField2.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e3) {
                        Toast.makeText(f431, e3.toString(), 1).show();
                        return;
                    }
                }
                if (trim3.startsWith("网址")) {
                    try {
                        if (trim3.contains("提示")) {
                            Toast.makeText(f431, trim3.substring(trim3.indexOf("提示") + 2), 1).show();
                            trim3 = trim3.substring(0, trim3.indexOf("提示"));
                        }
                        f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(!trim3.contains("href=") ? trim3.substring(2) : trim3.substring(trim3.lastIndexOf("\">") + 2, trim3.lastIndexOf("</a>")))));
                        return;
                    } catch (Exception e4) {
                        Toast.makeText(f431, e4.toString(), 1).show();
                        return;
                    }
                }
                if (trim3.startsWith("提示")) {
                    try {
                        Toast.makeText(f431, trim3.substring(2), 1).show();
                        return;
                    } catch (Exception e5) {
                        Toast.makeText(f431, e5.toString(), 1).show();
                        return;
                    }
                }
                if (trim3.startsWith("QQ") || trim3.startsWith("qq")) {
                    m99(trim3);
                    return;
                }
                return;
            case -2:
                if (trim2.startsWith("无")) {
                    try {
                        Field declaredField3 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField3.setAccessible(true);
                        declaredField3.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e6) {
                        Toast.makeText(f431, e6.toString(), 1).show();
                        return;
                    }
                }
                if (trim2.startsWith("退出")) {
                    try {
                        f431.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e7) {
                        Toast.makeText(f431, e7.toString(), 1).show();
                        return;
                    }
                }
                if (trim2.startsWith("智能")) {
                    try {
                        if (trim2.contains("提示")) {
                            Toast.makeText(f431, trim2.substring(trim2.indexOf("提示") + 2), 1).show();
                        }
                        f433.edit().putString("dialogVer", C0191.f459).apply();
                        Field declaredField4 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField4.setAccessible(true);
                        declaredField4.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e8) {
                        Toast.makeText(f431, e8.toString(), 1).show();
                        return;
                    }
                }
                if (trim2.startsWith("网址")) {
                    try {
                        if (trim2.contains("提示")) {
                            Toast.makeText(f431, trim2.substring(trim2.indexOf("提示") + 2), 1).show();
                            str = trim2.substring(0, trim2.indexOf("提示"));
                        } else {
                            str = trim2;
                        }
                        f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(!str.contains("href=") ? str.substring(2) : str.substring(str.lastIndexOf("\">") + 2, str.lastIndexOf("</a>")))));
                        return;
                    } catch (Exception e9) {
                        Toast.makeText(f431, e9.toString(), 1).show();
                        return;
                    }
                }
                if (trim2.startsWith("提示")) {
                    try {
                        Toast.makeText(f431, trim2.substring(2), 1).show();
                        return;
                    } catch (Exception e10) {
                        Toast.makeText(f431, e10.toString(), 1).show();
                        return;
                    }
                }
                if (trim2.startsWith("QQ") || trim2.startsWith("qq")) {
                    m99(trim2);
                    return;
                }
                return;
            case -1:
                if (trim.startsWith("无")) {
                    try {
                        Field declaredField5 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField5.setAccessible(true);
                        declaredField5.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e11) {
                        Toast.makeText(f431, e11.toString(), 1).show();
                        return;
                    }
                }
                if (trim.startsWith("退出")) {
                    try {
                        f431.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e12) {
                        Toast.makeText(f431, e12.toString(), 1).show();
                        return;
                    }
                }
                if (trim.startsWith("智能")) {
                    try {
                        if (trim.contains("提示")) {
                            Toast.makeText(f431, trim.substring(trim.indexOf("提示") + 2), 1).show();
                        }
                        f433.edit().putString("dialogVer", C0191.f459).apply();
                        Field declaredField6 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField6.setAccessible(true);
                        declaredField6.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e13) {
                        Toast.makeText(f431, e13.toString(), 1).show();
                        return;
                    }
                }
                if (trim.startsWith("网址")) {
                    try {
                        if (trim.contains("提示")) {
                            Toast.makeText(f431, trim.substring(trim.indexOf("提示") + 2), 1).show();
                            str2 = trim.substring(0, trim.indexOf("提示"));
                        } else {
                            str2 = trim;
                        }
                        f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(!str2.contains("href=") ? str2.substring(2) : str2.substring(str2.lastIndexOf("\">") + 2, str2.lastIndexOf("</a>")))));
                        return;
                    } catch (Exception e14) {
                        Toast.makeText(f431, e14.toString(), 1).show();
                        return;
                    }
                }
                if (trim.startsWith("提示")) {
                    try {
                        Toast.makeText(f431, trim.substring(2), 1).show();
                        return;
                    } catch (Exception e15) {
                        Toast.makeText(f431, e15.toString(), 1).show();
                        return;
                    }
                }
                if (trim.startsWith("QQ") || trim.startsWith("qq")) {
                    m99(trim);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: ۬ */
    private final void m99(String str) {
        if (str.contains("名片")) {
            try {
                if (str.contains("提示")) {
                    Toast.makeText(f431, str.substring(str.indexOf("提示") + 2), 1).show();
                    str = str.substring(0, str.indexOf("提示"));
                }
                f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str.substring(4))));
                return;
            } catch (Exception e) {
                if (e instanceof ActivityNotFoundException) {
                    Toast.makeText(f431, "未安装手机QQ", 0).show();
                    return;
                } else {
                    Toast.makeText(f431, e.toString(), 1).show();
                    return;
                }
            }
        }
        if (str.contains("群")) {
            try {
                if (str.contains("提示")) {
                    Toast.makeText(f431, str.substring(str.indexOf("提示") + 2), 1).show();
                    str = str.substring(0, str.indexOf("提示"));
                }
                f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + str.substring(3) + "&card_type=group&source=qrcode")));
                return;
            } catch (Exception e2) {
                if (e2 instanceof ActivityNotFoundException) {
                    Toast.makeText(f431, "未安装手机QQ", 0).show();
                    return;
                } else {
                    Toast.makeText(f431, e2.toString(), 1).show();
                    return;
                }
            }
        }
        if (str.contains("咨询")) {
            try {
                if (str.contains("提示")) {
                    Toast.makeText(f431, str.substring(str.indexOf("提示") + 2), 1).show();
                    str = str.substring(0, str.indexOf("提示"));
                }
                f431.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + str.substring(4) + "&version=1&src_type=web")));
            } catch (Exception e3) {
                if (e3 instanceof ActivityNotFoundException) {
                    Toast.makeText(f431, "未安装手机QQ", 0).show();
                } else {
                    Toast.makeText(f431, e3.toString(), 1).show();
                }
            }
        }
    }

    /* renamed from: ́ */
    private static String m92(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_0 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8A293 Safari/6531.22.7");
        if (httpURLConnection.getResponseCode() != 200) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                stringBuffer.append(readLine);
            } else {
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: ۦ */
    private final String m94(String str) {
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    String str2 = "〈" + str + "〉";
                    String str3 = "〈/" + str + "〉";
                    String str4 = C0191.f457;
                    return str4.substring(str2.length() + str4.indexOf(str2), C0191.f457.indexOf(str3));
                }
            } catch (Exception e) {
                publishProgress(e);
                return "";
            }
        }
        return "";
    }

    /* renamed from: ۥ */
    private static String m93(String str) {
        byte[] bArr = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("qyma".toCharArray(), "$9s1{;1H".getBytes("UTF-8"), 5, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec("F-=5!2]/9G(<(=uY".getBytes("UTF-8")));
            bArr = cipher.doFinal(Base64.decode(str, 0));
        } catch (Exception e) {
        }
        if (bArr != null) {
            return new String(bArr);
        }
        return str;
    }
}
