package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/* compiled from: 6GZV#FCRVGT */
/* renamed from: 　́́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0134 extends BaseAdapter {

    /* renamed from: ́ */
    String[] f343;

    /* renamed from: ۬ */
    Context f344;

    public C0134(Context context, String[] strArr) {
        this.f344 = context;
        this.f343 = strArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f343.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f343[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(this.f344);
        textView.setTextSize(19.0f);
        textView.setText(this.f343[i]);
        textView.setPadding(10, 0, 0, 0);
        textView.setTextColor(-256);
        return textView;
    }
}
