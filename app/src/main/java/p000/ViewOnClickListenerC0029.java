package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.window.constructor.Btn;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Constructor;
import java.util.Collection;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ̀̀́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0029 extends LinearLayout implements View.OnClickListener {

    /* renamed from: ́ */
    private Context f69;

    /* renamed from: ۦ */
    private Object f70;

    /* renamed from: ۬ */
    private C0030 f71;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0029(C0030 c0030) {
        super(C0030.f255);
        this.f71 = c0030;
        this.f69 = C0030.f255;
        this.f70 = c0030.f259;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f69);
        LinearLayout linearLayout = new LinearLayout(this.f69);
        m22(linearLayout);
        horizontalScrollView.addView(linearLayout);
        addView(horizontalScrollView);
    }

    /* renamed from: ۬ */
    private void m22(LinearLayout linearLayout) {
        for (Btn btn : Btn.values()) {
            Button button = new Button(this.f69);
            button.setText(btn.text);
            button.setId(btn.f23id);
            button.setOnClickListener(this);
            linearLayout.addView(button);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0031.f77[Btn.getByID(view.getId()).ordinal()]) {
            case 1:
                C0030 c0030 = this.f71;
                Button button = (Button) view;
                if (c0030.f75 != null) {
                    if (!c0030.f74) {
                        Class superclass = c0030.f261.getSuperclass();
                        if (superclass == null) {
                            ToastUtils.show("当前类没有父类！");
                            return;
                        }
                        c0030.f72.clear();
                        for (Constructor<?> constructor : superclass.getConstructors()) {
                            c0030.f72.put(constructor.toString(), constructor);
                        }
                        for (Constructor<?> constructor2 : superclass.getDeclaredConstructors()) {
                            c0030.f72.put(constructor2.toString(), constructor2);
                        }
                        button.setText("本类构造器");
                    } else {
                        c0030.f72.clear();
                        for (Constructor<?> constructor3 : c0030.f261.getDeclaredConstructors()) {
                            c0030.f72.put(constructor3.toString(), constructor3);
                        }
                        button.setText("父类构造器");
                    }
                    C0132 c0132 = c0030.f75;
                    Collection<Constructor> values = c0030.f72.values();
                    Constructor[] constructorArr = (Constructor[]) values.toArray(new Constructor[values.size()]);
                    c0132.f338 = constructorArr;
                    c0132.f340 = constructorArr;
                    c0030.f75.notifyDataSetChanged();
                    if (c0030.f76 != null) {
                        c0030.f75.getFilter().filter(c0030.f76);
                    }
                    c0030.f74 = !c0030.f74;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
