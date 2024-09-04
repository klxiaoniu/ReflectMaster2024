package p000;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ̀ۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0039 implements View.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0097 f95;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0039(C0097 c0097) {
        this.f95 = c0097;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f95.f246 != null) {
            this.f95.f246.setRotate(!this.f95.f246.getRotate());
        }
    }
}
