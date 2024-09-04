package p000;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: ۬۬　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0123 extends AbstractC0100 {

    /* renamed from: ۦ　 */
    Map<String, Method> f318;

    /* renamed from: ۬́ */
    boolean f319;

    /* renamed from: ۬ۦ */
    private ListView f320;

    /* renamed from: ۬۬ */
    C0138 f321;

    /* renamed from: ۬　 */
    String f322;

    public C0123(Object obj, Class cls) {
        super(obj, cls);
        this.f322 = null;
    }

    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f261 = (Class) this.f258[0];
        this.f318 = new HashMap();
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    public final void mo23() {
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-12303292);
        TextView textView = new TextView(f255);
        textView.setText("函数");
        textView.setTextColor(-65536);
        m45(linearLayout, textView);
        new C0167(AbstractC0100.f255, this.f260, this.f257, linearLayout, true).f416 = new C0122(this);
        m45(linearLayout, new ViewOnClickListenerC0111(this));
        this.f320 = new ListView(f255);
        this.f320.setDivider(new ColorDrawable(2131165252));
        this.f320.setDividerHeight(5);
        this.f320.setTextFilterEnabled(true);
        this.f320.setFastScrollEnabled(true);
        this.f320.setOnItemClickListener(new C0119(this));
        this.f320.setOnItemLongClickListener(new C0121(this));
        for (Method method : this.f261.getDeclaredMethods()) {
            this.f318.put(method.toString(), method);
        }
        this.f321 = new C0138(f255, this.f318.values());
        this.f320.setAdapter((ListAdapter) this.f321);
        m45(linearLayout, this.f320);
        this.f260.addView(linearLayout, this.f257);
    }
}
