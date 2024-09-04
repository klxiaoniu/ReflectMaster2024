package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

/* compiled from: $CUG9KPFQY */
/* renamed from: ۦۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0089 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ AbstractC0100 f223;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f224;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0089(AbstractC0100 abstractC0100, EditText editText) {
        this.f223 = abstractC0100;
        this.f224 = editText;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        switch (i) {
            case 0:
                str = "$this";
                break;
            case 1:
                str = "$context";
                break;
            case 2:
                str = "$null";
                break;
            default:
                str = "$V" + (i - 3);
                break;
        }
        this.f224.setText(str);
    }
}
