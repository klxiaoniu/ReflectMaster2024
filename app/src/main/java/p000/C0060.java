package p000;

import android.view.View;
import android.widget.AdapterView;
import java.lang.reflect.Field;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́́ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0060 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f137;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0060(C0063 c0063) {
        this.f137 = c0063;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            Field field = (Field) adapterView.getItemAtPosition(i);
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            new C0063(field.get(this.f137.f259));
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, th);
        }
    }
}
