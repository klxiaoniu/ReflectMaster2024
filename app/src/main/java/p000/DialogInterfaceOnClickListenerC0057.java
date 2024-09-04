package p000;

import android.content.DialogInterface;

/* compiled from: 'FKV(KGNF9KPFQY */
/* renamed from: ́̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0057 implements DialogInterface.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ ViewOnClickListenerC0058 f130;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0057(ViewOnClickListenerC0058 viewOnClickListenerC0058) {
        this.f130 = viewOnClickListenerC0058;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f130.f132.setText(i == 0 ? "true" : "false");
    }
}
