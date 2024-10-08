package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* compiled from: 2GTOKUUKQP%JGEMGT */
/* renamed from: 　　۬۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0190 {
    /* renamed from: ۬ */
    public static int m119(Context context, String str, int i, int i2, String str2) {
        String str3;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str3 = AppOpsManager.permissionToOp(str);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i3 = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str3, str2);
        } else {
            i3 = 1;
        }
        return i3 != 0 ? -2 : 0;
    }
}
