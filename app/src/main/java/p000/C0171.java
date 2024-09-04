package p000;

/* compiled from: *GZ */
/* renamed from: 　　̀ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0171 {

    /* renamed from: ۬ */
    private static final char[] f422 = "0123456789abcdef".toCharArray();

    /* renamed from: ۬ */
    public static char[] m89(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            cArr[i] = f422[(bArr[i2] & 240) >>> 4];
            cArr[i + 1] = f422[bArr[i2] & 15];
            int i3 = i2 + 1;
            i = i3 << 1;
            i2 = i3;
        }
        return cArr;
    }

    /* renamed from: ۬ */
    public static byte[] m88(char[] cArr) {
        int length = cArr.length / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            bArr[i2] = (byte) ((Character.digit(cArr[i + 1], 16) << 0) + (Character.digit(cArr[i], 16) << 4));
            int i3 = i2 + 1;
            i = i3 << 1;
            i2 = i3;
        }
        return bArr;
    }
}
