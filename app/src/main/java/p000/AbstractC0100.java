package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: $CUG9KPFQY */
/* renamed from: ۦ　ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0100 {

    /* renamed from: ́ */
    public static XC_MethodHook.MethodHookParam f254;

    /* renamed from: ۦ */
    public static Context f255;

    /* renamed from: ۬ */
    public static XC_LoadPackage.LoadPackageParam f256;

    /* renamed from: ۥ */
    public WindowManager.LayoutParams f257;

    /* renamed from: 　́ */
    public Object[] f258;

    /* renamed from: 　ۥ */
    public Object f259;

    /* renamed from: 　ۦ */
    public WindowManager f260;

    /* renamed from: 　۬ */
    public Class f261;

    /* renamed from: 　　 */
    public SharedPreferences f262;

    /* renamed from: ́ */
    protected abstract void mo23();

    public AbstractC0100(Object obj, Object... objArr) {
        this(f256, f254, f255, obj, objArr);
    }

    public AbstractC0100(XC_LoadPackage.LoadPackageParam loadPackageParam, XC_MethodHook.MethodHookParam methodHookParam, Context context, Object obj, Object... objArr) {
        f256 = loadPackageParam;
        f254 = methodHookParam;
        f255 = context;
        this.f259 = obj;
        this.f258 = objArr;
        if (f255 != null) {
            Context context2 = f255;
            this.f262 = context2.getSharedPreferences(context2.getClass().getName(), 0);
        } else if (this.f259 != null) {
            this.f262 = Constants.context.getSharedPreferences(this.f259.getClass().getName(), 0);
        } else {
            this.f262 = Constants.context.getSharedPreferences("rm", 0);
        }
        mo24();
    }

    /* renamed from: ۬ */
    public void mo24() {
        this.f260 = (WindowManager) (f255 != null ? f255 : Constants.context).getSystemService("window");
        this.f257 = new WindowManager.LayoutParams();
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        WindowManager.LayoutParams layoutParams = this.f257;
        this.f257.height = i;
        layoutParams.width = i;
        this.f257.type = 2;
        this.f257.flags = 32;
        try {
            mo23();
        } catch (Throwable th) {
            HandlerC0184.m102(f255, th);
        }
        WindowManager.LayoutParams layoutParams2 = this.f257;
        this.f257.height = i;
        layoutParams2.width = i;
    }

    /* renamed from: ۬ */
    public final AbstractC0100 m45(ViewGroup viewGroup, View view) {
        return m47(viewGroup, view, null, null);
    }

    /* renamed from: ۬ */
    public final AbstractC0100 m46(ViewGroup viewGroup, View view, InterfaceC0090 interfaceC0090) {
        return m47(viewGroup, view, interfaceC0090, null);
    }

    /* renamed from: ۬ */
    public final AbstractC0100 m47(ViewGroup viewGroup, View view, InterfaceC0090 interfaceC0090, InterfaceC0083 interfaceC0083) {
        if (viewGroup != null && view != null) {
            if (interfaceC0090 != null && interfaceC0090 != null) {
                view.setOnClickListener(new ViewOnClickListenerC0093(this, interfaceC0090));
            }
            if (interfaceC0083 != null && interfaceC0083 != null) {
                view.setOnLongClickListener(new ViewOnLongClickListenerC0092(this, interfaceC0083));
            }
            viewGroup.addView(view);
        }
        return this;
    }

    /* renamed from: ۬ */
    public final void m48(EditText editText) {
        C0101 c0101 = new C0101(f255, this.f260);
        c0101.f271 = "选择参数";
        ArrayList arrayList = new ArrayList();
        arrayList.add("$this" + (this.f259 != null ? "\n" + this.f259.getClass().getName() : ""));
        arrayList.add("$context" + (f255 != null ? "\n" + f255.getClass().getName() : ""));
        arrayList.add("$null\nnull");
        List<Object> vars = Constants.getVars();
        for (int i = 0; i < vars.size(); i++) {
            arrayList.add("$V" + i + "\n" + vars.get(i).getClass().getName());
        }
        c0101.m50(arrayList);
        c0101.setListener(new C0089(this, editText));
        c0101.m49(700, 700);
    }

    /* renamed from: ۬ */
    public static void m44(CharSequence charSequence) {
        ((ClipboardManager) f255.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("RM", charSequence));
        ToastUtils.show("已复制到剪贴板");
    }
}
