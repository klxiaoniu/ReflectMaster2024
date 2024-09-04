package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.qingyu.rm.reflect.data.Constants;
import java.io.File;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0076 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ LinearLayout f180;

    /* renamed from: ۥ */
    final /* synthetic */ Switch f181;

    /* renamed from: ۦ */
    final /* synthetic */ EditText f182;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f183;

    /* renamed from: 　۬ */
    final /* synthetic */ ViewOnClickListenerC0078 f184;

    /* renamed from: 　　 */
    final /* synthetic */ File f185;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0076(ViewOnClickListenerC0078 viewOnClickListenerC0078, C0063 c0063, LinearLayout linearLayout, EditText editText, Switch r5, File file) {
        this.f184 = viewOnClickListenerC0078;
        this.f183 = c0063;
        this.f180 = linearLayout;
        this.f182 = editText;
        this.f181 = r5;
        this.f185 = file;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        C0063 c0063 = this.f183;
        LinearLayout linearLayout = this.f180;
        EditText editText = this.f182;
        this.f181.isChecked();
        File file = this.f185;
        try {
            String trim = editText.getText().toString().trim();
            if (!trim.isEmpty()) {
                c0063.f262.edit().putString(Constants.DEXSCMZ.value, trim).apply();
            } else {
                trim = "classes.dex";
            }
            File file2 = new File(file, trim);
            file2.getParentFile().mkdirs();
            new AsyncTaskC0126().execute("dex", file2.getAbsolutePath(), c0063);
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, th);
        } finally {
            c0063.f260.removeView(linearLayout);
        }
    }
}
