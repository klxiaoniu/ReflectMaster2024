package p000;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.qingyu.rm.reflect.data.Constants;
import java.util.ArrayList;

/* compiled from: 5VCTV#EV9KPFQY */
/* renamed from: ̀ۦۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0040 {

    /* renamed from: ۬ */
    Context f96;

    public C0040(Context context) {
        this.f96 = context;
        try {
            m26();
        } catch (Throwable th) {
            HandlerC0184.m102(context, th);
        }
    }

    /* renamed from: ۬ */
    private void m26() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = this.f96.getPackageManager();
            for (ActivityInfo activityInfo : packageManager.getPackageInfo(this.f96.getPackageName(), 1).activities) {
                String str = activityInfo.name;
                String charSequence = activityInfo.loadLabel(packageManager).toString();
                if (str.startsWith(".")) {
                    str = activityInfo.packageName + str;
                }
                arrayList.add(Pair.create(charSequence, str));
            }
            WindowManager windowManager = (WindowManager) (this.f96 != null ? this.f96 : Constants.context).getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
            layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION;
            layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
            layoutParams.height = i;
            layoutParams.width = i;
            LinearLayout linearLayout = new LinearLayout(this.f96);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-12303292);
            C0167 c0167 = new C0167(this.f96, windowManager, layoutParams, linearLayout, true);
            TextView textView = new TextView(this.f96);
            textView.setBackgroundColor(-12303292);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setText("Activity启动");
            linearLayout.addView(textView);
            ListView listView = new ListView(this.f96);
            listView.setDivider(new ColorDrawable(Color.rgb(36, 33, 67)));
            listView.setDividerHeight(5);
            listView.setTextFilterEnabled(true);
            listView.setFastScrollEnabled(true);
            C0144 c0144 = new C0144(this.f96, arrayList);
            listView.setAdapter((ListAdapter) c0144);
            listView.setOnItemClickListener(new C0033(this));
            c0167.f416 = new C0032(this, c0144);
            linearLayout.addView(listView);
            windowManager.addView(linearLayout, layoutParams);
        } catch (Throwable th) {
            HandlerC0184.m102(this.f96, th);
        }
    }
}
