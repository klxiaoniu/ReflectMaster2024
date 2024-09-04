package p000;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: 'FKV(KGNF9KPFQY */
/* renamed from: ́̀　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0058 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0066 f131;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f132;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0058(C0066 c0066, EditText editText) {
        this.f131 = c0066;
        this.f132 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new AlertDialog.Builder(this.f132.getContext()).setItems(new String[]{"true", "false"}, new DialogInterfaceOnClickListenerC0057(this)).create().show();
    }
}
