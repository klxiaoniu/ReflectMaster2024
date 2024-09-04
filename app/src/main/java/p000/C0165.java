package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: #EVKQP$CT8KGY */
/* renamed from: 　۬ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0165 implements TextWatcher {

    /* renamed from: ́ */
    final /* synthetic */ C0167 f405;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f406;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0165(C0167 c0167, EditText editText) {
        this.f405 = c0167;
        this.f406 = editText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f405.f416 != null) {
            this.f405.f416.mo25(editable.toString());
        }
    }
}
