package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.Constants;
import java.io.File;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́ۦ۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0067 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ LinearLayout f154;

    /* renamed from: ۥ */
    final /* synthetic */ File f155;

    /* renamed from: ۦ */
    final /* synthetic */ EditText f156;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f157;

    /* renamed from: 　　 */
    final /* synthetic */ ViewOnClickListenerC0078 f158;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0067(ViewOnClickListenerC0078 viewOnClickListenerC0078, C0063 c0063, LinearLayout linearLayout, EditText editText, File file) {
        this.f158 = viewOnClickListenerC0078;
        this.f157 = c0063;
        this.f154 = linearLayout;
        this.f156 = editText;
        this.f155 = file;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        C0063 c0063 = this.f157;
        LinearLayout linearLayout = this.f154;
        EditText editText = this.f156;
        File file = this.f155;
        try {
            String trim = editText.getText().toString().trim();
            if (!trim.isEmpty()) {
                c0063.f262.edit().putString(Constants.DEXSCWJJ.value, trim).apply();
            } else {
                trim = "dump";
            }
            File file2 = new File(file, trim);
            file2.getParentFile().mkdirs();
            try {
                Class.forName("android.os.AsyncTask");
                new AsyncTaskC0126().execute("multydex", file2.getAbsolutePath(), c0063);
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
            HandlerC0184.m102(AbstractC0100.f255, th2);
        } finally {
            c0063.f260.removeView(linearLayout);
        }
    }
}
