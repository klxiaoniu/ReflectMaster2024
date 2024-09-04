package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: .KUV+ORN */
/* renamed from: ۬　́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0124 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ ViewOnClickListenerC0127 f324;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0124(ViewOnClickListenerC0127 viewOnClickListenerC0127) {
        this.f324 = viewOnClickListenerC0127;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0063(this.f324.f330.get(i));
    }
}
