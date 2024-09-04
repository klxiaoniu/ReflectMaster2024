package p000;

import android.text.TextUtils;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: ۬۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0122 implements InterfaceC0103 {

    /* renamed from: ۬ */
    final /* synthetic */ C0123 f317;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0122(C0123 c0123) {
        this.f317 = c0123;
    }

    @Override // p000.InterfaceC0103
    /* renamed from: ۬ */
    public final void mo25(String str) {
        this.f317.f322 = TextUtils.isEmpty(str) ? null : str;
        if (this.f317.f321 != null) {
            this.f317.f321.getFilter().filter(str);
        }
    }
}
