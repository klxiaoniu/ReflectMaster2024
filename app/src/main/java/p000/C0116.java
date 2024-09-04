package p000;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: 6GZV8KGY+ORN */
/* renamed from: ۬ۦۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0116 implements InterfaceC0069 {
    @Override // p000.InterfaceC0069
    /* renamed from: ۬ */
    public final void mo33(C0063 c0063, LinearLayout linearLayout) {
        Context context = C0063.f255;
        TextView textView = (TextView) c0063.f259;
        String charSequence = textView.getText().toString();
        Button button = new Button(context);
        button.setText("复制文本");
        button.setOnClickListener(new ViewOnClickListenerC0115(this, c0063, charSequence));
        button.setOnLongClickListener(new ViewOnLongClickListenerC0108(this, c0063, charSequence));
        Button button2 = new Button(context);
        button2.setText("修改文字");
        button2.setOnClickListener(new ViewOnClickListenerC0107(this, context, textView));
        linearLayout.addView(button);
        linearLayout.addView(button2);
    }
}
