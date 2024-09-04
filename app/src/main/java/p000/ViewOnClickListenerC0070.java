package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.qingyu.rm.util.ToastUtils;

/* compiled from: +OCIG8KGY+ORN */
/* renamed from: ́۬ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0070 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0071 f166;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f167;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0070(C0071 c0071, C0063 c0063) {
        this.f166 = c0071;
        this.f167 = c0063;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Drawable drawable = ((ImageView) this.f167.f259).getDrawable();
        if (drawable == null) {
            ToastUtils.show("null...");
        } else {
            new C0085(this.f167.f259, drawable);
        }
    }
}
