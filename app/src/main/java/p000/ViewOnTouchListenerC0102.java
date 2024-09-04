package p000;

import android.view.MotionEvent;
import android.view.View;

import com.qingyu.rm.util.ToastUtils;

/* compiled from: #EVKQP$CT8KGY */
/* renamed from: ۦ　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnTouchListenerC0102 implements View.OnTouchListener {

    /* renamed from: ́ */
    final /* synthetic */ C0167 f274;

    /* renamed from: ۬ */
    boolean f275;

    public ViewOnTouchListenerC0102(C0167 c0167, boolean z) {
        this.f274 = c0167;
        this.f275 = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f274.f409 = (int) motionEvent.getRawX();
                this.f274.f418 = (int) motionEvent.getRawY();
                return false;
            case 1:
                ToastUtils.show(this.f274.f408.width + "x" + this.f274.f408.height);
                return false;
            case 2:
                this.f274.f417 = (int) motionEvent.getRawX();
                this.f274.f414 = (int) motionEvent.getRawY();
                this.f274.f408.width += this.f274.f417 - this.f274.f409;
                this.f274.f408.height += this.f274.f414 - this.f274.f418;
                if (this.f274.f408.width <= 200) {
                    this.f274.f408.width = 200;
                }
                if (this.f274.f408.height <= 200) {
                    this.f274.f408.height = 200;
                }
                this.f274.f409 = this.f274.f417;
                this.f274.f418 = this.f274.f414;
                this.f274.f412.updateViewLayout(this.f274.f410, this.f274.f408);
                return false;
            default:
                return false;
        }
    }
}
