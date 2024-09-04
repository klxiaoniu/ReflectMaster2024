package p000;

import android.graphics.Color;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: ۬۬́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0119 implements AdapterView.OnItemClickListener {

    /* renamed from: ۬ */
    final /* synthetic */ C0123 f312;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0119(C0123 c0123) {
        this.f312 = c0123;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object invoke;
        JSONObject jSONObject;
        Method method = (Method) adapterView.getItemAtPosition(i);
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        C0123 c0123 = this.f312;
        Object[] objArr = new Object[0];
        EditText[] editTextArr = new EditText[0];
        int length = method.getParameterTypes().length;
        if (length == 0) {
            try {
                if (Modifier.isStatic(method.getModifiers())) {
                    invoke = method.invoke(null, objArr);
                } else {
                    invoke = method.invoke(c0123.f259, objArr);
                }
                if (invoke == null) {
                    ToastUtils.show("result is null");
                    return;
                } else {
                    ToastUtils.show("正在打开结果：" + invoke);
                    new C0063(invoke);
                    return;
                }
            } catch (Throwable th) {
                HandlerC0184.m102(AbstractC0100.f255, th);
                return;
            }
        }
        LinearLayout linearLayout = new LinearLayout(C0123.f255);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        new C0167(AbstractC0100.f255, c0123.f260, c0123.f257, linearLayout, false);
        LinearLayout linearLayout2 = new LinearLayout(C0123.f255);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(C0123.f255);
        textView.setGravity(17);
        textView.setTextColor(Color.parseColor("#c7c7c7"));
        textView.setText("M：" + method.getName());
        c0123.m47(linearLayout, textView, null, null);
        Object[] objArr2 = new Object[length];
        EditText[] editTextArr2 = new EditText[length];
        String name = method.getDeclaringClass().getName();
        int lastIndexOf = name.lastIndexOf(".");
        StringBuilder sb = new StringBuilder();
        if (lastIndexOf == -1) {
            lastIndexOf = 0;
        }
        String sb2 = sb.append(name.substring(lastIndexOf)).append(".").append(method.getName()).append(length).toString();
        try {
            jSONObject = new JSONObject(c0123.f262.getString(sb2, "{}"));
        } catch (Throwable th2) {
            jSONObject = null;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type = method.getGenericParameterTypes()[i2];
            editTextArr2[i2] = new EditText(C0123.f255);
            if (jSONObject != null) {
                editTextArr2[i2].setText(jSONObject.optString(type.toString() + i2, ""));
            }
            editTextArr2[i2].setTextColor(-65536);
            editTextArr2[i2].setHint(type.toString());
            editTextArr2[i2].setHintTextColor(Color.parseColor("#a2a2a2"));
            editTextArr2[i2].setOnLongClickListener(new ViewOnLongClickListenerC0197(c0123));
            if (type.toString().equals("boolean")) {
                editTextArr2[i2].setInputType(0);
                editTextArr2[i2].setOnClickListener(new ViewOnClickListenerC0196(c0123));
            }
            c0123.m47(linearLayout2, editTextArr2[i2], null, null);
        }
        Button button = new Button(AbstractC0100.f255);
        button.setText("运行");
        c0123.m47(linearLayout2, button, new C0195(c0123, length, method, editTextArr2, objArr2, jSONObject, sb2, linearLayout), null);
        ScrollView scrollView = new ScrollView(C0123.f255);
        c0123.m47(scrollView, linearLayout2, null, null).m47(linearLayout, scrollView, null, null);
        WindowManager.LayoutParams layoutParams = c0123.f257;
        int size = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        c0123.f257.height = size;
        layoutParams.width = size;
        c0123.f260.addView(linearLayout, c0123.f257);
    }
}
