package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.BaseType;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Modifier;

/* compiled from: 'FKV(KGNF9KPFQY */
/* renamed from: ́̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0056 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ LinearLayout f127;

    /* renamed from: ۦ */
    final /* synthetic */ C0066 f128;

    /* renamed from: ۬ */
    final /* synthetic */ EditText f129;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0056(C0066 c0066, EditText editText, LinearLayout linearLayout) {
        this.f128 = c0066;
        this.f129 = editText;
        this.f127 = linearLayout;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        Object obj;
        C0066 c0066 = this.f128;
        String obj2 = this.f129.getText().toString();
        switch (C0055.f126[BaseType.getByBase(c0066.f152.getType().getName()).ordinal()]) {
            case 1:
                obj = Integer.valueOf(obj2);
                break;
            case 2:
                obj = Short.valueOf(obj2);
                break;
            case 3:
                obj = Long.valueOf(obj2);
                break;
            case 4:
                obj = Byte.valueOf(obj2);
                break;
            case 5:
                obj = Boolean.valueOf(obj2);
                break;
            case 6:
                obj = Character.valueOf(obj2.charAt(0));
                break;
            case 7:
                obj = Float.valueOf(obj2);
                break;
            case 8:
                obj = Double.valueOf(obj2);
                break;
            default:
                if (Constants.getVar(obj2) == null) {
                    if (!obj2.equals("$this")) {
                        if (!obj2.equals("$context")) {
                            boolean equals = obj2.equals("$null");
                            obj = obj2;
                            if (equals) {
                                obj = null;
                                break;
                            }
                        } else {
                            obj = C0066.f255;
                            break;
                        }
                    } else {
                        obj = c0066.f259;
                        break;
                    }
                } else {
                    obj = Constants.getVar(obj2);
                    break;
                }
                break;
        }
        try {
            this.f128.f152.set(Modifier.isStatic(this.f128.f152.getModifiers()) ? null : this.f128.f259, obj);
            ToastUtils.show("修改完成");
            if (this.f128.f153.f143 != null) {
                this.f128.f153.f143.notifyDataSetChanged();
            }
            this.f128.f260.removeView(this.f127);
        } catch (Throwable th) {
            HandlerC0184.m102(AbstractC0100.f255, "Set value err", th);
        }
    }
}
