package p000;

import com.qingyu.rm.reflect.XposedEntry;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　ۦ۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0157 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f390;

    public C0157(XposedEntry xposedEntry) {
        this.f390 = xposedEntry;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        if (methodHookParam.args != null && methodHookParam.args[0] != null && methodHookParam.args[0].toString().startsWith("de.robv.android.xposed.")) {
            methodHookParam.args[0] = "reflectmaster.anti.";
        }
        super.beforeHookedMethod(methodHookParam);
    }
}
