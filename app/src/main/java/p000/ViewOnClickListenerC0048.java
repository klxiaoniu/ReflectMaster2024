package p000;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀۬　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0048 implements View.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0030 f114;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0048(C0030 c0030) {
        this.f114 = c0030;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = (EditText) view;
        new AlertDialog.Builder(editText.getContext()).setItems(new String[]{"true", "false"}, new DialogInterfaceOnClickListenerC0047(this, editText)).create().show();
    }
}
