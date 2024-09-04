package p000;

import android.view.View;
import android.widget.AdapterView;

import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Method;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: ۬۬ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0120 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ int f313;

    /* renamed from: ۦ */
    final /* synthetic */ C0121 f314;

    /* renamed from: ۬ */
    final /* synthetic */ AdapterView f315;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0120(C0121 c0121, AdapterView adapterView, int i) {
        this.f314 = c0121;
        this.f315 = adapterView;
        this.f313 = i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Method method = (Method) this.f315.getItemAtPosition(this.f313);
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        switch (i) {
            case 0:
                C0123 c0123 = this.f314.f316;
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length == 0) {
                    ToastUtils.show("该函数无参数");
                    return;
                }
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = parameterTypes[i2].getName();
                }
                C0101 c0101 = new C0101(C0123.f255, c0123.f260);
                c0101.f271 = "函数参数";
                c0101.f270 = new C0134(c0101.f267, strArr);
                c0101.setListener(new C0194(c0123, parameterTypes));
                c0101.m49(700, 700);
                return;
            case 1:
                C0123.m44(method.getName());
                return;
            case 2:
                C0123.m44(method.toGenericString());
                return;
            default:
                return;
        }
    }
}
