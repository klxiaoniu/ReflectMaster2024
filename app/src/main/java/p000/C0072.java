package p000;

import android.view.View;
import android.widget.AdapterView;
import java.lang.reflect.Field;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0072 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ int f168;

    /* renamed from: ۦ */
    final /* synthetic */ C0073 f169;

    /* renamed from: ۬ */
    final /* synthetic */ AdapterView f170;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0072(C0073 c0073, AdapterView adapterView, int i) {
        this.f169 = c0073;
        this.f170 = adapterView;
        this.f168 = i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Field field = (Field) this.f170.getItemAtPosition(this.f168);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        switch (i) {
            case 0:
                new C0066(this.f169.f171.f259, this.f169.f171, field);
                return;
            case 1:
                C0063.m44(field.getName());
                return;
            case 2:
                C0063.m44(field.toGenericString());
                return;
            default:
                return;
        }
    }
}
