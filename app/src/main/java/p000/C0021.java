package p000;

import com.qingyu.rm.reflect.XposedEntry;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: ۬ۦ */
/* loaded from: classes.dex */
public final class C0021 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f298;

    public C0021(XposedEntry xposedEntry) {
        this.f298 = xposedEntry;
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.afterHookedMethod(methodHookParam);
        if (methodHookParam.getResult() != null && ((String) methodHookParam.getResult()).toLowerCase().contains("xposed")) {
            methodHookParam.setResult("rm.anti.ReadLine");
        }
    }
}
