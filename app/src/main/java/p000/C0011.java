package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: ۥ */
/* loaded from: classes.dex */
public final class C0011 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f191;

    public C0011(Main main) {
        this.f191 = main;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f191.f3.edit().putBoolean(Constants.BKRZSC.value, z).apply();
    }
}
