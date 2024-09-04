package p000;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ۦ۬ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0096 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0097 f236;

    /* renamed from: ۬ */
    final /* synthetic */ List f237;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0096(C0097 c0097, List list) {
        this.f236 = c0097;
        this.f237 = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f236.f244, this.f236.f238, this.f236.f240, this.f237.get(i));
    }
}
