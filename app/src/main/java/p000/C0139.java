package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.qingyu.rm.widget.SwipeRefreshLayout;

/* compiled from: 5YKRG4GHTGUJ.C[QWV */
/* renamed from: 　ۦ̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0139 extends Animation {

    /* renamed from: ۬ */
    final /* synthetic */ SwipeRefreshLayout f355;

    public C0139(SwipeRefreshLayout swipeRefreshLayout) {
        this.f355 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2;
        float f3;
        C0153 c0153;
        f2 = this.f355.f55;
        f3 = this.f355.f55;
        c0153 = this.f355.f58;
        c0153.f374 = f2 + ((0.0f - f3) * f);
        c0153.f384 = 0L;
        c0153.f377.postInvalidateDelayed(10L);
    }
}
