package p000;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

/* compiled from: /CKP */
/* renamed from: ۦ́ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0013 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ String f205;

    /* renamed from: ۦ */
    final /* synthetic */ Main f206;

    /* renamed from: ۬ */
    final /* synthetic */ boolean f207;

    public ViewOnClickListenerC0013(Main main, boolean z, String str) {
        this.f206 = main;
        this.f207 = z;
        this.f205 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f206.f4.dismiss();
        if (!this.f207) {
            Main main = this.f206;
            String str = this.f205;
            main.f3.edit().putString(Constants.YXZ.value, str).apply();
            main.f8.f93 = main.f7;
            main.f7.add(str);
            main.m1();
            new AlertDialog.Builder(main).setTitle("提示").setMessage("选择成功，请重新打开目标软件，包名：" + str).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNeutralButton("打开", new DialogInterfaceOnClickListenerC0000(main, str)).create().show();
            main.f8.notifyDataSetChanged();
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f206.f7.size()) {
                break;
            }
            if (!this.f206.f7.get(i2).equals(this.f205)) {
                i = i2 + 1;
            } else {
                this.f206.f7.remove(i2);
                break;
            }
        }
        this.f206.m1();
        this.f206.f8.f93 = this.f206.f7;
        this.f206.f8.notifyDataSetChanged();
        ToastUtils.show("已取消选择：" + this.f205);
    }
}
