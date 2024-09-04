package p000;

import com.qingyu.rm.reflect.XposedEntry;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　ۦ　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0158 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f391;

    public C0158(XposedEntry xposedEntry) {
        this.f391 = xposedEntry;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.beforeHookedMethod(methodHookParam);
        if (methodHookParam.args != null && methodHookParam.args[0] != null) {
            String lowerCase = methodHookParam.args[0].toString().toLowerCase();
            if (lowerCase.contains("xposedhelpers") || lowerCase.contains("xposedbridge")) {
                methodHookParam.setThrowable(new NoClassDefFoundError("XposedHelper|XposedBridge"));
            }
        }
    }
}
