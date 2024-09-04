package p000;

import android.view.View;
import android.widget.AdapterView;

import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Constructor;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀́ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0036 implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    final /* synthetic */ int f85;

    /* renamed from: ۦ */
    final /* synthetic */ C0034 f86;

    /* renamed from: ۬ */
    final /* synthetic */ AdapterView f87;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0036(C0034 c0034, AdapterView adapterView, int i) {
        this.f86 = c0034;
        this.f87 = adapterView;
        this.f85 = i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Constructor constructor = (Constructor) this.f87.getItemAtPosition(this.f85);
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        switch (i) {
            case 0:
                C0030 c0030 = this.f86.f83;
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length == 0) {
                    ToastUtils.show("该构造器无参数");
                    return;
                }
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = parameterTypes[i2].getName();
                }
                C0101 c0101 = new C0101(C0030.f255, c0030.f260);
                c0101.f271 = "构造器参数";
                c0101.f270 = new C0134(c0101.f267, strArr);
                c0101.setListener(new C0046(c0030, parameterTypes));
                c0101.m49(700, 700);
                return;
            case 1:
                C0030.m44(constructor.toGenericString());
                return;
            default:
                return;
        }
    }
}
