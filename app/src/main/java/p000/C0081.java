package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

/* compiled from: %NCUU9KPFQY */
/* renamed from: ۦ̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0081 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ RunnableC0082 f195;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0081(RunnableC0082 runnableC0082) {
        this.f195 = runnableC0082;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        EditText editText;
        String item = this.f195.f202.getItem(i);
        editText = this.f195.f200;
        editText.setText(item);
    }
}
