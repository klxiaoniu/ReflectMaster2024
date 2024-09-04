package p000;

import android.app.Activity;
import com.qingyu.rm.reflect.XposedEntry;
import com.qingyu.rm.reflect.data.Constants;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　　　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0192 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f479;

    public C0192(XposedEntry xposedEntry) {
        this.f479 = xposedEntry;
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.afterHookedMethod(methodHookParam);
        Constants.context = (Activity) methodHookParam.thisObject;
        C0170.m87("hook Activity[onResume] succeed");
    }
}
