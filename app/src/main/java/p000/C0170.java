package p000;

import android.util.Log;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: .QI7VKN */
/* renamed from: 　　̀ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0170 {

    /* renamed from: ۬ */
    private static final InterfaceC0178 f421;

    static {
        InterfaceC0178 c0179;
        try {
            Class.forName("de.robv.android.xposed.XposedBridge");
            c0179 = new C0175();
        } catch (Throwable th) {
            c0179 = new C0179();
        }
        f421 = c0179;
    }

    /* renamed from: ۬ */
    public static void m87(Object... objArr) {
        String m85 = m85(objArr);
        if (m85 != null) {
            f421.mo91(Constants.TAG.value + m86(), m85);
        }
    }

    /* renamed from: ́ */
    public static void m84(Object... objArr) {
        String m85 = m85(objArr);
        if (m85 != null) {
            f421.mo90(Constants.TAG.value + m86(), m85);
        }
    }

    /* renamed from: ۦ */
    private static String m85(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            try {
                try {
                    for (Object obj : objArr) {
                        try {
                            if (obj instanceof Exception) {
                                sb.append(Log.getStackTraceString((Exception) obj));
                                if (objArr.length != 1) {
                                    sb.append("\t");
                                }
                            } else if (obj instanceof Error) {
                                sb.append(Log.getStackTraceString((Error) obj));
                                if (objArr.length != 1) {
                                    sb.append("\t");
                                }
                            } else {
                                sb.append(String.valueOf(obj));
                                if (objArr.length != 1) {
                                    sb.append("\t");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (OutOfMemoryError e3) {
                e3.printStackTrace();
                System.gc();
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: ۬ */
    private static String m86() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String replaceAll = stackTraceElement.getClassName().replaceAll("\\$.+", "");
        return " [" + stackTraceElement.getMethodName() + "](" + replaceAll.substring(replaceAll.lastIndexOf(46) + 1) + ".java:" + stackTraceElement.getLineNumber() + ")";
    }
}
