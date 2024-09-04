package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: ̀ۦ */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0002 implements DialogInterface.OnClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ Main f94;

    public DialogInterfaceOnClickListenerC0002(Main main) {
        this.f94 = main;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f94.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=1330402904&version=1&src_type=web")));
    }
}
