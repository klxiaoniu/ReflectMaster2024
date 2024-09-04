package p000;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: .KUV+ORN */
/* renamed from: ۬　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0127 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0063 f328;

    /* renamed from: ۥ */
    final /* synthetic */ C0128 f329;

    /* renamed from: ۦ */
    final /* synthetic */ List f330;

    /* renamed from: ۬ */
    final /* synthetic */ Context f331;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0127(C0128 c0128, Context context, C0063 c0063, List list) {
        this.f329 = c0128;
        this.f331 = context;
        this.f328 = c0063;
        this.f330 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0101 c0101 = new C0101(this.f331, this.f328.f260);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f330.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        c0101.m50(arrayList);
        c0101.setListener(new C0124(this));
        c0101.f271 = "Arraylength:" + this.f330.size();
        c0101.m49(700, 700);
    }
}
