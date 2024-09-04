package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.qingyu.rm.widget.SwipeRefreshLayout;

/* compiled from: 5YKRG4GHTGUJ.C[QWV */
/* renamed from: 　ۦ̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0142 extends Animation {

    /* renamed from: ۬ */
    final /* synthetic */ SwipeRefreshLayout f358;

    public C0142(SwipeRefreshLayout swipeRefreshLayout) {
        this.f358 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        int i2;
        View view;
        View view2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        i = this.f358.f66;
        i2 = this.f358.f68;
        if (i != i2) {
            i3 = this.f358.f66;
            i4 = this.f358.f68;
            i5 = this.f358.f66;
            i6 = i3 + ((int) ((i4 - i5) * f));
        }
        view = this.f358.f52;
        int top = i6 - view.getTop();
        view2 = this.f358.f52;
        int top2 = view2.getTop();
        if (top + top2 < 0) {
            top = 0 - top2;
        }
        this.f358.setTargetOffsetTopAndBottom(top);
    }
}
