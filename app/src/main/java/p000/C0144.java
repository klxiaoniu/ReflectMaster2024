package p000;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: #EVKXKV[#FCRVGT */
/* renamed from: 　ۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0144 extends BaseAdapter implements Filterable {

    /* renamed from: ́ */
    ArrayList<Pair<String, String>> f362;

    /* renamed from: ۦ */
    private Context f363;

    /* renamed from: ۬ */
    ArrayList<Pair<String, String>> f364;

    public C0144(Context context, ArrayList<Pair<String, String>> arrayList) {
        this.f363 = context;
        this.f362 = arrayList;
        this.f364 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f362.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f362.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f362.get(i).hashCode();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = (String) this.f362.get(i).first;
        String str2 = (String) this.f362.get(i).second;
        LinearLayout linearLayout = new LinearLayout(this.f363);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f363);
        textView.setText(str);
        textView.setTextColor(-1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this.f363);
        textView2.setText(str2);
        textView2.setTextColor(-65536);
        linearLayout.addView(textView2);
        return linearLayout;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0151(this);
    }
}
