package p000;

import android.view.animation.Animation;
import com.qingyu.rm.widget.SwipeRefreshLayout;

/* compiled from: 5YKRG4GHTGUJ.C[QWV */
/* renamed from: 　ۦ̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0141 extends AnimationAnimationListenerC0145 {

    /* renamed from: ۬ */
    final /* synthetic */ SwipeRefreshLayout f357;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141(SwipeRefreshLayout swipeRefreshLayout) {
        super(swipeRefreshLayout, (byte) 0);
        this.f357 = swipeRefreshLayout;
    }

    @Override // p000.AnimationAnimationListenerC0145, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout.m5(this.f357, 0);
    }
}
