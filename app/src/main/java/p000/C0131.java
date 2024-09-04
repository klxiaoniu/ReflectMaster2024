package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* compiled from: (KGNF#FCRVGT */
/* renamed from: 　̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0131 extends BaseAdapter implements Filterable {

    /* renamed from: ́ */
    public Field[] f334;

    /* renamed from: ۥ */
    private Object f335;

    /* renamed from: ۦ */
    private Context f336;

    /* renamed from: ۬ */
    public Field[] f337;

    public C0131(Context context, Collection<Field> collection, Object obj) {
        Field[] fieldArr = (Field[]) collection.toArray(new Field[collection.size()]);
        this.f337 = fieldArr;
        this.f334 = fieldArr;
        this.f336 = context;
        this.f335 = obj;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f337.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f337[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        Field field = this.f337[i];
        if (!field.isAccessible()) {
            try {
                field.setAccessible(true);
            } catch (Throwable th) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(this.f336);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f336);
        TextView textView2 = new TextView(this.f336);
        TextView textView3 = new TextView(this.f336);
        textView.setTextColor(-1);
        textView2.setTextColor(-16711936);
        textView3.setTextColor(-1);
        String modifier = Modifier.toString(field.getModifiers());
        if (!modifier.isEmpty()) {
            SpannableString spannableString = new SpannableString(modifier + " " + field.getName());
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#e38800")), 0, modifier.length(), 0);
            str = spannableString.toString();
        } else {
            str = field.getName();
        }
        textView.setText(str);
        textView2.setText(field.getType().getName());
        try {
            textView3.setText(C0135.m61(field.get(this.f335)));
        } catch (Throwable th2) {
        }
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        return linearLayout;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0130(this);
    }
}
