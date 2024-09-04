package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.Constants;
import java.io.File;
import java.io.RandomAccessFile;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́　ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0075 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ LinearLayout f175;

    /* renamed from: ۥ */
    final /* synthetic */ File f176;

    /* renamed from: ۦ */
    final /* synthetic */ EditText f177;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f178;

    /* renamed from: 　　 */
    final /* synthetic */ ViewOnClickListenerC0078 f179;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0075(ViewOnClickListenerC0078 viewOnClickListenerC0078, C0063 c0063, LinearLayout linearLayout, EditText editText, File file) {
        this.f179 = viewOnClickListenerC0078;
        this.f178 = c0063;
        this.f175 = linearLayout;
        this.f177 = editText;
        this.f176 = file;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        C0063 c0063 = this.f178;
        LinearLayout linearLayout = this.f175;
        EditText editText = this.f177;
        File file = this.f176;
        try {
            String trim = editText.getText().toString().trim();
            if (!trim.isEmpty()) {
                c0063.f262.edit().putString(Constants.SZSCMZ.value, trim).apply();
            } else {
                trim = "Reflect.data";
            }
            File file2 = new File(file, trim);
            file2.getParentFile().mkdirs();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            randomAccessFile.write((byte[]) c0063.f259);
            randomAccessFile.close();
            HandlerC0184.m110(AbstractC0100.f255, new C0091(c0063, file2.getAbsolutePath()), "写出成功, 文件位于" + file2.getAbsolutePath());
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, "写出失败", th);
        } finally {
            c0063.f260.removeView(linearLayout);
        }
    }
}
