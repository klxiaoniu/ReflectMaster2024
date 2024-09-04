package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ̀ۦ　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0043 implements View.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0097 f99;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0043(C0097 c0097) {
        this.f99 = c0097;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ToastUtils.show("长按界面任意处退出");
        this.f99.f251.removeView(this.f99.f241);
        C0097 c0097 = this.f99;
        if (c0097.f247 != null) {
            c0097.m42(c0097.f247.getWindow(), false);
            return;
        }
        Context context = Constants.context;
        if (context instanceof Activity) {
            c0097.m42(((Activity) context).getWindow(), false);
        }
    }
}
