package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: 　　　ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0194 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0123 f482;

    /* renamed from: ۬ */
    final /* synthetic */ Class[] f483;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0194(C0123 c0123, Class[] clsArr) {
        this.f482 = c0123;
        this.f483 = clsArr;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f483[i]);
    }
}
