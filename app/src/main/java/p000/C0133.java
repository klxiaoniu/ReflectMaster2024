package p000;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: %NCUU#FCRVGT */
/* renamed from: 　̀　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0133 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0150 f341;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0133(C0150 c0150) {
        this.f341 = c0150;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        String lowerCase = charSequence.toString().toLowerCase();
        Iterator<String> it = this.f341.f368.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.toLowerCase().contains(lowerCase)) {
                arrayList.add(next);
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f341.clear();
        this.f341.addAll((ArrayList) filterResults.values);
        this.f341.notifyDataSetChanged();
    }
}
