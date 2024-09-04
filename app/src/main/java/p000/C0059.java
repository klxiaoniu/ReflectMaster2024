package p000;

import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.Collection;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́́́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0059 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ C0063 f135;

    /* renamed from: ۬ */
    final /* synthetic */ TextView f136;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0059(C0063 c0063, TextView textView) {
        this.f135 = c0063;
        this.f136 = textView;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        if (this.f135.f144 == null) {
            this.f135.f144 = this.f135.f259.getClass().getSuperclass();
        } else {
            this.f135.f144 = this.f135.f144.getSuperclass();
        }
        if (this.f135.f144 == null) {
            this.f135.f144 = this.f135.f259.getClass();
        }
        this.f135.f261 = this.f135.f144;
        this.f136.setText(this.f135.f261.getName());
        if (this.f135.f143 != null) {
            this.f135.f141.clear();
            for (Field field : this.f135.f261.getDeclaredFields()) {
                this.f135.f141.put(field.toString(), field);
            }
            C0131 c0131 = this.f135.f143;
            Collection<Field> values = this.f135.f141.values();
            Field[] fieldArr = (Field[]) values.toArray(new Field[values.size()]);
            c0131.f337 = fieldArr;
            c0131.f334 = fieldArr;
            this.f135.f143.notifyDataSetChanged();
        }
    }
}
