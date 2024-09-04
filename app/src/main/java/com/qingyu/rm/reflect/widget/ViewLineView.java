package com.qingyu.rm.reflect.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000.InterfaceC0099;

/* loaded from: classes.dex */
public class ViewLineView extends View implements View.OnTouchListener {

    /* renamed from: ́ */
    InterfaceC0099 f16;

    /* renamed from: ۥ */
    List<View> f17;

    /* renamed from: ۦ */
    Context f18;

    /* renamed from: ۬ */
    long f19;

    /* renamed from: 　۬ */
    int[] f20;

    /* renamed from: 　　 */
    Paint f21;

    public ViewLineView(Context context, List<View> list) {
        super(context);
        this.f20 = new int[2];
        this.f18 = context;
        this.f17 = list;
        setOnTouchListener(this);
        this.f21 = new Paint();
        this.f21.setStyle(Paint.Style.STROKE);
        this.f21.setColor(-16776961);
        setBackgroundColor(Color.argb(0, 0, 0, 0));
    }

    public void setListener(InterfaceC0099 interfaceC0099) {
        this.f16 = interfaceC0099;
    }

    public InterfaceC0099 getListener() {
        return this.f16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        return true;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f19 = System.currentTimeMillis();
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis() - this.f19;
                if (currentTimeMillis < 1000) {
                    if (this.f16 != null) {
                        Rect rect = new Rect();
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = ((int) motionEvent.getRawY()) - getStatusBarHeight();
                        ArrayList arrayList = new ArrayList();
                        for (int size = this.f17.size() - 1; size >= 0; size--) {
                            View view2 = this.f17.get(size);
                            view2.getLocationOnScreen(this.f20);
                            rect.left = this.f20[0];
                            rect.top = this.f20[1] - getStatusBarHeight();
                            rect.right = this.f20[0] + view2.getWidth();
                            rect.bottom = (this.f20[1] + view2.getHeight()) - getStatusBarHeight();
                            if (rawX >= rect.left && rawX <= rect.right && rawY >= rect.top && rawY <= rect.bottom) {
                                arrayList.add(view2);
                            }
                        }
                        this.f16.mo29(arrayList);
                        break;
                    }
                } else if (currentTimeMillis > 80 && this.f16 != null) {
                    this.f16.mo28();
                    break;
                }
                break;
        }
        return true;
        //todo check this
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (View view : this.f17) {
            if (view instanceof ViewGroup) {
                this.f21.setColor(-16776961);
            } else {
                this.f21.setColor(-65536);
            }
            Rect rect = new Rect();
            view.getLocationOnScreen(this.f20);
            rect.left = this.f20[0];
            rect.top = this.f20[1] - getStatusBarHeight();
            rect.right = this.f20[0] + view.getWidth();
            rect.bottom = (view.getHeight() + this.f20[1]) - getStatusBarHeight();
            canvas.drawRect(rect, this.f21);
        }
        super.onDraw(canvas);
    }

    private int getStatusBarHeight() {
        Resources resources = this.f18.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
