package p000;

import android.content.DialogInterface;

/* compiled from: /CKP */
/* renamed from: ́ۦ */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0008 implements DialogInterface.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ AsyncTaskC0006 f148;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0008(AsyncTaskC0006 asyncTaskC0006) {
        this.f148 = asyncTaskC0006;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f148.cancel(false);
    }
}
