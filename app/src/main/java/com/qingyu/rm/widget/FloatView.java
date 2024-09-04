package com.qingyu.rm.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import p000.C0152;
import p000.C0155;
import p000.RunnableC0156;

/* loaded from: classes.dex */
public class FloatView extends View {

    /* renamed from: ۬ */
    public static int f29 = 138;

    /* renamed from: ́ */
    boolean f30;

    /* renamed from: ۥ */
    C0155 f31;

    /* renamed from: ۦ */
    C0155 f32;

    /* renamed from: ۦ۬ */
    private Paint f33;

    /* renamed from: ۦ　 */
    int f34;

    /* renamed from: ۬́ */
    int f35;

    /* renamed from: ۬ۦ */
    private int f36;

    /* renamed from: ۬۬ */
    public int f37;

    /* renamed from: ۬　 */
    public long f38;

    /* renamed from: 　́ */
    C0155 f39;

    /* renamed from: 　ۥ */
    int f40;

    /* renamed from: 　ۦ */
    C0155 f41;

    /* renamed from: 　۬ */
    C0155 f42;

    /* renamed from: 　　 */
    C0155 f43;

    public FloatView(Context context, boolean z) {
        super(context);
        this.f36 = 1460;
        this.f40 = f29 / 2;
        this.f34 = f29 / 2;
        this.f38 = 83L;
        this.f37 = 0;
        this.f35 = 0;
        this.f30 = z;
        m2();
    }

    public boolean getRotate() {
        return this.f30;
    }

    public void setRotate(boolean z) {
        this.f30 = z;
    }

    /* renamed from: ۬ */
    private void m2() {
        this.f33 = new Paint();
        this.f33.setStrokeWidth(6.0f);
        this.f33.setColor(-65536);
        this.f33.setStyle(Paint.Style.STROKE);
        int i = f29 / 2;
        int i2 = f29 / 4;
        int i3 = (int) ((i / 2) * 1.732d);
        this.f32 = new C0155(this, this.f40, 0);
        this.f31 = new C0155(this, i - i3, i2);
        this.f43 = new C0155(this, i - i3, i2 * 3);
        this.f42 = new C0155(this, this.f40, f29);
        this.f39 = new C0155(this, this.f40 + i3, i2 * 3);
        this.f41 = new C0155(this, i3 + this.f40, i2);
        for (int i4 = 0; i4 < 7; i4++) {
            postDelayed(new RunnableC0156(this), i4 * 166);
        }
        if (this.f30) {
            new C0152(this).start();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f36;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        }
        int i4 = this.f36;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30) {
            if (this.f35 >= 360) {
                this.f35 = 0;
            }
            if (this.f37 >= 6) {
                canvas.rotate(this.f35, this.f40, this.f34);
                this.f35 += 10;
            }
        }
        canvas.drawARGB(0, 255, 255, 255);
        canvas.drawCircle(this.f40, this.f34, f29 / 2, this.f33);
        canvas.drawCircle(this.f40, this.f34, (f29 / 2) - 9, this.f33);
        if (this.f37 >= 0) {
            canvas.drawLine(this.f32.f388, this.f32.f386, this.f43.f388, this.f43.f386, this.f33);
        }
        if (this.f37 > 0) {
            canvas.drawLine(this.f43.f388, this.f43.f386, this.f39.f388, this.f39.f386, this.f33);
        }
        if (this.f37 >= 2) {
            canvas.drawLine(this.f32.f388, this.f32.f386, this.f39.f388, this.f39.f386, this.f33);
        }
        if (this.f37 >= 3) {
            canvas.drawLine(this.f31.f388, this.f31.f386, this.f42.f388, this.f42.f386, this.f33);
        }
        if (this.f37 >= 4) {
            canvas.drawLine(this.f42.f388, this.f42.f386, this.f41.f388, this.f41.f386, this.f33);
        }
        if (this.f37 >= 5) {
            canvas.drawLine(this.f41.f388, this.f41.f386, this.f31.f388, this.f31.f386, this.f33);
        }
    }
}
