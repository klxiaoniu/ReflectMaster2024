package p000;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ۦۦ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0015 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ Main f221;

    /* renamed from: ۬ */
    final /* synthetic */ String f222;

    public ViewOnClickListenerC0015(Main main, String str) {
        this.f221 = main;
        this.f222 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f221.f4 != null && this.f221.f4.isShowing()) {
            this.f221.f4.dismiss();
        }
        Intent launchIntentForPackage = this.f221.getPackageManager().getLaunchIntentForPackage(this.f222);
        if (launchIntentForPackage == null) {
            Toast.makeText(this.f221, "打开失败", 0).show();
        } else {
            this.f221.startActivity(launchIntentForPackage);
        }
    }
}
