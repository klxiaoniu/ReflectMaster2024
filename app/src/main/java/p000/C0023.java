package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: /CKP */
/* renamed from: ۬　 */
/* loaded from: classes.dex */
final class C0023 implements Comparator<HashMap<String, Object>> {

    /* renamed from: ۬ */
    final /* synthetic */ AsyncTaskC0006 f323;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0023(AsyncTaskC0006 asyncTaskC0006) {
        this.f323 = asyncTaskC0006;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        boolean z;
        HashMap<String, Object> hashMap3 = hashMap;
        HashMap<String, Object> hashMap4 = hashMap2;
        Iterator<String> it = this.f323.f133.f7.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            String next = it.next();
            if (((String) hashMap3.get("name")).equals(next)) {
                z3 = true;
            }
            z = ((String) hashMap4.get("name")).equals(next) ? true : z2;
            if (z3 && z) {
                break;
            }
            z2 = z;
        }
        if (z3 && !z) {
            return -1;
        }
        if (z3 || !z) {
            return Long.valueOf(((Long) hashMap4.get("time")).longValue()).compareTo(Long.valueOf(((Long) hashMap3.get("time")).longValue()));
        }
        return 1;
    }
}
