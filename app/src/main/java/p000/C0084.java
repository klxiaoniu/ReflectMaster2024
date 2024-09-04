package p000;

import android.widget.EditText;
import android.widget.LinearLayout;

/* compiled from: 'FKV6GZV8KGY9KPFQY */
/* renamed from: ۦ́́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0084 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ LinearLayout f208;

    /* renamed from: ۦ */
    final /* synthetic */ C0088 f209;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f210;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0084(C0088 c0088, EditText editText, LinearLayout linearLayout) {
        this.f209 = c0088;
        this.f210 = editText;
        this.f208 = linearLayout;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        if (this.f209.f216 != null) {
            this.f209.f216.mo37(this.f210.getText().toString());
        }
        this.f209.f260.removeView(this.f208);
    }
}
