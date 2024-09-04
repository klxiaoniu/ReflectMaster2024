package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: 　۬ */
/* loaded from: classes.dex */
public final class C0027 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f403;

    public C0027(Main main) {
        this.f403 = main;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f403.f3.edit().putBoolean(Constants.XZWJX.value, z).apply();
    }
}
