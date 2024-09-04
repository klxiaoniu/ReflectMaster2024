package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ۦ۬ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0095 implements View.OnTouchListener {

    /* renamed from: ́ */
    int f233;

    /* renamed from: ۦ */
    final /* synthetic */ C0097 f234;

    /* renamed from: ۬ */
    int f235;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC0095(C0097 c0097) {
        this.f234 = c0097;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f234.f249 = (int) motionEvent.getRawX();
                this.f234.f248 = (int) motionEvent.getRawY();
                this.f235 = this.f234.f249;
                this.f233 = this.f234.f248;
                return true;
            case 1:
                this.f234.f243 = (int) motionEvent.getRawX();
                this.f234.f242 = (int) motionEvent.getRawY();
                if (Math.sqrt(Math.pow(Math.abs(this.f234.f243 - this.f235), 2.0d) + Math.pow(Math.abs(this.f234.f242 - this.f233), 2.0d)) >= 170.0d) {
                    return true;
                }
                this.f234.m43(false);
                return true;
            case 2:
                this.f234.f243 = (int) motionEvent.getRawX();
                this.f234.f242 = (int) motionEvent.getRawY();
                this.f234.f250.x += this.f234.f243 - this.f234.f249;
                this.f234.f250.y += this.f234.f242 - this.f234.f248;
                this.f234.f251.updateViewLayout(this.f234.f246, this.f234.f250);
                this.f234.f249 = this.f234.f243;
                this.f234.f248 = this.f234.f242;
                return true;
            default:
                return true;
        }
    }
}
