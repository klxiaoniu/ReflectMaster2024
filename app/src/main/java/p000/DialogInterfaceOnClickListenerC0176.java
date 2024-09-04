package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;

/* compiled from: 1PNKPG&KCNQI */
/* renamed from: 　　́ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0176 implements DialogInterface.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ AsyncTaskC0177 f427;

    /* renamed from: ۬ */
    final /* synthetic */ String f428;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0176(AsyncTaskC0177 asyncTaskC0177, String str) {
        this.f427 = asyncTaskC0177;
        this.f428 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity;
        activity = AsyncTaskC0177.f431;
        ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("OnlineDialog", this.f428));
    }
}
