package p000;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Set;

/* compiled from: 5GV+ORN */
/* renamed from: ۬ۦ　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0118 implements InterfaceC0069 {
    @Override // p000.InterfaceC0069
    /* renamed from: ۬ */
    public final void mo33(C0063 c0063, LinearLayout linearLayout) {
        Context context = C0063.f255;
        Set set = (Set) c0063.f259;
        Button button = new Button(context);
        button.setText("查看Set列表");
        button.setOnClickListener(new ViewOnClickListenerC0117(this, context, c0063, set));
        linearLayout.addView(button);
    }
}
