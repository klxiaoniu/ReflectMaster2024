package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: #EVKQP$CT8KGY */
/* renamed from: 　۬ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0166 implements View.OnTouchListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0167 f407;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC0166(C0167 c0167) {
        this.f407 = c0167;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f407.f409 = (int) motionEvent.getRawX();
                this.f407.f418 = (int) motionEvent.getRawY();
                return false;
            case 1:
            default:
                return false;
            case 2:
                this.f407.f417 = (int) motionEvent.getRawX();
                this.f407.f414 = (int) motionEvent.getRawY();
                this.f407.f408.x += this.f407.f417 - this.f407.f409;
                this.f407.f408.y += this.f407.f414 - this.f407.f418;
                this.f407.f409 = this.f407.f417;
                this.f407.f418 = this.f407.f414;
                this.f407.f412.updateViewLayout(this.f407.f410, this.f407.f408);
                return false;
        }
    }
}
