package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.BaseType;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: %QPUVTWEVQT9KPFQY */
/* renamed from: ̀۬́, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0044 implements InterfaceC0090 {

    /* renamed from: ́ */
    final /* synthetic */ Constructor f101;

    /* renamed from: ۥ */
    final /* synthetic */ Object[] f102;

    /* renamed from: ۦ */
    final /* synthetic */ EditText[] f103;

    /* renamed from: ۬ */
    final /* synthetic */ int f104;

    /* renamed from: 　́ */
    final /* synthetic */ LinearLayout f105;

    /* renamed from: 　ۦ */
    final /* synthetic */ C0030 f106;

    /* renamed from: 　۬ */
    final /* synthetic */ String f107;

    /* renamed from: 　　 */
    final /* synthetic */ JSONObject f108;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0044(C0030 c0030, int i, Constructor constructor, EditText[] editTextArr, Object[] objArr, JSONObject jSONObject, String str, LinearLayout linearLayout) {
        this.f106 = c0030;
        this.f104 = i;
        this.f101 = constructor;
        this.f103 = editTextArr;
        this.f102 = objArr;
        this.f108 = jSONObject;
        this.f107 = str;
        this.f105 = linearLayout;
    }

    @Override // p000.InterfaceC0090
    /* renamed from: ۦ */
    public final void mo27() {
        for (int i = 0; i < this.f104; i++) {
            Type type = this.f101.getGenericParameterTypes()[i];
            String obj = this.f103[i].getText().toString();
            switch (BaseType.getByBase(type.toString())) {
                case INT:
                    this.f102[i] = Integer.valueOf(Integer.parseInt(obj));
                    break;
                case SHORT:
                    this.f102[i] = Short.valueOf(Short.parseShort(obj));
                    break;
                case LONG:
                    this.f102[i] = Long.valueOf(Long.parseLong(obj));
                    break;
                case BYTE:
                    this.f102[i] = Byte.valueOf(Byte.parseByte(obj));
                    break;
                case BOOLEAN:
                    this.f102[i] = Boolean.valueOf(Boolean.parseBoolean(obj));
                    break;
                case CHAR:
                    this.f102[i] = Character.valueOf(obj.toCharArray()[0]);
                    break;
                case FLOAT:
                    this.f102[i] = Float.valueOf(Float.parseFloat(obj));
                    break;
                case DOUBLE:
                    this.f102[i] = Double.valueOf(Double.parseDouble(obj));
                    break;
                default:
                    if (Constants.getVar(obj) != null) {
                        this.f102[i] = Constants.getVar(obj);
                        break;
                    } else if (obj.equals("$this")) {
                        this.f102[i] = this.f106.f259;
                        break;
                    } else if (obj.equals("$context")) {
                        this.f102[i] = AbstractC0100.f255;
                        break;
                    } else if (obj.equals("$null")) {
                        this.f102[i] = null;
                        break;
                    } else {
                        this.f102[i] = obj;
                        break;
                    }
            }
        }
        if (this.f108 != null) {
            for (int i2 = 0; i2 < this.f104; i2++) {
                try {
                    this.f108.put(this.f103[i2].getHint().toString() + i2, this.f103[i2].getText().toString());
                } catch (Throwable th) {
                }
            }
            this.f106.f262.edit().putString(this.f107, this.f108.toString()).apply();
        }
        try {
            Object newInstance = this.f101.newInstance(this.f102);
            if (newInstance == null) {
                ToastUtils.show("result is null");
            } else {
                ToastUtils.show("正在打开结果：" + newInstance);
                new C0063(newInstance);
            }
        } catch (Throwable th2) {
            HandlerC0184.m102(AbstractC0100.f255, th2);
        }
        this.f106.f260.removeView(this.f105);
    }
}
