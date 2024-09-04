package p000;

import android.widget.Filter;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /GVJQF#FCRVGT */
/* renamed from: 　́۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0137 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0138 f347;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0137(C0138 c0138) {
        this.f347 = c0138;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Method[] methodArr;
        String lowerCase = charSequence.toString().toLowerCase();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        methodArr = this.f347.f348;
        for (Method method : methodArr) {
            if (method.toGenericString().toLowerCase().contains(lowerCase)) {
                arrayList.add(method);
            }
        }
        filterResults.values = arrayList.toArray(new Method[arrayList.size()]);
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f347.f350 = (Method[]) filterResults.values;
        this.f347.notifyDataSetInvalidated();
    }
}
