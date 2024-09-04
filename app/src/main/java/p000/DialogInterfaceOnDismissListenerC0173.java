package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;

/* compiled from: &KCNQI/UI */
/* renamed from: 　　̀　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0173 implements DialogInterface.OnDismissListener {

    /* renamed from: ۬ */
    final /* synthetic */ HandlerC0184 f425;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnDismissListenerC0173(HandlerC0184 handlerC0184) {
        this.f425 = handlerC0184;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        HandlerC0184.m108(this.f425, (String) null);
        HandlerC0184.m101(this.f425, (String) null);
        this.f425.f444 = false;
        HandlerC0184.m105(this.f425, (AlertDialog) null);
        HandlerC0184.m106(this.f425, (TextView) null);
    }
}
