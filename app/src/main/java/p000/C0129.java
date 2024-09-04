package p000;

import android.widget.Filter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: %QPUVTWEVQT#FCRVGT */
/* renamed from: 　̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0129 extends Filter {

    /* renamed from: ۬ */
    final /* synthetic */ C0132 f332;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0129(C0132 c0132) {
        this.f332 = c0132;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Constructor[] constructorArr;
        String lowerCase = charSequence.toString().toLowerCase();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        constructorArr = this.f332.f338;
        for (Constructor constructor : constructorArr) {
            if (constructor.toGenericString().toLowerCase().contains(lowerCase)) {
                arrayList.add(constructor);
            }
        }
        filterResults.values = arrayList.toArray(new Constructor[arrayList.size()]);
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f332.f338 = (Constructor[]) filterResults.values;
        this.f332.notifyDataSetInvalidated();
    }
}
