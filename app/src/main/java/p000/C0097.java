package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.reflect.widget.ViewLineView;
import com.qingyu.rm.util.ToastUtils;
import com.qingyu.rm.widget.FloatView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: /CKP9KPFQY */
/* renamed from: ۦ۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0097 {

    /* renamed from: ́ */
    XC_MethodHook.MethodHookParam f238;

    /* renamed from: ۥ */
    Object f239;

    /* renamed from: ۦ */
    Context f240;

    /* renamed from: ۦ́ */
    LinearLayout f241;

    /* renamed from: ۬ */
    XC_LoadPackage.LoadPackageParam f244;

    /* renamed from: ۬　 */
    FloatView f246;

    /* renamed from: 　́ */
    Dialog f247;

    /* renamed from: 　　 */
    WindowManager f251;

    /* renamed from: 　۬ */
    WindowManager.LayoutParams f250 = new WindowManager.LayoutParams();

    /* renamed from: ۬۬ */
    private boolean f245 = true;

    /* renamed from: 　ۦ */
    int f249 = 0;

    /* renamed from: 　ۥ */
    int f248 = 0;

    /* renamed from: ۦ　 */
    int f243 = 0;

    /* renamed from: ۦ۬ */
    int f242 = 0;

    public C0097(XC_LoadPackage.LoadPackageParam loadPackageParam, XC_MethodHook.MethodHookParam methodHookParam) {
        this.f244 = loadPackageParam;
        this.f238 = methodHookParam;
        Context context = (Context) methodHookParam.thisObject;
        this.f240 = context;
        this.f239 = context;
        try {
            ToastUtils.show("创建新窗口");
        } catch (Throwable th) {
        }
        m40();
    }

    public C0097(Context context, Dialog dialog) {
        this.f240 = context;
        this.f239 = context;
        this.f247 = dialog;
        try {
            if (dialog != null) {
                ToastUtils.show("创建Dialog窗口");
            } else {
                ToastUtils.show("创建测试窗口");
            }
        } catch (Throwable th) {
        }
        m40();
    }

    /* renamed from: ۬ */
    private void m40() {
        this.f251 = (WindowManager) this.f240.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f251.getDefaultDisplay().getMetrics(displayMetrics);
        this.f250.width = displayMetrics.widthPixels / 2;
        this.f250.height = (displayMetrics.heightPixels / 4) * 3;
        this.f250.x = 0;
        this.f250.y = 0;
        this.f250.flags = 8;
        this.f250.type = 2;
        this.f250.format = 1;
        this.f241 = new LinearLayout(this.f240);
        this.f241.setOrientation(1);
        this.f241.setBackgroundColor(Color.rgb(255, 250, 250));
        TextView textView = new TextView(this.f240);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 8, 0, 8);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(this.f240.getClass().getName());
        textView.setTextColor(-16777216);
        textView.setOnClickListener(new ViewOnClickListenerC0094(this));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC0052(this, textView));
        this.f241.addView(textView);
        Button button = new Button(this.f240);
        button.setBackgroundColor(-1);
        button.setTextColor(-16777216);
        button.setOnTouchListener(new ViewOnTouchListenerC0049(this));
        button.setText("缩小" + String.format(Locale.CHINA, "%d x %d", Integer.valueOf(this.f250.width), Integer.valueOf(this.f250.height)));
        this.f241.addView(button);
        Button button2 = new Button(this.f240);
        button2.setBackgroundColor(-1);
        button2.setTextColor(-16777216);
        button2.setText("当前Activity");
        button2.setOnClickListener(new ViewOnClickListenerC0051(this));
        this.f241.addView(button2);
        if (this.f247 != null) {
            Button button3 = new Button(this.f240);
            button3.setBackgroundColor(-1);
            button3.setTextColor(-16777216);
            button3.setText("当前Dialog");
            button3.setOnClickListener(new ViewOnClickListenerC0050(this));
            this.f241.addView(button3);
        }
        Button button4 = new Button(this.f240);
        button4.setBackgroundColor(-1);
        button4.setTextColor(-16777216);
        button4.setText("View获取(子)");
        button4.setOnClickListener(new ViewOnClickListenerC0043(this));
        this.f241.addView(button4);
        Button button5 = new Button(this.f240);
        button5.setBackgroundColor(-1);
        button5.setTextColor(-16777216);
        button5.setText("我的变量");
        button5.setOnClickListener(new ViewOnClickListenerC0042(this));
        this.f241.addView(button5);
        Button button6 = new Button(this.f240);
        button6.setBackgroundColor(-1);
        button6.setTextColor(-16777216);
        button6.setText("旋转芒星");
        button6.setOnClickListener(new ViewOnClickListenerC0039(this));
        this.f241.addView(button6);
        Button button7 = new Button(this.f240);
        button7.setBackgroundColor(-1);
        button7.setTextColor(-16777216);
        button7.setText("隐藏芒星");
        button7.setOnClickListener(new ViewOnClickListenerC0041(this));
        this.f241.addView(button7);
        m43(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public void m43(boolean z) {
        if (this.f245) {
            if (this.f246 != null) {
                this.f251.removeView(this.f241);
            }
            this.f250.width = 138;
            this.f250.height = 138;
            if (!z) {
                if (this.f246 == null) {
                    this.f246 = new FloatView(this.f240, Constants.getSP().getBoolean(Constants.XZWJX.value, false));
                    this.f246.setOnTouchListener(new ViewOnTouchListenerC0095(this));
                }
                this.f251.addView(this.f246, this.f250);
            }
            this.f245 = false;
            return;
        }
        if (this.f246 != null) {
            this.f251.removeView(this.f246);
        }
        this.f250.width = 400;
        this.f250.height = -2;
        if (!z) {
            this.f251.addView(this.f241, this.f250);
        }
        this.f245 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public void m42(Window window, boolean z) {
        List<View> m39 = m39(window.getDecorView());
        int i = 0;
        while (i < m39.size()) {
            if (z && (m39.get(i) instanceof ViewGroup)) {
                m39.remove(i);
                i = 0;
            }
            i++;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2;
        layoutParams.flags = 8;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = 1;
        ViewLineView viewLineView = new ViewLineView(this.f240, m39);
        viewLineView.setListener(new C0053(this, viewLineView));
        this.f251.addView(viewLineView, layoutParams);
    }

    /* renamed from: ۬ */
    private List<View> m39(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m39(childAt));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public static /* synthetic */ void m41(C0097 c0097, String str, List list) {
        if (list.size() == 0) {
            ToastUtils.show("没有对象");
            return;
        }
        C0101 c0101 = new C0101(c0097.f240, c0097.f251);
        c0101.f270 = new C0136(c0097.f240, list);
        c0101.f271 = str;
        c0101.setListener(new C0096(c0097, list));
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        c0101.m49(i, i);
    }
}
