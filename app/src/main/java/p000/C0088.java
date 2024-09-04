package p000;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qingyu.rm.reflect.data.Constants;

/* compiled from: 'FKV6GZV8KGY9KPFQY */
/* renamed from: ۦ́　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0088 extends AbstractC0100 {

    /* renamed from: ۦ　 */
    public InterfaceC0086 f216;

    /* renamed from: ۬۬ */
    private String f217;

    /* renamed from: ۬　 */
    private String f218;

    public C0088(Context context, String str, String str2) {
        super(f256, f254, context, null, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f218 = (String) this.f258[0];
        this.f217 = (String) this.f258[1];
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    protected final void mo23() {
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(f255);
        linearLayout2.setOrientation(0);
        Button button = new Button(AbstractC0100.f255);
        button.setText("关闭");
        m46(linearLayout2, button, new C0087(this, linearLayout));
        m45(linearLayout, linearLayout2);
        TextView textView = new TextView(f255);
        textView.setTextColor(Color.parseColor("#c7c7c7"));
        textView.setText(this.f218);
        m45(linearLayout, textView);
        EditText editText = new EditText(f255);
        editText.setTextColor(-65536);
        if (this.f217 != null) {
            editText.setText(String.valueOf(this.f217));
            editText.setHint(String.valueOf(this.f217));
            editText.setHintTextColor(Color.parseColor("#a2a2a2"));
        }
        m45(linearLayout, editText);
        Button button2 = new Button(AbstractC0100.f255);
        button2.setText("确定");
        m46(linearLayout2, button2, new C0084(this, editText, linearLayout));
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        this.f257.width = i;
        this.f257.height = i;
        this.f260.addView(linearLayout, this.f257);
    }
}
