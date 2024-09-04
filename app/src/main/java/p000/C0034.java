package p000;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀́́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0034 implements AdapterView.OnItemLongClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0030 f83;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0034(C0030 c0030) {
        this.f83 = c0030;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0101 c0101 = new C0101(AbstractC0100.f255, this.f83.f260);
        c0101.f271 = "构造器操作";
        c0101.f270 = new C0134(c0101.f267, new String[]{"参数列表", "复制构造器名称"});
        c0101.setListener(new C0036(this, adapterView, i));
        c0101.m49(700, 700);
        return true;
    }
}
