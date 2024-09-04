package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ̀́ */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0000 implements DialogInterface.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ Main f81;

    /* renamed from: ۬ */
    final /* synthetic */ String f82;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0000(Main main, String str) {
        this.f81 = main;
        this.f82 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent launchIntentForPackage = this.f81.getPackageManager().getLaunchIntentForPackage(this.f82);
        if (launchIntentForPackage == null) {
            Toast.makeText(this.f81, "打开失败", 0).show();
        } else {
            this.f81.startActivity(launchIntentForPackage);
        }
    }
}
