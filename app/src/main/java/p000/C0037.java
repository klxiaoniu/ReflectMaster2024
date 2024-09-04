package p000;

import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀́۬, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0037 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0030 f88;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0037(C0030 c0030) {
        this.f88 = c0030;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        JSONObject jSONObject;
        Constructor constructor = (Constructor) adapterView.getItemAtPosition(i);
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        C0030 c0030 = this.f88;
        Object[] objArr = new Object[0];
        EditText[] editTextArr = new EditText[0];
        int length = constructor.getGenericParameterTypes().length;
        if (length == 0) {
            try {
                Object newInstance = constructor.newInstance(objArr);
                if (newInstance == null) {
                    ToastUtils.show("result is null");
                } else {
                    ToastUtils.show("正在打开结果：" + newInstance);
                    new C0063(newInstance);
                }
                return;
            } catch (Throwable th) {
                HandlerC0184.m102(AbstractC0100.f255, th);
                return;
            }
        }
        LinearLayout linearLayout = new LinearLayout(C0030.f255);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        new C0167(AbstractC0100.f255, c0030.f260, c0030.f257, linearLayout, false);
        LinearLayout linearLayout2 = new LinearLayout(C0030.f255);
        linearLayout2.setOrientation(1);
        Object[] objArr2 = new Object[length];
        EditText[] editTextArr2 = new EditText[length];
        String name = constructor.getName();
        int lastIndexOf = name.lastIndexOf(".");
        StringBuilder sb = new StringBuilder();
        if (lastIndexOf == -1) {
            lastIndexOf = 0;
        }
        String sb2 = sb.append(name.substring(lastIndexOf)).append(length).toString();
        try {
            jSONObject = new JSONObject(c0030.f262.getString(sb2, "{}"));
        } catch (Throwable th2) {
            jSONObject = null;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type = constructor.getGenericParameterTypes()[i2];
            editTextArr2[i2] = new EditText(C0030.f255);
            if (jSONObject != null) {
                editTextArr2[i2].setText(jSONObject.optString(type.toString() + i2, ""));
            }
            editTextArr2[i2].setTextColor(-65536);
            editTextArr2[i2].setHint(type.toString());
            editTextArr2[i2].setHintTextColor(Color.parseColor("#a2a2a2"));
            editTextArr2[i2].setOnLongClickListener(new ViewOnLongClickListenerC0035(c0030));
            if (type.toString().equals("boolean")) {
                editTextArr2[i2].setInputType(0);
                editTextArr2[i2].setOnClickListener(new ViewOnClickListenerC0048(c0030));
            }
            c0030.m47(linearLayout2, editTextArr2[i2], null, null);
        }
        Button button = new Button(AbstractC0100.f255);
        button.setText("构造");
        c0030.m47(linearLayout2, button, new C0044(c0030, length, constructor, editTextArr2, objArr2, jSONObject, sb2, linearLayout), null);
        ScrollView scrollView = new ScrollView(C0030.f255);
        c0030.m47(scrollView, linearLayout2, null, null).m47(linearLayout, scrollView, null, null);
        int size = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        c0030.f257.width = size;
        c0030.f257.height = size;
        c0030.f260.addView(linearLayout, c0030.f257);
    }
}
