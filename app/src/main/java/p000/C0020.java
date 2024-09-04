package p000;

import android.app.Activity;
import com.qingyu.rm.reflect.XposedEntry;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: ۬ۥ */
/* loaded from: classes.dex */
public final class C0020 extends XC_MethodHook {

    /* renamed from: ́ */
    final /* synthetic */ XposedEntry f296;

    /* renamed from: ۬ */
    final /* synthetic */ XC_LoadPackage.LoadPackageParam f297;

    public C0020(XposedEntry xposedEntry, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f296 = xposedEntry;
        this.f297 = loadPackageParam;
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.afterHookedMethod(methodHookParam);
        Object obj = methodHookParam.thisObject;
        C0170.m87(this.f297.packageName + " hooked：" + obj.getClass().getSimpleName());
        Constants.context = (Activity) obj;
        ToastUtils.init(((Activity) obj).getApplicationContext());
        new C0097(this.f297, methodHookParam);
        C0170.m87("hook Activity[onCreate] succeed");
    }
}
