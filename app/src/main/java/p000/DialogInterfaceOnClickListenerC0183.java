package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;

/* compiled from: &KCNQI/UI */
/* renamed from: 　　ۦۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0183 implements DialogInterface.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ HandlerC0184 f439;

    /* renamed from: ۬ */
    final /* synthetic */ Context f440;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0183(HandlerC0184 handlerC0184, Context context) {
        this.f439 = handlerC0184;
        this.f440 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.CharSequence] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        TextView textView;
        String str2;
        InterfaceC0169 interfaceC0169;
        InterfaceC0169 interfaceC01692;
        TextView textView2;
        str = this.f439.f447;
        textView = this.f439.f445;
        if (textView != null) {
            textView2 = this.f439.f445;
            str2 = textView2.getText().toString();
        } else {
            str2 = str;
        }
        interfaceC0169 = this.f439.f442;
        if (interfaceC0169 != null) {
            interfaceC01692 = this.f439.f442;
            interfaceC01692.mo38();
        } else {
            ((ClipboardManager) this.f440.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("DialogUtil", str2));
        }
    }
}
