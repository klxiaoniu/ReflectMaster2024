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
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: /GVJQF#FCRVGT */
/* renamed from: 　́　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0138 extends BaseAdapter implements Filterable {

    /* renamed from: ́ */
    public Method[] f348;

    /* renamed from: ۦ */
    private Context f349;

    /* renamed from: ۬ */
    public Method[] f350;

    public C0138(Context context, Collection<Method> collection) {
        this.f349 = context;
        Method[] methodArr = (Method[]) collection.toArray(new Method[collection.size()]);
        this.f350 = methodArr;
        this.f348 = methodArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f350.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f350[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        Method method = this.f350[i];
        if (!method.isAccessible()) {
            try {
                method.setAccessible(true);
            } catch (Throwable th) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(this.f349);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f349);
        TextView textView2 = new TextView(this.f349);
        TextView textView3 = new TextView(this.f349);
        textView.setTextColor(-1);
        textView2.setTextColor(-16711936);
        textView3.setTextColor(-65536);
        String modifier = Modifier.toString(method.getModifiers());
        if (!modifier.isEmpty()) {
            SpannableString spannableString = new SpannableString(modifier + " " + method.getName());
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#e38800")), 0, modifier.length(), 0);
            str = spannableString.toString();
        } else {
            str = method.getName();
        }
        textView.setText(str);
        StringBuilder sb = new StringBuilder();
        for (Type type : method.getGenericParameterTypes()) {
            sb.append(type.toString() + ",");
        }
        String sb2 = sb.toString();
        if (!sb2.isEmpty() && sb2.endsWith(",")) {
            textView2.setText(sb.substring(0, sb.lastIndexOf(",")));
        }
        textView3.setText(method.getGenericReturnType().toString());
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        return linearLayout;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0137(this);
    }
}
