package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: %QPUVTWEVQT#FCRVGT */
/* renamed from: 　̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0132 extends BaseAdapter implements Filterable {

    /* renamed from: ́ */
    public Constructor[] f338;

    /* renamed from: ۦ */
    private Context f339;

    /* renamed from: ۬ */
    public Constructor[] f340;

    public C0132(Context context, Collection<Constructor> collection) {
        this.f339 = context;
        Constructor[] constructorArr = (Constructor[]) collection.toArray(new Constructor[collection.size()]);
        this.f338 = constructorArr;
        this.f340 = constructorArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f338.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f338[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Constructor constructor = this.f338[i];
        if (!constructor.isAccessible()) {
            try {
                constructor.setAccessible(true);
            } catch (Throwable th) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(this.f339);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f339);
        TextView textView2 = new TextView(this.f339);
        textView.setTextColor(-1);
        textView2.setTextColor(-16711936);
        textView.setText(constructor.getName());
        StringBuilder sb = new StringBuilder();
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        for (Type type : genericParameterTypes) {
            sb.append(type.toString() + ",");
        }
        String sb2 = sb.toString();
        if (!sb2.isEmpty() && sb2.endsWith(",")) {
            textView2.setText(sb.substring(0, sb.lastIndexOf(",")));
        } else {
            textView2.setText("()");
        }
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        return linearLayout;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0129(this);
    }
}
