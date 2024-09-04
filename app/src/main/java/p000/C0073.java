package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́۬　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0073 implements AdapterView.OnItemLongClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f171;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0073(C0063 c0063) {
        this.f171 = c0063;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0101 c0101 = new C0101(AbstractC0100.f255, this.f171.f260);
        c0101.f271 = "变量操作";
        c0101.f270 = new C0134(c0101.f267, new String[]{"编辑变量", "复制变量名称", "复制详细变量名称"});
        c0101.setListener(new C0072(this, adapterView, i));
        c0101.m49(700, 700);
        return true;
    }
}
