package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ۦ۬ */
/* loaded from: classes.dex */
public final class C0016 implements TextWatcher {

    /* renamed from: ۬ */
    final /* synthetic */ Main f231;

    public C0016(Main main) {
        this.f231 = main;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f231.f8 != null) {
            this.f231.f8.getFilter().filter(editable.toString().trim());
        }
    }
}
