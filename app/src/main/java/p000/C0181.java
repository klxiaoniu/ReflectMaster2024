package p000;

import android.app.Activity;
import com.qingyu.rm.reflect.XposedEntry;
import com.qingyu.rm.reflect.data.Constants;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0181 extends XC_MethodHook {

    /* renamed from: ́ */
    final /* synthetic */ XposedEntry f436;

    /* renamed from: ۬ */
    final /* synthetic */ XC_LoadPackage.LoadPackageParam f437;

    public C0181(XposedEntry xposedEntry, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f436 = xposedEntry;
        this.f437 = loadPackageParam;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.afterHookedMethod(methodHookParam);
        if (((Integer) methodHookParam.args[0]).intValue() == 25) {
            Constants.context = (Activity) methodHookParam.thisObject;
            new C0097(this.f437, methodHookParam);
            C0170.m87("hook Activity[onKeyDown] succeed");
        }
    }
}
