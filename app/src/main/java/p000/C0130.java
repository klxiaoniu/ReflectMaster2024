package p000;

import android.widget.Filter;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: (KGNF#FCRVGT */
/* renamed from: 　̀ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0130 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0131 f333;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0130(C0131 c0131) {
        this.f333 = c0131;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Field[] fieldArr;
        String lowerCase = charSequence.toString().toLowerCase();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        fieldArr = this.f333.f334;
        for (Field field : fieldArr) {
            if (field.toGenericString().toLowerCase().contains(lowerCase)) {
                arrayList.add(field);
            }
        }
        filterResults.values = arrayList.toArray(new Field[arrayList.size()]);
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f333.f337 = (Field[]) filterResults.values;
        this.f333.notifyDataSetInvalidated();
    }
}
