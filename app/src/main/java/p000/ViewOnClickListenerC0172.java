package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: &KCNQI/UI */
/* renamed from: 　　̀۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0172 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ HandlerC0184 f423;

    /* renamed from: ۬ */
    final /* synthetic */ Button f424;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0172(HandlerC0184 handlerC0184, Button button) {
        this.f423 = handlerC0184;
        this.f424 = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        TextView textView;
        String str;
        boolean z2;
        TextView textView2;
        String str2;
        z = this.f423.f444;
        if (!z) {
            textView2 = this.f423.f445;
            str2 = this.f423.f446;
            textView2.setText(str2);
            this.f424.setText("摘要");
        } else {
            textView = this.f423.f445;
            str = this.f423.f447;
            textView.setText(str);
            this.f424.setText("详细");
        }
        HandlerC0184 handlerC0184 = this.f423;
        z2 = this.f423.f444;
        handlerC0184.f444 = !z2;
    }
}
