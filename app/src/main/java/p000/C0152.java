package p000;

import com.qingyu.rm.widget.FloatView;

/* compiled from: (NQCV8KGY */
/* renamed from: 　ۦۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0152 extends Thread {

    /* renamed from: ۬ */
    final /* synthetic */ FloatView f371;

    public C0152(FloatView floatView) {
        this.f371 = floatView;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            if (this.f371.f37 >= 6) {
                this.f371.post(new RunnableC0154(this));
            }
            try {
                sleep(this.f371.f38);
            } catch (InterruptedException e) {
            }
        }
    }
}
