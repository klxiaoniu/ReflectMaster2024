package p000;

import com.qingyu.rm.reflect.XposedEntry;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　　ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0180 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f435;

    public C0180(XposedEntry xposedEntry) {
        this.f435 = xposedEntry;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str = (String) methodHookParam.args[0];
        if (str.equals("disableHooks") || str.equals("sHookedMethodCallbacks")) {
            methodHookParam.setThrowable(new NoSuchFieldException("disableHooks|sHookedMethodCallbacks"));
        }
    }
}
