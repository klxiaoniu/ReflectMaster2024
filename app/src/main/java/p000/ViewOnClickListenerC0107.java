package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: 6GZV8KGY+ORN */
/* renamed from: ۬̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0107 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ TextView f281;

    /* renamed from: ۦ */
    final /* synthetic */ C0116 f282;

    /* renamed from: ۬ */
    final /* synthetic */ Context f283;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0107(C0116 c0116, Context context, TextView textView) {
        this.f282 = c0116;
        this.f283 = context;
        this.f281 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new C0088(this.f283, "输入新文字", this.f281.getText().toString()).f216 = new C0104(this);
    }
}
