package com.qingyu.rm.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import p000.C0139;
import p000.C0140;
import p000.C0141;
import p000.C0142;
import p000.C0153;
import p000.InterfaceC0147;
import p000.RunnableC0148;
import p000.RunnableC0149;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup {

    /* renamed from: ۦ */
    private static final int[] f44 = {R.attr.enabled};

    /* renamed from: ̀́ */
    private final Runnable f45;

    /* renamed from: ̀۬ */
    private boolean f46;

    /* renamed from: ̀　 */
    public int f47;

    /* renamed from: ́ */
    public boolean f48;

    /* renamed from: ́́ */
    private final Runnable f49;

    /* renamed from: ́۬ */
    public final Animation.AnimationListener f50;

    /* renamed from: ́　 */
    public final Animation.AnimationListener f51;

    /* renamed from: ۥ */
    public View f52;

    /* renamed from: ۦ́ */
    public int f53;

    /* renamed from: ۦۥ */
    private int f54;

    /* renamed from: ۦۦ */
    public float f55;

    /* renamed from: ۦ۬ */
    private float f56;

    /* renamed from: ۦ　 */
    private float f57;

    /* renamed from: ۬ */
    public C0153 f58;

    /* renamed from: ۬́ */
    private final AccelerateInterpolator f59;

    /* renamed from: ۬ۥ */
    public Animation f60;

    /* renamed from: ۬ۦ */
    private final Animation f61;

    /* renamed from: ۬۬ */
    public final DecelerateInterpolator f62;

    /* renamed from: ۬　 */
    public float f63;

    /* renamed from: 　́ */
    private MotionEvent f64;

    /* renamed from: 　ۥ */
    private int f65;

    /* renamed from: 　ۦ */
    public int f66;

    /* renamed from: 　۬ */
    private InterfaceC0147 f67;

    /* renamed from: 　　 */
    public int f68;

    /* renamed from: ́ */
    public static /* synthetic */ int m5(SwipeRefreshLayout swipeRefreshLayout, int i) {
        swipeRefreshLayout.f47 = 0;
        return 0;
    }

    /* renamed from: ۬ */
    public static /* synthetic */ float m10(SwipeRefreshLayout swipeRefreshLayout, float f) {
        swipeRefreshLayout.f63 = 0.0f;
        return 0.0f;
    }

    /* renamed from: ۬ */
    public static /* synthetic */ boolean m14(SwipeRefreshLayout swipeRefreshLayout, boolean z) {
        swipeRefreshLayout.f46 = true;
        return true;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48 = false;
        this.f57 = -1.0f;
        this.f55 = 0.0f;
        this.f63 = 0.0f;
        this.f61 = new C0142(this);
        this.f60 = new C0139(this);
        this.f51 = new C0141(this);
        this.f50 = new C0140(this);
        this.f45 = new RunnableC0149(this);
        this.f49 = new RunnableC0148(this);
        this.f65 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f53 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f58 = new C0153(this);
        this.f54 = (int) (getResources().getDisplayMetrics().density * 4.0f);
        this.f62 = new DecelerateInterpolator(2.0f);
        this.f59 = new AccelerateInterpolator(1.5f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f44);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f49);
        removeCallbacks(this.f45);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f45);
        removeCallbacks(this.f49);
    }

    public void setOnRefreshListener(InterfaceC0147 interfaceC0147) {
        this.f67 = interfaceC0147;
    }

    private void setTriggerPercentage(float f) {
        if (f == 0.0f) {
            this.f63 = 0.0f;
            return;
        }
        this.f63 = f;
        C0153 c0153 = this.f58;
        c0153.f374 = f;
        c0153.f384 = 0L;
        c0153.f377.postInvalidateDelayed(10L);
    }

    public void setRefreshing(boolean z) {
        if (this.f48 != z) {
            m21();
            this.f63 = 0.0f;
            this.f48 = z;
            if (this.f48) {
                C0153 c0153 = this.f58;
                if (c0153.f380) {
                    return;
                }
                c0153.f374 = 0.0f;
                c0153.f384 = AnimationUtils.currentAnimationTimeMillis();
                c0153.f380 = true;
                c0153.f377.postInvalidate();
                return;
            }
            C0153 c01532 = this.f58;
            if (!c01532.f380) {
                return;
            }
            c01532.f374 = 0.0f;
            c01532.f383 = AnimationUtils.currentAnimationTimeMillis();
            c01532.f380 = false;
            c01532.f377.postInvalidate();
        }
    }

    /* renamed from: ۬ */
    public void m21() {
        if (this.f52 == null) {
            if (getChildCount() > 1 && !isInEditMode()) {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
            this.f52 = getChildAt(0);
            this.f68 = this.f52.getTop() + getPaddingTop();
        }
        if (this.f57 == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f57 = (int) Math.min(((View) getParent()).getHeight() * 0.6f, getResources().getDisplayMetrics().density * 120.0f);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        super.draw(canvas);
        C0153 c0153 = this.f58;
        int width = c0153.f376.width();
        int height = c0153.f376.height();
        int i2 = width / 2;
        int i3 = height / 2;
        int save = canvas.save();
        canvas.clipRect(c0153.f376);
        if (c0153.f380 || c0153.f383 > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - c0153.f384) % 2000;
            long j2 = (currentAnimationTimeMillis - c0153.f384) / 2000;
            float f = ((float) j) / 20.0f;
            if (c0153.f380) {
                z = false;
            } else {
                if (currentAnimationTimeMillis - c0153.f383 >= 1000) {
                    c0153.f383 = 0L;
                    return;
                }
                float interpolation = C0153.f372.getInterpolation((((float) ((currentAnimationTimeMillis - c0153.f383) % 1000)) / 10.0f) / 100.0f) * i2;
                c0153.f375.set(i2 - interpolation, 0.0f, interpolation + i2, height);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    canvas.saveLayerAlpha(c0153.f375, 0);
                } else {
                    canvas.saveLayerAlpha(c0153.f375, 0, 0);
                }
                z = true;
            }
            if (j2 == 0) {
                canvas.drawColor(c0153.f382);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(c0153.f378);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(c0153.f382);
            } else if (f >= 50.0f && f < 75.0f) {
                canvas.drawColor(c0153.f381);
            } else {
                canvas.drawColor(c0153.f379);
            }
            if (f >= 0.0f && f <= 25.0f) {
                c0153.m66(canvas, i2, i3, c0153.f382, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                c0153.m66(canvas, i2, i3, c0153.f381, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                c0153.m66(canvas, i2, i3, c0153.f379, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                c0153.m66(canvas, i2, i3, c0153.f378, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                c0153.m66(canvas, i2, i3, c0153.f382, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (c0153.f374 <= 0.0f || !z) {
                i = save;
            } else {
                canvas.restoreToCount(save);
                i = canvas.save();
                canvas.clipRect(c0153.f376);
                c0153.f373.setColor(c0153.f382);
                canvas.drawCircle(i2, i3, i2 * c0153.f374, c0153.f373);
            }
            c0153.f377.postInvalidateDelayed(10L);
            save = i;
        } else if (c0153.f374 > 0.0f && c0153.f374 <= 1.0d) {
            c0153.f373.setColor(c0153.f382);
            canvas.drawCircle(i2, i3, i2 * c0153.f374, c0153.f373);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C0153 c0153 = this.f58;
        int i5 = this.f54;
        c0153.f376.left = 0;
        c0153.f376.top = 0;
        c0153.f376.right = measuredWidth;
        c0153.f376.bottom = i5;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f47 + getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1 && !isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        }
        if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        m21();
        if (this.f46 && motionEvent.getAction() == 0) {
            this.f46 = false;
        }
        if (isEnabled() && !this.f46) {
            if (this.f52 instanceof AbsListView) {
                AbsListView absListView = (AbsListView) this.f52;
                z2 = absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
            } else {
                z2 = this.f52.getScrollY() > 0;
            }
            if (!z2) {
                z = onTouchEvent(motionEvent);
                return z ? super.onInterceptTouchEvent(motionEvent) : z;
            }
        }
//        z = false;
//        if (z) {
//        }
        return false;
        // todo check this
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f63 = 0.0f;
                this.f64 = MotionEvent.obtain(motionEvent);
                this.f56 = this.f64.getY();
                return false;
            case 1:
            case 3:
                if (this.f64 == null) {
                    return false;
                }
                this.f64.recycle();
                this.f64 = null;
                return false;
            case 2:
                if (this.f64 == null || this.f46) {
                    return false;
                }
                float y = motionEvent.getY();
                float y2 = y - this.f64.getY();
                if (y2 <= this.f65) {
                    return false;
                }
                if (y2 <= this.f57) {
                    setTriggerPercentage(this.f59.getInterpolation(y2 / this.f57));
                    if (this.f56 > y) {
                        y2 -= this.f65;
                    }
                    int i = (int) y2;
                    int top = this.f52.getTop();
                    if (i > this.f57) {
                        i = (int) this.f57;
                    } else if (i < 0) {
                        i = 0;
                    }
                    setTargetOffsetTopAndBottom(i - top);
                    if (this.f56 > y && this.f52.getTop() < this.f65) {
                        removeCallbacks(this.f49);
                    } else {
                        removeCallbacks(this.f49);
                        postDelayed(this.f49, 300L);
                    }
                    this.f56 = motionEvent.getY();
                    return true;
                }
                removeCallbacks(this.f49);
                this.f45.run();
                setRefreshing(true);
                this.f67.mo51();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f52.offsetTopAndBottom(i);
        this.f47 = this.f52.getTop();
    }

    /* renamed from: ۬ */
    public static /* synthetic */ void m13(SwipeRefreshLayout swipeRefreshLayout, int i, Animation.AnimationListener animationListener) {
        swipeRefreshLayout.f66 = i;
        swipeRefreshLayout.f61.reset();
        swipeRefreshLayout.f61.setDuration(swipeRefreshLayout.f53);
        swipeRefreshLayout.f61.setAnimationListener(animationListener);
        swipeRefreshLayout.f61.setInterpolator(swipeRefreshLayout.f62);
        swipeRefreshLayout.f52.startAnimation(swipeRefreshLayout.f61);
    }
}
