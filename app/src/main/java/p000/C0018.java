package p000;

import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ۬ */
/* loaded from: classes.dex */
public final class C0018 implements InterfaceC0147 {

    /* renamed from: ۬ */
    final /* synthetic */ Main f276;

    public C0018(Main main) {
        this.f276 = main;
    }

    @Override // p000.InterfaceC0147
    /* renamed from: ۬ */
    public final void mo51() {
        this.f276.f2 = true;
        try {
            Class.forName("android.os.AsyncTask");
            new AsyncTaskC0006(this.f276).execute(this.f276.getPackageManager());
        } catch (Exception e) {
            HandlerC0184.m102(this.f276, e, null);
        }
    }
}
