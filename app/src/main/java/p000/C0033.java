package p000;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: 5VCTV#EV9KPFQY */
/* renamed from: ̀̀　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0033 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0040 f80;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0033(C0040 c0040) {
        this.f80 = c0040;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            this.f80.f96.startActivity(new Intent(this.f80.f96, this.f80.f96.getClassLoader().loadClass((String) ((Pair) adapterView.getItemAtPosition(i)).second)));
        } catch (Exception e) {
            HandlerC0184.m102(this.f80.f96, e);
        }
    }
}
