package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: ۬۬ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0121 implements AdapterView.OnItemLongClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0123 f316;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0121(C0123 c0123) {
        this.f316 = c0123;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0101 c0101 = new C0101(AbstractC0100.f255, this.f316.f260);
        c0101.f271 = "函数操作";
        c0101.f270 = new C0134(c0101.f267, new String[]{"参数列表", "复制函数名称", "复制详细函数名称"});
        c0101.setListener(new C0120(this, adapterView, i));
        c0101.m49(700, 700);
        return true;
    }
}
