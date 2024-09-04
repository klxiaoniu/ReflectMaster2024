package p000;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: %NCUU#FCRVGT */
/* renamed from: 　ۦۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0150 extends ArrayAdapter<String> {

    /* renamed from: ́ */
    ArrayList<String> f368;

    /* renamed from: ۬ */
    Context f369;

    public C0150(Context context, ArrayList<String> arrayList) {
        super(context, R.layout.simple_list_item_1);
        this.f369 = context;
        this.f368 = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(this.f369);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setText(getItem(i));
        textView.setTextColor(Color.parseColor("#c7c7c7"));
        textView.setTextAppearance(R.attr.textAppearanceListItem);
        textView.setGravity(16);
        textView.setPadding(10, 5, 10, 5);
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new C0133(this);
    }
}
