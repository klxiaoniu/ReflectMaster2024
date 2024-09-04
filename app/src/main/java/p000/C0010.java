package p000;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP */
/* renamed from: ́　 */
/* loaded from: classes.dex */
public final class C0010 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0001 f172;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0010(C0001 c0001) {
        this.f172 = c0001;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<HashMap<String, Object>> it = this.f172.f90.iterator();
        while (it.hasNext()) {
            HashMap<String, Object> next = it.next();
            String str = (String) next.get("label");
            String str2 = (String) next.get("name");
            if (str.contains(charSequence) || str2.contains(charSequence)) {
                arrayList.add(next);
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.count = arrayList.size();
        filterResults.values = arrayList;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults.count > 0) {
            this.f172.f92 = (ArrayList) filterResults.values;
            this.f172.notifyDataSetChanged();
        } else {
            this.f172.notifyDataSetInvalidated();
        }
        this.f172.notifyDataSetChanged();
    }
}
