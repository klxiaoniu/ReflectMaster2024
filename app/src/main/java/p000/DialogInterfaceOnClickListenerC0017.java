package p000;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ۦ　 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0017 implements DialogInterface.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f253;

    public DialogInterfaceOnClickListenerC0017(Main main) {
        this.f253 = main;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("de.robv.android.xposed.installer", "de.robv.android.xposed.installer.WelcomeActivity"));
            this.f253.startActivity(intent);
        } catch (Throwable th) {
            HandlerC0184.m102(this.f253, "启动失败，可能未安装Xposed或者权限不足", th);
        }
    }
}
