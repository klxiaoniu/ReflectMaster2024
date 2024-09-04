package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: 8KGY+ORN */
/* renamed from: ۬́۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0112 implements InterfaceC0069 {
    @Override // p000.InterfaceC0069
    /* renamed from: ۬ */
    public final void mo33(C0063 c0063, LinearLayout linearLayout) {
        boolean z;
        View view = (View) c0063.f259;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(view, new Object[0]);
            Field[] declaredFields = invoke.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                Field field = declaredFields[i];
                field.setAccessible(true);
                if (field.get(invoke) != null) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                Button button = new Button(C0063.f255);
                button.setText("查看点击事件");
                button.setOnClickListener(new ViewOnClickListenerC0109(this, invoke));
                linearLayout.addView(button);
            }
        } catch (Throwable th) {
        }
    }
}
