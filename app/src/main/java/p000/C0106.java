package p000;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

/* compiled from: 8KGY)TQWR+ORN */
/* renamed from: ۬̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0106 implements InterfaceC0069 {
    @Override // p000.InterfaceC0069
    /* renamed from: ۬ */
    public final void mo33(C0063 c0063, LinearLayout linearLayout) {
        Context context = C0063.f255;
        Button button = new Button(context);
        button.setText("查看子View列表");
        button.setOnClickListener(new ViewOnClickListenerC0105(this, context, c0063));
        linearLayout.addView(button);
    }
}
