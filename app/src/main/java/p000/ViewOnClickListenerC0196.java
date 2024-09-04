package p000;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /GVJQF9KPFQY */
/* renamed from: 　　　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0196 implements View.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0123 f492;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0196(C0123 c0123) {
        this.f492 = c0123;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = (EditText) view;
        new AlertDialog.Builder(editText.getContext()).setItems(new String[]{"true", "false"}, new DialogInterfaceOnClickListenerC0193(this, editText)).create().show();
    }
}
