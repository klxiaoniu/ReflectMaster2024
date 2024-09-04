package p000;

import android.app.Dialog;
import android.content.Context;
import com.qingyu.rm.reflect.XposedEntry;
import com.qingyu.rm.reflect.data.Constants;
import de.robv.android.xposed.XC_MethodHook;

/* compiled from: :RQUGF'PVT[ */
/* renamed from: 　　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0187 extends XC_MethodHook {

    /* renamed from: ۬ */
    final /* synthetic */ XposedEntry f452;

    public C0187(XposedEntry xposedEntry) {
        this.f452 = xposedEntry;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        super.beforeHookedMethod(methodHookParam);
        if (((Integer) methodHookParam.args[0]).intValue() == 24) {
            Context context = Constants.context;
            Context context2 = context == null ? ((Dialog) methodHookParam.thisObject).getContext() : context;
            if (context2 != null) {
                new C0097(context2, (Dialog) methodHookParam.thisObject);
                C0170.m87("hook Dialog[onKeyUp] succeed");
            }
        }
    }
}
