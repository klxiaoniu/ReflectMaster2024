package p000;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.qingyu.rm.reflect.data.BaseType;
import java.util.List;

/* compiled from: 1DLGEV2CTUGT */
/* renamed from: 　́ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0135 {
    /* renamed from: ۬ */
    public static String m61(Object obj) {
        String str;
        if (obj != null) {
            switch (C0168.f419[BaseType.getByObj(obj.getClass().getName()).ordinal()]) {
                case 1:
                    str = String.valueOf((Integer) obj);
                    break;
                case 2:
                    str = String.valueOf((Short) obj);
                    break;
                case 3:
                    str = String.valueOf((Long) obj);
                    break;
                case 4:
                    str = String.valueOf((Byte) obj);
                    break;
                case 5:
                    str = String.valueOf((Boolean) obj);
                    break;
                case 6:
                    str = String.valueOf((Character) obj);
                    break;
                case 7:
                    str = String.valueOf((Float) obj);
                    break;
                case 8:
                    str = String.valueOf((Double) obj);
                    break;
                default:
                    if (obj instanceof CharSequence) {
                        str = ((CharSequence) obj).toString();
                        break;
                    } else if (obj instanceof TextView) {
                        str = ((TextView) obj).getText().toString();
                        break;
                    } else if (obj instanceof Button) {
                        str = ((Button) obj).getText().toString();
                        break;
                    } else if (obj instanceof EditText) {
                        str = ((EditText) obj).getText().toString();
                        break;
                    } else if (obj instanceof List) {
                        List list = (List) obj;
                        str = new StringBuilder().append(list.size()).toString();
                        if (list.size() > 0) {
                            str = str + "," + list.get(0);
                            break;
                        }
                    } else {
                        str = obj.toString();
                        break;
                    }
                    break;
            }
        } else {
            str = "null";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: ́ */
    public static Object[] m60(Object obj) {
        int i = 0;
        switch (C0168.f419[BaseType.getByBase(obj.getClass().getComponentType().getName()).ordinal()]) {
            case 1:
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                Integer[] numArr = new Integer[length];
                while (i < length) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                return numArr;
            case 2:
                short[] sArr = (short[]) obj;
                int length2 = sArr.length;
                Short[] shArr = new Short[length2];
                while (i < length2) {
                    shArr[i] = Short.valueOf(sArr[i]);
                    i++;
                }
                return shArr;
            case 3:
                return new Long[((long[]) obj).length];
            case 4:
                byte[] bArr = (byte[]) obj;
                int length3 = bArr.length;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i < length3) {
                    bArr2[i] = Byte.valueOf(bArr[i]);
                    i++;
                }
                return bArr2;
            case 5:
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i < length4) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                    i++;
                }
                return boolArr;
            case 6:
                char[] cArr = (char[]) obj;
                int length5 = cArr.length;
                Character[] chArr = new Character[cArr.length];
                while (i < length5) {
                    chArr[i] = Character.valueOf(cArr[i]);
                    i++;
                }
                return chArr;
            case 7:
                float[] fArr = (float[]) obj;
                int length6 = fArr.length;
                Float[] fArr2 = new Float[fArr.length];
                while (i < length6) {
                    fArr2[i] = Float.valueOf(fArr[i]);
                    i++;
                }
                return fArr2;
            case 8:
                double[] dArr = (double[]) obj;
                int length7 = dArr.length;
                Double[] dArr2 = new Double[dArr.length];
                while (i < length7) {
                    dArr2[i] = Double.valueOf(dArr[i]);
                    i++;
                }
                return dArr2;
            default:
                return (Object[]) obj;
        }
    }
}
