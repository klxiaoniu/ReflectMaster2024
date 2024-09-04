package p000;

import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qingyu.rm.reflect.data.Constants;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* compiled from: 'FKV(KGNF9KPFQY */
/* renamed from: ́ۦۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0066 extends AbstractC0100 {

    /* renamed from: ۦ۬ */
    Field f152;

    /* renamed from: ۦ　 */
    C0063 f153;

    public C0066(Object obj, C0063 c0063, Field field) {
        super(obj, c0063, field);
    }

    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f153 = (C0063) this.f258[0];
        this.f152 = (Field) this.f258[1];
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    public final void mo23() {
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        this.f257.width = i;
        this.f257.height = i;
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(f255);
        linearLayout2.setOrientation(0);
        Button button = new Button(AbstractC0100.f255);
        button.setText("关闭");
        m46(linearLayout2, button, new C0065(this, linearLayout));
        m45(linearLayout, linearLayout2);
        TextView textView = new TextView(f255);
        textView.setGravity(17);
        textView.setTextColor(Color.parseColor("#c7c7c7"));
        textView.setText("F：" + this.f152.getName());
        m45(linearLayout, textView);
        EditText editText = new EditText(f255);
        editText.setTextColor(-65536);
        editText.setHint(this.f152.getType().getName());
        editText.setHintTextColor(Color.parseColor("#a2a2a2"));
        if (this.f152.getType().getName().equals("boolean")) {
            editText.setInputType(0);
            editText.setOnClickListener(new ViewOnClickListenerC0058(this, editText));
        } else {
            editText.setOnLongClickListener(new ViewOnLongClickListenerC0054(this, editText));
        }
        try {
            editText.setText(String.valueOf(Modifier.isStatic(this.f152.getModifiers()) ? this.f152.get(null) : this.f152.get(this.f259)));
        } catch (Throwable th) {
        }
        AbstractC0100 abstractC0100 = m45(linearLayout, editText);
        Button button2 = new Button(AbstractC0100.f255);
        button2.setText("确定");
        abstractC0100.m46(linearLayout2, button2, new C0056(this, editText, linearLayout));
        this.f260.addView(linearLayout, this.f257);
    }
}
