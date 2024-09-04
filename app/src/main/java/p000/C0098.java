package p000;

import android.graphics.Bitmap;

import com.qingyu.rm.util.ToastUtils;

import java.io.FileOutputStream;

/* compiled from: +OCIG9KPFQY */
/* renamed from: ۦ۬　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0098 implements InterfaceC0090 {

    /* renamed from: ۬ */
    final /* synthetic */ C0085 f252;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0098(C0085 c0085) {
        this.f252 = c0085;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        String format = String.format("/sdcard/%s%d.png", this.f252.f259.getClass().getName(), Long.valueOf(System.currentTimeMillis()));
        try {
            C0085.f211.compress(Bitmap.CompressFormat.PNG, 10, new FileOutputStream(format));
            C0085.f211.recycle();
            C0085.f211 = null;
            ToastUtils.show("保存成功：" + format);
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, th);
        }
    }
}
