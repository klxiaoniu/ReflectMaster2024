package p000;

import android.widget.Button;
import android.widget.LinearLayout;

/* compiled from: +OCIG8KGY+ORN */
/* renamed from: ́۬ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0071 implements InterfaceC0069 {
    @Override // p000.InterfaceC0069
    /* renamed from: ۬ */
    public final void mo33(C0063 c0063, LinearLayout linearLayout) {
        Button button = new Button(C0063.f255);
        button.setText("查看图片");
        button.setOnClickListener(new ViewOnClickListenerC0070(this, c0063));
        linearLayout.addView(button);
    }
}
