package p000;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* compiled from: 5GV+ORN */
/* renamed from: ۬ۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0114 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ ViewOnClickListenerC0117 f299;

    /* renamed from: ۬ */
    final /* synthetic */ List f300;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0114(ViewOnClickListenerC0117 viewOnClickListenerC0117, List list) {
        this.f299 = viewOnClickListenerC0117;
        this.f300 = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f300.get(i));
    }
}
