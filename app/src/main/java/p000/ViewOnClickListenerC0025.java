package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;

/* compiled from: /CKP */
/* renamed from: 　ۥ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0025 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ Main f351;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f352;

    public ViewOnClickListenerC0025(Main main, EditText editText) {
        this.f351 = main;
        this.f352 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f351.f3.edit().putInt(Constants.CKDX.value, Integer.parseInt(this.f352.getText().toString())).commit();
        Toast.makeText(this.f351, "ojbk", 0).show();
    }
}
