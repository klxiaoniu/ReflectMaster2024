package p000;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* compiled from: %NCUU9KPFQY */
/* renamed from: ۦ̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class HandlerC0079 extends Handler {

    /* renamed from: ۬ */
    final /* synthetic */ RunnableC0082 f193;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC0079(RunnableC0082 runnableC0082) {
        this.f193 = runnableC0082;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        switch (message.what) {
            case 200:
                ArrayList arrayList = (ArrayList) message.obj;
                this.f193.f202 = new C0150(AbstractC0100.f255, arrayList);
                this.f193.f202.addAll(arrayList);
                this.f193.f201.setVisibility(8);
                this.f193.f203.setAdapter((ListAdapter) this.f193.f202);
                RunnableC0082 runnableC0082 = this.f193;
                linearLayout = this.f193.f198;
                AbstractC0100 m47 = runnableC0082.m47(linearLayout, this.f193.f204, null, null);
                linearLayout2 = this.f193.f198;
                m47.m47(linearLayout2, this.f193.f203, null, null);
                return;
            default:
                return;
        }
    }
}
