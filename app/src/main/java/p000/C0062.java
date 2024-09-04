package p000;

import android.text.TextUtils;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́́۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0062 implements InterfaceC0103 {

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f140;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0062(C0063 c0063) {
        this.f140 = c0063;
    }

    @Override // p000.InterfaceC0103
    /* renamed from: ۬ */
    public final void mo25(String str) {
        this.f140.f146 = TextUtils.isEmpty(str) ? str : null;
        if (this.f140.f143 != null) {
            this.f140.f143.getFilter().filter(str);
        }
    }
}
