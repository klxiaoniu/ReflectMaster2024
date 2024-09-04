package p000;

import android.widget.Toast;
import java.util.TimerTask;

/* compiled from: 6QCUV5VTCVGI[ */
/* renamed from: 　ۦ　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0162 extends TimerTask {

    /* renamed from: ۬ */
    final /* synthetic */ HandlerC0163 f397;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0162(HandlerC0163 handlerC0163) {
        this.f397 = handlerC0163;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Toast toast;
        toast = this.f397.f402;
        toast.show();
    }
}
