package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.window.method.Btn;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Method;
import java.util.Collection;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ۬́ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0111 extends LinearLayout implements View.OnClickListener {

    /* renamed from: ́ */
    private Context f291;

    /* renamed from: ۦ */
    private Object f292;

    /* renamed from: ۬ */
    private C0123 f293;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0111(C0123 c0123) {
        super(C0123.f255);
        this.f293 = c0123;
        this.f291 = C0123.f255;
        this.f292 = c0123.f259;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f291);
        LinearLayout linearLayout = new LinearLayout(this.f291);
        m52(linearLayout);
        horizontalScrollView.addView(linearLayout);
        addView(horizontalScrollView);
    }

    /* renamed from: ۬ */
    private void m52(LinearLayout linearLayout) {
        for (Btn btn : Btn.values()) {
            Button button = new Button(this.f291);
            button.setText(btn.text);
            button.setId(btn.f28id);
            button.setOnClickListener(this);
            linearLayout.addView(button);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0110.f290[Btn.getByID(view.getId()).ordinal()]) {
            case 1:
                C0123 c0123 = this.f293;
                Button button = (Button) view;
                if (c0123.f321 != null) {
                    if (!c0123.f319) {
                        Class superclass = c0123.f261.getSuperclass();
                        if (superclass == null) {
                            ToastUtils.show("当前类没有父类！");
                            return;
                        }
                        c0123.f318.clear();
                        for (Method method : c0123.f261.getMethods()) {
                            c0123.f318.put(method.toString(), method);
                        }
                        for (Method method2 : superclass.getDeclaredMethods()) {
                            c0123.f318.put(method2.toString(), method2);
                        }
                        button.setText("本类函数");
                    } else {
                        c0123.f318.clear();
                        for (Method method3 : c0123.f261.getDeclaredMethods()) {
                            c0123.f318.put(method3.toString(), method3);
                        }
                        button.setText("父类函数");
                    }
                    C0138 c0138 = c0123.f321;
                    Collection<Method> values = c0123.f318.values();
                    Method[] methodArr = (Method[]) values.toArray(new Method[values.size()]);
                    c0138.f350 = methodArr;
                    c0138.f348 = methodArr;
                    c0123.f321.notifyDataSetChanged();
                    if (c0123.f322 != null) {
                        c0123.f321.getFilter().filter(c0123.f322);
                    }
                    c0123.f319 = !c0123.f319;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
