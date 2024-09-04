package p000;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: $CUG6QCUV5V[NG */
/* renamed from: 　ۦ　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0161 implements InterfaceC0188 {

    /* renamed from: ۬ */
    private Context f396;

    public AbstractC0161(Context context) {
        this.f396 = context;
    }

    @Override // p000.InterfaceC0188
    /* renamed from: ۬ */
    public int mo72() {
        return 17;
    }

    @Override // p000.InterfaceC0188
    /* renamed from: ́ */
    public int mo69() {
        return 0;
    }

    @Override // p000.InterfaceC0188
    /* renamed from: 　　 */
    public int mo75() {
        return 5;
    }

    @Override // p000.InterfaceC0188
    /* renamed from: 　ۦ */
    public final int mo79() {
        return mo74();
    }

    @Override // p000.InterfaceC0188
    /* renamed from: 　ۥ */
    public final int mo78() {
        return mo73();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ۬ */
    public final int m77(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f396.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ́ */
    public final int m76(float f) {
        return (int) TypedValue.applyDimension(2, 16.0f, this.f396.getResources().getDisplayMetrics());
    }
}
