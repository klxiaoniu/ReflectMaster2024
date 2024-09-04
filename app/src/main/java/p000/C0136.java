package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* compiled from: 8CT#FCRVGT */
/* renamed from: 　́ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0136 extends BaseAdapter {

    /* renamed from: ́ */
    List<Object> f345;

    /* renamed from: ۬ */
    Context f346;

    public C0136(Context context, List<Object> list) {
        this.f346 = context;
        this.f345 = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f345.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f345.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f345.get(i).hashCode();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(this.f346);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f346);
        TextView textView2 = new TextView(this.f346);
        textView.setTextColor(-65536);
        textView2.setTextColor(-1);
        Object obj = this.f345.get(i);
        if (obj != null) {
            textView.setText(this.f345.get(i).getClass().getName());
        }
        textView2.setText(C0135.m61(obj));
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        return linearLayout;
    }
}
