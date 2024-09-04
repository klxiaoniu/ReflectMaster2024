package p000;

import com.qingyu.rm.widget.FloatView;

/* compiled from: (NQCV8KGY */
/* renamed from: 　ۦۦ　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0156 implements Runnable {

    /* renamed from: ۬ */
    final /* synthetic */ FloatView f389;

    public RunnableC0156(FloatView floatView) {
        this.f389 = floatView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f389.f37++;
        this.f389.invalidate();
    }
}
