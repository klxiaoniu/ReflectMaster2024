package p000;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* compiled from: 8KGY)TQWR+ORN */
/* renamed from: ۬́　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0113 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0105 f294;

    /* renamed from: ۬ */
    final /* synthetic */ List f295;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0113(ViewOnClickListenerC0105 viewOnClickListenerC0105, List list) {
        this.f294 = viewOnClickListenerC0105;
        this.f295 = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f295.get(i));
    }
}
