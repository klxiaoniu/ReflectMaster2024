package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.qingyu.rm.util.ToastUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: /CKP9KPFQY */
/* renamed from: ̀　۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC0052 implements View.OnLongClickListener {

    /* renamed from: ́ */
    final /* synthetic */ C0097 f119;

    /* renamed from: ۬ */
    final /* synthetic */ TextView f120;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLongClickListenerC0052(C0097 c0097, TextView textView) {
        this.f119 = c0097;
        this.f120 = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Context context = this.f119.f240;
        Context context2 = this.f119.f240;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("ActName", this.f120.getText()));
        ToastUtils.show("已复制到剪贴板");
        return true;
    }
}
