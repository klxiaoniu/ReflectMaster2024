package p000;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: 　　　́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0193 implements DialogInterface.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0196 f480;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f481;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0193(ViewOnClickListenerC0196 viewOnClickListenerC0196, EditText editText) {
        this.f480 = viewOnClickListenerC0196;
        this.f481 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f481.setText(i == 0 ? "true" : "false");
    }
}
