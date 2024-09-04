package p000;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0047 implements DialogInterface.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0048 f112;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f113;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0047(ViewOnClickListenerC0048 viewOnClickListenerC0048, EditText editText) {
        this.f112 = viewOnClickListenerC0048;
        this.f113 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f113.setText(i == 0 ? "true" : "false");
    }
}
