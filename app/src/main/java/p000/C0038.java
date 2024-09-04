package p000;

import android.text.TextUtils;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀́　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0038 implements InterfaceC0103 {

    /* renamed from: ۬ */
    final /* synthetic */ C0030 f89;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0038(C0030 c0030) {
        this.f89 = c0030;
    }

    @Override // p000.InterfaceC0103
    /* renamed from: ۬ */
    public final void mo25(String str) {
        this.f89.f76 = TextUtils.isEmpty(str) ? null : str;
        if (this.f89.f75 != null) {
            this.f89.f75.getFilter().filter(str);
        }
    }
}
