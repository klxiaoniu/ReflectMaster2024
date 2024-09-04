package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ̀　́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0049 implements View.OnTouchListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0097 f116;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC0049(C0097 c0097) {
        this.f116 = c0097;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f116.f249 = (int) motionEvent.getRawX();
                this.f116.f248 = (int) motionEvent.getRawY();
                this.f116.m43(false);
                return true;
            default:
                return true;
        }
    }
}
