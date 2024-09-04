package p000;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.qingyu.rm.widget.SwipeRefreshLayout;

/* compiled from: 5YKRG4GHTGUJ.C[QWV */
/* renamed from: 　ۦ́۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0148 implements Runnable {

    /* renamed from: ۬ */
    final /* synthetic */ SwipeRefreshLayout f366;

    public RunnableC0148(SwipeRefreshLayout swipeRefreshLayout) {
        this.f366 = swipeRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0153 c0153;
        int i;
        Animation.AnimationListener animationListener;
        float f;
        Animation animation;
        int i2;
        Animation animation2;
        Animation.AnimationListener animationListener2;
        Animation animation3;
        Animation animation4;
        DecelerateInterpolator decelerateInterpolator;
        Animation animation5;
        SwipeRefreshLayout.m14(this.f366, true);
        c0153 = this.f366.f58;
        if (c0153 != null) {
            SwipeRefreshLayout swipeRefreshLayout = this.f366;
            f = this.f366.f63;
            swipeRefreshLayout.f55 = f;
            animation = this.f366.f60;
            i2 = this.f366.f53;
            animation.setDuration(i2);
            animation2 = this.f366.f60;
            animationListener2 = this.f366.f50;
            animation2.setAnimationListener(animationListener2);
            animation3 = this.f366.f60;
            animation3.reset();
            animation4 = this.f366.f60;
            decelerateInterpolator = this.f366.f62;
            animation4.setInterpolator(decelerateInterpolator);
            SwipeRefreshLayout swipeRefreshLayout2 = this.f366;
            animation5 = this.f366.f60;
            swipeRefreshLayout2.startAnimation(animation5);
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f366;
        i = this.f366.f47;
        int paddingTop = i + this.f366.getPaddingTop();
        animationListener = this.f366.f51;
        SwipeRefreshLayout.m13(swipeRefreshLayout3, paddingTop, animationListener);
    }
}
