package com.qingyu.rm.reflect;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import com.qingyu.rm.reflect.data.Constants;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.BufferedReader;
import p000.C0019;
import p000.C0020;
import p000.C0021;
import p000.C0157;
import p000.C0158;
import p000.C0170;
import p000.C0174;
import p000.C0180;
import p000.C0181;
import p000.C0187;
import p000.C0192;

/* loaded from: classes.dex */
public class XposedEntry implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String[] split;
        boolean z;
        if (loadPackageParam.packageName.equals(Constants.BM.value)) {
            XposedHelpers.findAndHookMethod(Constants.BM.value + ".Main", loadPackageParam.classLoader, "isModuleActive", new Object[]{XC_MethodReplacement.returnConstant(Boolean.TRUE)});
        }
        SharedPreferences sp = Constants.getSP();
        String string = sp.getString(Constants.YXZ.value, null);
        if (string != null && (split = string.split(",")) != null && split.length != 0) {
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if (split[i].equals(loadPackageParam.packageName)) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                C0170.m87("find pack：" + loadPackageParam.packageName);
                if (sp.getBoolean(Constants.FJYXP.value, false)) {
                    try {
                        XposedBridge.hookAllMethods(ContextWrapper.class, "startInstrumentation", XC_MethodReplacement.DO_NOTHING);
                    } catch (Throwable th) {
                        C0170.m84(th);
                    }
                    try {
                        XposedHelpers.findAndHookMethod(Class.class, "getDeclaredField", new Object[]{String.class, new C0180(this)});
                    } catch (Throwable th2) {
                        C0170.m84(th2);
                    }
                    try {
                        XposedHelpers.findAndHookMethod(ClassLoader.class, "loadClass", new Object[]{String.class, new C0158(this)});
                    } catch (Throwable th3) {
                        C0170.m84(th3);
                    }
                    try {
                        XposedHelpers.findAndHookMethod(ClassLoader.class, "loadClass", new Object[]{String.class, new C0157(this)});
                    } catch (Throwable th4) {
                        C0170.m84(th4);
                    }
                    try {
                        XposedHelpers.findAndHookMethod(BufferedReader.class, "readLine", new Object[]{new C0021(this)});
                    } catch (Throwable th5) {
                        C0170.m84(th5);
                    }
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.Application", loadPackageParam.classLoader, "onCreate", new Object[]{new C0019(this)});
                } catch (Throwable th6) {
                    C0170.m87(th6);
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.Activity", loadPackageParam.classLoader, "onCreate", new Object[]{Bundle.class, new C0020(this, loadPackageParam)});
                } catch (Throwable th7) {
                    C0170.m87(th7);
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.Activity", loadPackageParam.classLoader, "onResume", new Object[]{new C0192(this)});
                } catch (Throwable th8) {
                    C0170.m87(th8);
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.Dialog", loadPackageParam.classLoader, "onKeyUp", new Object[]{Integer.TYPE, KeyEvent.class, new C0187(this)});
                } catch (Throwable th9) {
                    C0170.m87(th9);
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.AlertDialog", loadPackageParam.classLoader, "onKeyDown", new Object[]{Integer.TYPE, KeyEvent.class, new C0174(this)});
                } catch (Throwable th10) {
                    C0170.m87(th10);
                }
                try {
                    XposedHelpers.findAndHookMethod("android.app.Activity", loadPackageParam.classLoader, "onKeyDown", new Object[]{Integer.TYPE, KeyEvent.class, new C0181(this, loadPackageParam)});
                } catch (Throwable th11) {
                    C0170.m87(th11);
                }
            }
        }
    }
}
