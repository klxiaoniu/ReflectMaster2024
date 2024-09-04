package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: ۦ */
/* loaded from: classes.dex */
public final class C0012 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f192;

    public C0012(Main main) {
        this.f192 = main;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f192.f3.edit().putBoolean(Constants.XSXTYY.value, z).apply();
    }
}
