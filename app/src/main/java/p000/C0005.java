package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: ́ */
/* loaded from: classes.dex */
public final class C0005 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f123;

    public C0005(Main main) {
        this.f123 = main;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f123.f3.edit().putBoolean(Constants.XSJD.value, z).apply();
    }
}
