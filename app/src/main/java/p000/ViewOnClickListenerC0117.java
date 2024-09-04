package p000;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: 5GV+ORN */
/* renamed from: ۬ۦ۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0117 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0063 f304;

    /* renamed from: ۥ */
    final /* synthetic */ C0118 f305;

    /* renamed from: ۦ */
    final /* synthetic */ Set f306;

    /* renamed from: ۬ */
    final /* synthetic */ Context f307;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0117(C0118 c0118, Context context, C0063 c0063, Set set) {
        this.f305 = c0118;
        this.f307 = context;
        this.f304 = c0063;
        this.f306 = set;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0101 c0101 = new C0101(this.f307, this.f304.f260);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.f306) {
            arrayList.add("0 " + C0135.m61(obj));
            arrayList2.add(obj);
        }
        c0101.m50(arrayList);
        c0101.setListener(new C0114(this, arrayList2));
        c0101.f271 = "Setlength:" + arrayList2.size();
        c0101.m49(700, 700);
    }
}
