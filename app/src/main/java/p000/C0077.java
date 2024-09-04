package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0077 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0078 f186;

    /* renamed from: ۬ */
    final /* synthetic */ Object[] f187;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0077(ViewOnClickListenerC0078 viewOnClickListenerC0078, Object[] objArr) {
        this.f186 = viewOnClickListenerC0078;
        this.f187 = objArr;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f187[i]);
    }
}
