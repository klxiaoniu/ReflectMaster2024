package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ۦۥ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0014 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ Main f219;

    /* renamed from: ۬ */
    final /* synthetic */ String f220;

    public ViewOnClickListenerC0014(Main main, String str) {
        this.f219 = main;
        this.f220 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f219.f4 != null && this.f219.f4.isShowing()) {
            this.f219.f4.dismiss();
        }
        this.f219.startActivity(new Intent().setAction("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f220, null)));
    }
}
