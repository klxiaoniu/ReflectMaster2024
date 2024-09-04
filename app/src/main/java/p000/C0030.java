package p000;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀̀ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0030 extends AbstractC0100 {

    /* renamed from: ۦ́ */
    Map<String, Constructor> f72;

    /* renamed from: ۦۥ */
    private ListView f73;

    /* renamed from: ۦۦ */
    boolean f74;

    /* renamed from: ۦ۬ */
    C0132 f75;

    /* renamed from: ۦ　 */
    String f76;

    public C0030(Object obj, Class cls) {
        super(obj, cls);
        this.f76 = null;
    }

    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f261 = (Class) this.f258[0];
        this.f72 = new HashMap();
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    public final void mo23() {
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-12303292);
        TextView textView = new TextView(f255);
        textView.setText("构造函数");
        textView.setTextColor(-65536);
        m45(linearLayout, textView);
        new C0167(AbstractC0100.f255, this.f260, this.f257, linearLayout, true).f416 = new C0038(this);
        m45(linearLayout, new ViewOnClickListenerC0029(this));
        this.f73 = new ListView(f255);
        this.f73.setDivider(new ColorDrawable(2131165252));
        this.f73.setDividerHeight(5);
        this.f73.setTextFilterEnabled(true);
        this.f73.setFastScrollEnabled(true);
        this.f73.setOnItemClickListener(new C0037(this));
        this.f73.setOnItemLongClickListener(new C0034(this));
        for (Constructor<?> constructor : this.f261.getDeclaredConstructors()) {
            this.f72.put(constructor.toString(), constructor);
        }
        this.f75 = new C0132(f255, this.f72.values());
        this.f73.setAdapter((ListAdapter) this.f75);
        m45(linearLayout, this.f73);
        this.f260.addView(linearLayout, this.f257);
    }
}
