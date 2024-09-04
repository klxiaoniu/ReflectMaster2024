package p000;

import android.util.Pair;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: #EVKXKV[#FCRVGT */
/* renamed from: 　ۦۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0151 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0144 f370;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0151(C0144 c0144) {
        this.f370 = c0144;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        String lowerCase = charSequence.toString().toLowerCase();
        Iterator<Pair<String, String>> it = this.f370.f364.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (next.toString().toLowerCase().contains(lowerCase) || lowerCase.contains(String.valueOf(this.f370.f364.indexOf(next)))) {
                arrayList.add(next);
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f370.f362 = (ArrayList) filterResults.values;
        this.f370.notifyDataSetInvalidated();
    }
}
