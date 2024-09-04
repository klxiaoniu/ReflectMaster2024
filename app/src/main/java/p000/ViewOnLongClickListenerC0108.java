package p000;

import android.view.View;

/* compiled from: 6GZV8KGY+ORN */
/* renamed from: ۬̀　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnLongClickListenerC0108 implements View.OnLongClickListener {

    /* renamed from: ́ */
    final /* synthetic */ String f284;

    /* renamed from: ۦ */
    final /* synthetic */ C0116 f285;

    /* renamed from: ۬ */
    final /* synthetic */ C0063 f286;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLongClickListenerC0108(C0116 c0116, C0063 c0063, String str) {
        this.f285 = c0116;
        this.f286 = c0063;
        this.f284 = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        HandlerC0184.m111(AbstractC0100.f255, this.f284);
        return true;
    }
}
