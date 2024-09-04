package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: 　　 */
/* loaded from: classes.dex */
public final class C0028 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f420;

    public C0028(Main main) {
        this.f420 = main;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f420.f3.edit().putBoolean(Constants.FJYXP.value, z).apply();
    }
}
