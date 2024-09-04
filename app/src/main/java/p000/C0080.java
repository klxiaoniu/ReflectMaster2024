package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: %NCUU9KPFQY */
/* renamed from: ۦ̀ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0080 implements TextWatcher {

    /* renamed from: ۬ */
    final /* synthetic */ RunnableC0082 f194;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0080(RunnableC0082 runnableC0082) {
        this.f194 = runnableC0082;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f194.f202.getFilter().filter(editable.toString());
    }
}
