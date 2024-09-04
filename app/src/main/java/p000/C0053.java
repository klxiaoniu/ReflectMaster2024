package p000;

import android.view.View;
import com.qingyu.rm.reflect.widget.ViewLineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ̀　　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0053 implements InterfaceC0099 {

    /* renamed from: ́ */
    final /* synthetic */ C0097 f121;

    /* renamed from: ۬ */
    final /* synthetic */ ViewLineView f122;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0053(C0097 c0097, ViewLineView viewLineView) {
        this.f121 = c0097;
        this.f122 = viewLineView;
    }

    @Override // p000.InterfaceC0099
    /* renamed from: ۬ */
    public final void mo29(List<View> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        C0097.m41(this.f121, "点击范围内的views", arrayList);
    }

    @Override // p000.InterfaceC0099
    /* renamed from: ۬ */
    public final void mo28() {
        this.f121.f251.removeView(this.f122);
        this.f121.f251.addView(this.f121.f241, this.f121.f250);
    }
}
