package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Process;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.qingyu.rm.util.ToastUtils;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: (KGNF9KPFQY */
/* renamed from: ́́　, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0063 extends AbstractC0100 {

    /* renamed from: ۦ́ */
    Map<String, Field> f141;

    /* renamed from: ۦۦ */
    private boolean f142;

    /* renamed from: ۦ۬ */
    C0131 f143;

    /* renamed from: ۦ　 */
    Class f144;

    /* renamed from: ۬۬ */
    private ListView f145;

    /* renamed from: ۬　 */
    String f146;

    public C0063(Object obj) {
        super(obj, new Object[0]);
        this.f146 = null;
        this.f142 = false;
    }

    public C0063(XC_LoadPackage.LoadPackageParam loadPackageParam, XC_MethodHook.MethodHookParam methodHookParam, Context context, Object obj) {
        super(loadPackageParam, methodHookParam, context, obj, new Object[0]);
        this.f146 = null;
        this.f142 = false;
    }

    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        if (this.f259 == null) {
            ToastUtils.show("object is null...");
            return;
        }
        this.f261 = this.f259.getClass();
        this.f141 = new HashMap();
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    public final void mo23() {
        if (this.f261.isArray()) {
            ToastUtils.show("这是一个数组来的");
        }
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(f255);
        textView.setText("变量");
        textView.setTextColor(-65536);
        m45(linearLayout, textView);
        new C0167(AbstractC0100.f255, this.f260, this.f257, linearLayout, true).f416 = new C0062(this);
        TextView textView2 = new TextView(f255);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 100));
        textView2.setGravity(19);
        textView2.setPadding(15, 0, 0, 0);
        textView2.setText(this.f261.getName());
        textView2.setTextColor(-65536);
        textView2.setBackgroundColor(-1);
        m47(linearLayout, textView2, new C0059(this, textView2), new C0061(this, textView2)).m45(linearLayout, new ViewOnClickListenerC0078(this));
        this.f145 = new ListView(f255);
        this.f145.setTextFilterEnabled(true);
        this.f145.setFastScrollEnabled(true);
        this.f145.setDivider(new ColorDrawable(2131165252));
        this.f145.setDividerHeight(5);
        this.f145.setOnItemClickListener(new C0060(this));
        this.f145.setOnItemLongClickListener(new C0073(this));
        for (Field field : this.f261.getDeclaredFields()) {
            this.f141.put(field.toString(), field);
        }
        this.f143 = new C0131(f255, this.f141.values(), this.f259);
        this.f145.setAdapter((ListAdapter) this.f143);
        m45(linearLayout, this.f145);
        this.f260.addView(linearLayout, this.f257);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public final void m32(Button button) {
        if (this.f143 != null) {
            if (!this.f142) {
                Class superclass = this.f261.getSuperclass();
                if (superclass == null) {
                    ToastUtils.show("此类没有父类！");
                    return;
                }
                this.f141.clear();
                for (Field field : superclass.getFields()) {
                    this.f141.put(field.toString(), field);
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    this.f141.put(field2.toString(), field2);
                }
                button.setText("本类变量");
            } else {
                this.f141.clear();
                for (Field field3 : this.f261.getDeclaredFields()) {
                    this.f141.put(field3.toString(), field3);
                }
                button.setText("父类变量");
            }
            C0131 c0131 = this.f143;
            Collection<Field> values = this.f141.values();
            Field[] fieldArr = (Field[]) values.toArray(new Field[values.size()]);
            c0131.f337 = fieldArr;
            c0131.f334 = fieldArr;
            this.f143.notifyDataSetChanged();
            if (this.f146 != null) {
                this.f143.getFilter().filter(this.f146);
            }
            this.f142 = !this.f142;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۦ */
    public static boolean m31() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Context context = f255;
        if (C0190.m119(context, "android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
            Context context2 = f255;
            if (C0190.m119(context2, "android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid(), context2.getPackageName()) == 0) {
                return true;
            }
        }
        return false;
    }
}
