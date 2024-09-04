package p000;

import android.content.DialogInterface;

/* compiled from: 4GCF&GZ6CUM */
/* renamed from: ۬　ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0125 implements DialogInterface.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ AsyncTaskC0126 f325;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0125(AsyncTaskC0126 asyncTaskC0126) {
        this.f325 = asyncTaskC0126;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f325.cancel(false);
    }
}
