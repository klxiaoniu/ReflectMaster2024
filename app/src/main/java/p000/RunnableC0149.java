package p000;

import android.view.animation.Animation;
import com.qingyu.rm.widget.SwipeRefreshLayout;

/* compiled from: 5YKRG4GHTGUJ.C[QWV */
/* renamed from: 　ۦ́　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0149 implements Runnable {

    /* renamed from: ۬ */
    final /* synthetic */ SwipeRefreshLayout f367;

    public RunnableC0149(SwipeRefreshLayout swipeRefreshLayout) {
        this.f367 = swipeRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Animation.AnimationListener animationListener;
        SwipeRefreshLayout.m14(this.f367, true);
        SwipeRefreshLayout swipeRefreshLayout = this.f367;
        i = this.f367.f47;
        int paddingTop = i + this.f367.getPaddingTop();
        animationListener = this.f367.f51;
        SwipeRefreshLayout.m13(swipeRefreshLayout, paddingTop, animationListener);
    }
}
