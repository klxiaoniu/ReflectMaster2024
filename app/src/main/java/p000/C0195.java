package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.BaseType;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: /GVJQF9KPFQY */
/* renamed from: 　　　ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0195 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ Method f484;

    /* renamed from: ۥ */
    final /* synthetic */ Object[] f485;

    /* renamed from: ۦ */
    final /* synthetic */ EditText[] f486;

    /* renamed from: ۬ */
    final /* synthetic */ int f487;

    /* renamed from: 　́ */
    final /* synthetic */ LinearLayout f488;

    /* renamed from: 　ۦ */
    final /* synthetic */ C0123 f489;

    /* renamed from: 　۬ */
    final /* synthetic */ String f490;

    /* renamed from: 　　 */
    final /* synthetic */ JSONObject f491;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0195(C0123 c0123, int i, Method method, EditText[] editTextArr, Object[] objArr, JSONObject jSONObject, String str, LinearLayout linearLayout) {
        this.f489 = c0123;
        this.f487 = i;
        this.f484 = method;
        this.f486 = editTextArr;
        this.f485 = objArr;
        this.f491 = jSONObject;
        this.f490 = str;
        this.f488 = linearLayout;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        Object invoke;
        for (int i = 0; i < this.f487; i++) {
            Type type = this.f484.getGenericParameterTypes()[i];
            String obj = this.f486[i].getText().toString();
            switch (BaseType.getByBase(type.toString())) {
                case INT:
                    this.f485[i] = Integer.valueOf(Integer.parseInt(obj));
                    break;
                case SHORT:
                    this.f485[i] = Short.valueOf(Short.parseShort(obj));
                    break;
                case LONG:
                    this.f485[i] = Long.valueOf(Long.parseLong(obj));
                    break;
                case BYTE:
                    this.f485[i] = Byte.valueOf(Byte.parseByte(obj));
                    break;
                case BOOLEAN:
                    this.f485[i] = Boolean.valueOf(Boolean.parseBoolean(obj));
                    break;
                case CHAR:
                    this.f485[i] = Character.valueOf(obj.toCharArray()[0]);
                    break;
                case FLOAT:
                    this.f485[i] = Float.valueOf(Float.parseFloat(obj));
                    break;
                case DOUBLE:
                    this.f485[i] = Double.valueOf(Double.parseDouble(obj));
                    break;
                default:
                    if (Constants.getVar(obj) != null) {
                        this.f485[i] = Constants.getVar(obj);
                        break;
                    } else if (obj.equals("$this")) {
                        this.f485[i] = this.f489.f259;
                        break;
                    } else if (obj.equals("$context")) {
                        this.f485[i] = AbstractC0100.f255;
                        break;
                    } else if (obj.equals("$null")) {
                        this.f485[i] = null;
                        break;
                    } else {
                        this.f485[i] = obj;
                        break;
                    }
            }
        }
        if (this.f491 != null) {
            for (int i2 = 0; i2 < this.f487; i2++) {
                try {
                    this.f491.put(this.f486[i2].getHint().toString() + i2, this.f486[i2].getText().toString());
                } catch (Throwable th) {
                }
            }
            this.f489.f262.edit().putString(this.f490, this.f491.toString()).apply();
        }
        try {
            if (Modifier.isStatic(this.f484.getModifiers())) {
                invoke = this.f484.invoke(null, this.f485);
            } else {
                invoke = this.f484.invoke(this.f489.f259, this.f485);
            }
            if (invoke == null) {
                ToastUtils.show("result is null");
            } else {
                ToastUtils.show("正在打开结果：" + invoke);
                new C0063(invoke);
            }
        } catch (Throwable th2) {
            HandlerC0184.m102(AbstractC0100.f255, th2);
        }
        this.f489.f260.removeView(this.f488);
    }
}
