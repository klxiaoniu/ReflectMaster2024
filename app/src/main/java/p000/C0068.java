package p000;

import android.widget.CompoundButton;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́ۦ　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0068 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0078 f159;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f160;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0068(ViewOnClickListenerC0078 viewOnClickListenerC0078, C0063 c0063) {
        this.f159 = viewOnClickListenerC0078;
        this.f160 = c0063;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f160.f262.edit().putBoolean(Constants.XFDEX.value, z).apply();
    }
}
