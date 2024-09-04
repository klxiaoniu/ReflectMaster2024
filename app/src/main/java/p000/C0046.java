package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀۬ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0046 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0030 f110;

    /* renamed from: ۬ */
    final /* synthetic */ Class[] f111;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0046(C0030 c0030, Class[] clsArr) {
        this.f110 = c0030;
        this.f111 = clsArr;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f111[i]);
    }
}
