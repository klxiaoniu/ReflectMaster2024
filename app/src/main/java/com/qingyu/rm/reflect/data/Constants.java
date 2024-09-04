package com.qingyu.rm.reflect.data;

import android.content.Context;
import android.content.SharedPreferences;
import de.robv.android.xposed.XSharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import com.qingyu.rm.util.ToastUtils;

/* loaded from: classes.dex */
public enum Constants {
    BM("com.qingyu.rm"),
    TAG("ReflectMaster"),
    ZDJCGX("autocheckup"),
    YXZ("packs"),
    WYWZ("https://share.weiyun.com/5sGTlS8"),
    XSXTYY("sysapp"),
    XSJD("progress"),
    BKRZSC("crash"),
    FJYXP("anti"),
    XZWJX("rotate"),
    CKDX("windowSize"),
    DEXSCMZ("input_dexOutName"),
    CJDX("input_newObj"),
    CZL("input_findC"),
    XFDEX("sw_fixdex"),
    DEXSCWJJ("input_dexsOutPath"),
    SZSCMZ("input_bytesOutName"),
    LWJSCMZ("input_csOutPath");

    public static Context context;

    /* renamed from: ۬ */
    private static List<Object> f14 = new ArrayList();

    /* renamed from: v */
    public String value;

    Constants(String str) {
        this.value = str;
    }

    public static final SharedPreferences getSP() {
        XSharedPreferences xSharedPreferences;
        try {
            xSharedPreferences = new XSharedPreferences(BM.value, "rm");
            xSharedPreferences.makeWorldReadable();
            xSharedPreferences.reload();
        } catch (Throwable th) {
            xSharedPreferences = null;
        }
        if (xSharedPreferences == null) {
            try {
                return context.getSharedPreferences("rm", 1);
            } catch (Throwable th2) {
                return context.getSharedPreferences("rm", 0);
            }
        }
        return xSharedPreferences;
    }

    public static void addVar(Object obj) {
        if (f14.size() <= 50) {
            if (f14.contains(obj)) {
                if (context != null) {
                    ToastUtils.show("变量已存在！");
                    return;
                }
                return;
            }
            for (Object obj2 : f14) {
                if (obj2 == null) {
                    f14.remove(obj2);
                }
            }
            int size = f14.size();
            f14.add(obj);
            if (context != null) {
                ToastUtils.show("添加到寄存器$V" + size + "成功！");
            }
        }
    }

    public static Object getVar(String str) {
        Object obj = null;
        if (str.startsWith("$V")) {
            try {
                int intValue = Integer.valueOf(str.substring(2)).intValue();
                if (intValue < f14.size()) {
                    obj = f14.get(intValue);
                } else {
                    ToastUtils.show("寄存器$V" + intValue + "不存在");
                }
                return obj;
            } catch (NumberFormatException e) {
                return obj;
            }
        }
        if (!Pattern.matches("^\\\\+\\$V", str)) {
            return null;
        }
        return str.substring(str.indexOf(92) + 1);
    }

    public static List<Object> getVars() {
        return f14;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
