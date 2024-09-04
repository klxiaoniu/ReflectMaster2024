package p000;

import com.qingyu.rm.util.ToastUtils;

/* compiled from: 6GZV8KGY+ORN */
/* renamed from: ۬̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0104 implements InterfaceC0086 {

    /* renamed from: ۬ */
    final /* synthetic */ ViewOnClickListenerC0107 f277;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0104(ViewOnClickListenerC0107 viewOnClickListenerC0107) {
        this.f277 = viewOnClickListenerC0107;
    }

    @Override // p000.InterfaceC0086
    /* renamed from: ۬ */
    public final void mo37(String str) {
        this.f277.f281.setText(str);
        ToastUtils.show("修改成功：" + str);
    }
}
