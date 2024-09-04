package p000;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/* compiled from: #EVKQP$CT8KGY */
/* renamed from: 　۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0167 {

    /* renamed from: ́ */
    WindowManager.LayoutParams f408;

    /* renamed from: ۥ */
    int f409;

    /* renamed from: ۦ */
    ViewGroup f410;

    /* renamed from: ۦ　 */
    private boolean f411;

    /* renamed from: ۬ */
    WindowManager f412;

    /* renamed from: ۬　 */
    private LinearLayout f413;

    /* renamed from: 　́ */
    int f414;

    /* renamed from: 　ۥ */
    private Context f415;

    /* renamed from: 　ۦ */
    public InterfaceC0103 f416;

    /* renamed from: 　۬ */
    int f417;

    /* renamed from: 　　 */
    int f418;

    public C0167(Context context, WindowManager windowManager, WindowManager.LayoutParams layoutParams, ViewGroup viewGroup) {
        this(context, windowManager, layoutParams, viewGroup, false);
    }

    public C0167(Context context, WindowManager windowManager, WindowManager.LayoutParams layoutParams, ViewGroup viewGroup, boolean z) {
        this.f415 = context;
        this.f412 = windowManager;
        this.f408 = layoutParams;
        this.f410 = viewGroup;
        this.f411 = z;
        if (this.f408.width == 0) {
            this.f408.width = this.f415.getResources().getDisplayMetrics().widthPixels;
        }
        if (this.f408.height == 0) {
            this.f408.height = this.f415.getResources().getDisplayMetrics().heightPixels;
        }
        this.f413 = new LinearLayout(this.f415);
        this.f413.setOrientation(LinearLayout.VERTICAL);
        LinearLayout linearLayout = new LinearLayout(this.f415);
        Button button = new Button(this.f415);
        button.setText("++");
        button.setOnTouchListener(new ViewOnTouchListenerC0102(this, false));
        Button button2 = new Button(this.f415);
        button2.setText("关闭");
        button2.setOnClickListener(new ViewOnClickListenerC0164(this));
        Button button3 = new Button(this.f415);
        button3.setText("移动");
        button3.setOnTouchListener(new ViewOnTouchListenerC0166(this));
        Button button4 = new Button(this.f415);
        button4.setText("++");
        button4.setOnTouchListener(new ViewOnTouchListenerC0102(this, true));
        linearLayout.addView(button);
        linearLayout.addView(button2);
        linearLayout.addView(button3);
        linearLayout.addView(button4);
        linearLayout.setBackgroundColor(Color.parseColor("#434343"));
        this.f413.addView(linearLayout);
        if (this.f411) {
            EditText editText = new EditText(this.f415);
            editText.setHint("输入要查询的关键字");
            editText.setTextColor(-1);
            editText.setHintTextColor(Color.parseColor("#a2a2a2"));
            editText.addTextChangedListener(new C0165(this, editText));
            this.f413.addView(editText);
        }
        this.f410.addView(this.f413);
    }
}
