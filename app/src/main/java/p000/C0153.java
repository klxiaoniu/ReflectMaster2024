package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: 5YKRG2TQITGUU$CT */
/* renamed from: 　ۦۦۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0153 {

    /* renamed from: ۬ */
    public static final Interpolator f372 = InterpolatorC0143.m64();

    /* renamed from: ۥ */
    public float f374;

    /* renamed from: ۦ۬ */
    public View f377;

    /* renamed from: 　́ */
    public boolean f380;

    /* renamed from: 　۬ */
    public long f383;

    /* renamed from: 　　 */
    public long f384;

    /* renamed from: ́ */
    public final Paint f373 = new Paint();

    /* renamed from: ۦ */
    public final RectF f375 = new RectF();

    /* renamed from: ۦ́ */
    public Rect f376 = new Rect();

    /* renamed from: 　ۦ */
    public int f382 = -1291845632;

    /* renamed from: 　ۥ */
    public int f381 = Integer.MIN_VALUE;

    /* renamed from: ۬　 */
    public int f379 = 1291845632;

    /* renamed from: ۦ　 */
    public int f378 = 436207616;

    public C0153(View view) {
        this.f377 = view;
    }

    /* renamed from: ۬ */
    public void m66(Canvas canvas, float f, float f2, int i, float f3) {
        this.f373.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f372.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f373);
        canvas.restore();
    }
}
