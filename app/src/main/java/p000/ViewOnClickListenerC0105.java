package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: 8KGY)TQWR+ORN */
/* renamed from: ۬̀ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0105 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0063 f278;

    /* renamed from: ۦ */
    final /* synthetic */ C0106 f279;

    /* renamed from: ۬ */
    final /* synthetic */ Context f280;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0105(C0106 c0106, Context context, C0063 c0063) {
        this.f279 = c0106;
        this.f280 = context;
        this.f278 = c0063;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0101 c0101 = new C0101(this.f280, this.f278.f260);
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) this.f278.f259;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.add(viewGroup.getChildAt(i));
            arrayList.add(viewGroup.getChildAt(i).getClass().getName());
        }
        c0101.m50(arrayList);
        c0101.setListener(new C0113(this, arrayList2));
        c0101.f271 = "ViewGroupHandle,len:" + arrayList2.size();
        c0101.m49(700, 700);
    }
}
