package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: 6QCUV5VTCVGI[ */
/* renamed from: 　ۦ　　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC0163 extends Handler implements InterfaceC0189 {

    /* renamed from: ́ */
    private volatile Queue<CharSequence> f398;

    /* renamed from: ۥ */
    private Context f399;

    /* renamed from: ۦ */
    private volatile boolean f400;

    /* renamed from: ۬ */
    Timer f401;

    /* renamed from: 　　 */
    public Toast f402;

    public HandlerC0163(Context context) {
        super(Looper.getMainLooper());
        this.f401 = null;
        this.f399 = context;
        this.f398 = new ArrayBlockingQueue(5);
    }

    @Override // p000.InterfaceC0189
    /* renamed from: ۬ */
    public final void mo82(Toast toast) {
        this.f402 = toast;
    }

    @Override // p000.InterfaceC0189
    /* renamed from: ۬ */
    public final void mo83(CharSequence charSequence) {
        if ((this.f398.isEmpty() || !this.f398.contains(charSequence)) && !this.f398.offer(charSequence)) {
            this.f398.poll();
            this.f398.offer(charSequence);
        }
        if (!this.f400) {
            this.f400 = true;
            sendEmptyMessageDelayed(1, 200L);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                CharSequence peek = this.f398.peek();
                if (peek != null) {
                    if (this.f402 == null) {
                        Toast.makeText(this.f399, peek, 1).show();
                        return;
                    }
                    this.f402.setText(peek);
                    this.f402.setDuration(m80(peek));
                    if (this.f401 == null) {
                        this.f401 = new Timer();
                    }
                    this.f401.schedule(new C0162(this), 0L, 3000L);
                    sendEmptyMessageDelayed(2, m80(peek) + 200);
                    return;
                }
                sendEmptyMessage(3);
                this.f400 = false;
                return;
            case 2:
                this.f398.poll();
                if (!this.f398.isEmpty()) {
                    sendEmptyMessage(1);
                    return;
                } else {
                    sendEmptyMessage(3);
                    this.f400 = false;
                    return;
                }
            default:
                this.f400 = false;
                if (this.f401 != null) {
                    this.f401.cancel();
                    this.f401.purge();
                    this.f401 = null;
                }
                if (this.f398 != null) {
                    this.f398.clear();
                }
                if (this.f402 != null) {
                    this.f402.cancel();
                    return;
                }
                return;
        }
    }

    /* renamed from: ́ */
    private static int m80(CharSequence charSequence) {
        int length = charSequence.length();
        if (length > 40 && length < 80) {
            return 4200;
        }
        if (length < 80) {
            return 2500;
        }
        return 5200;
    }
}
