package p000;

import android.view.View;
import android.widget.EditText;

/* compiled from: 'FKV(KGNF9KPFQY */
/* renamed from: ́̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnLongClickListenerC0054 implements View.OnLongClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0066 f124;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f125;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLongClickListenerC0054(C0066 c0066, EditText editText) {
        this.f124 = c0066;
        this.f125 = editText;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f124.m48(this.f125);
        return true;
    }
}
