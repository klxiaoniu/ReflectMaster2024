package p000;

import android.R;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.qingyu.rm.Main;

/* compiled from: /CKP */
/* renamed from: 　ۦ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0026 implements View.OnClickListener {

    /* renamed from: ́ */
    final /* synthetic */ Main f353;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f354;

    public ViewOnClickListenerC0026(Main main, EditText editText) {
        this.f353 = main;
        this.f354 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            int parseInt = Integer.parseInt(this.f354.getText().toString());
            WindowManager windowManager = (WindowManager) this.f353.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = parseInt;
            layoutParams.width = parseInt;
            layoutParams.type = 2;
            layoutParams.flags = 8;
            LinearLayout linearLayout = new LinearLayout(this.f353);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-12303292);
            new C0167(this.f353, windowManager, layoutParams, linearLayout);
            ListView listView = new ListView(this.f353);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f353, R.layout.simple_list_item_1);
            for (int i = 0; i < 10; i++) {
                arrayAdapter.add("Item " + i);
            }
            listView.setAdapter((ListAdapter) arrayAdapter);
            linearLayout.addView(listView);
            windowManager.addView(linearLayout, layoutParams);
        } catch (Throwable th) {
            HandlerC0184.m102(this.f353, "预览错误", th);
        }
    }
}
