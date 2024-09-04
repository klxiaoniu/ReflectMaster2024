package p000;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

/* compiled from: 9KPFQY.KUV */
/* renamed from: ۦ　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0101 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    WindowManager f263;

    /* renamed from: ۥ */
    LinearLayout f264;

    /* renamed from: ۦ */
    LinearLayout f265;

    /* renamed from: ۬ */
    public Context f267;

    /* renamed from: 　́ */
    AdapterView.OnItemClickListener f269;

    /* renamed from: 　ۥ */
    public ListAdapter f270;

    /* renamed from: 　ۦ */
    public String f271;

    /* renamed from: 　۬ */
    TextView f272;

    /* renamed from: 　　 */
    ListView f273;

    /* renamed from: ۬　 */
    public boolean f268 = true;

    /* renamed from: ۦ　 */
    WindowManager.LayoutParams f266 = new WindowManager.LayoutParams();

    public C0101(Context context, WindowManager windowManager) {
        this.f267 = context;
        this.f263 = windowManager;
        this.f266.x = 0;
        this.f266.y = 0;
        this.f266.flags = 32;
        this.f266.type = 2;
        this.f265 = new LinearLayout(context);
        this.f265.setBackgroundColor(-12303292);
        this.f265.setOrientation(1);
        new C0167(context, windowManager, this.f266, this.f265);
        this.f272 = new TextView(context);
        this.f272.setTextColor(Color.parseColor("#c7c7c7"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 5, 0, 15);
        this.f272.setLayoutParams(layoutParams);
        this.f272.setGravity(17);
        this.f272.setTextColor(-1);
        this.f265.addView(this.f272);
        this.f264 = new LinearLayout(context);
        this.f264.setOrientation(0);
        this.f264.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f264.setGravity(17);
        this.f265.addView(this.f264);
        this.f273 = new ListView(context);
        this.f273.setFastScrollEnabled(true);
        this.f273.setOnItemClickListener(this);
        this.f265.addView(this.f273);
    }

    public final void setListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f269 = onItemClickListener;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f269 != null) {
            this.f269.onItemClick(adapterView, view, i, j);
        }
        if (this.f268) {
            this.f263.removeView(this.f265);
        }
    }

    /* renamed from: ۬ */
    public final void m50(List<String> list) {
        this.f270 = new C0134(this.f267, (String[]) list.toArray(new String[0]));
    }

    /* renamed from: ۬ */
    public final void m49(int i, int i2) {
        this.f266.width = i;
        this.f266.height = i2;
        this.f272.setBackgroundColor(-12303292);
        if (this.f271 != null) {
            this.f272.setText(this.f271);
        }
        if (this.f270 != null) {
            this.f273.setAdapter(this.f270);
        }
        this.f263.addView(this.f265, this.f266);
    }
}
