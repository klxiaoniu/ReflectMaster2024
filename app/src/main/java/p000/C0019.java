package p000;

import android.app.Application;
import com.qingyu.rm.reflect.XposedEntry;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.CrashHandler;
import com.qingyu.rm.util.ToastUtils;

import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: ۬́ */
/* loaded from: classes.dex */
public final class C0019 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f287;

    public C0019(XposedEntry xposedEntry) {
        this.f287 = xposedEntry;
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Application application = (Application) methodHookParam.thisObject;
        ToastUtils.init(application);
        if (Constants.getSP().getBoolean("crash", false)) {
            CrashHandler.init(application);
        }
        C0170.m87("hook Application[onCreate] succeed");
    }
}
