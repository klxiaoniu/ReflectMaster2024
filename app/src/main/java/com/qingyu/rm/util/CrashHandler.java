package com.qingyu.rm.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

import p000.C0170;
import p000.C0190;

/* compiled from: %TCUJ7VKN */
/* renamed from: 　　ۦ۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: ۦ */
    private static CrashHandler f448;

    /* renamed from: ́ */
    File f449 = null;

    /* renamed from: ۬ */
    Context f450;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        if (p000.C0190.m119(r2, "android.permission.WRITE_EXTERNAL_STORAGE", android.os.Process.myPid(), android.os.Process.myUid(), r2.getPackageName()) != 0) goto L12;
     */
    /* renamed from: ۬ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void init(Context context) {
        boolean z = true;
        CrashHandler m114 = m114();
        m114.f450 = context;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context2 = m114.f450;
            if (C0190.m119(context2, "android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid(), context2.getPackageName()) == 0) {
                Context context3 = m114.f450;
            }
            z = false;
        }
        m114.f449 = new File(z ? new File(Environment.getExternalStorageDirectory(), m114.f450.getPackageName()) : m114.f450.getFilesDir(), "crash-" + new SimpleDateFormat("yyMMddHHmm").format(new Date(System.currentTimeMillis())) + ".log");
        new Handler(Looper.getMainLooper()).post(new CrashHandlerRunnableC0182(m114));
        Thread.setDefaultUncaughtExceptionHandler(m114);
    }

    /* renamed from: ۬ */
    private static CrashHandler m114() {
        if (f448 == null) {
            synchronized (CrashHandler.class) {
                if (f448 == null) {
                    f448 = new CrashHandler();
                }
            }
        }
        return f448;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            m116(th);
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            ToastUtils.show(this.f449 == null ? stringWriter.toString() : th.toString() + "\n\n详细日志请查看：" + this.f449.getAbsolutePath());
            try {
                stringWriter.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۬ */
    public void m116(Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f449 != null) {
            this.f449.getParentFile().mkdirs();
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(currentTimeMillis));
            try {
                PackageInfo packageInfo = this.f450.getPackageManager().getPackageInfo(this.f450.getPackageName(), 1);
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(this.f449)));
                printWriter.print("Crash Time: ");
                printWriter.println(format);
                printWriter.println();
                printWriter.print("App Package: ");
                printWriter.println(this.f450.getPackageName());
                printWriter.print("App Version: ");
                printWriter.print(packageInfo.versionName);
                printWriter.print('_');
                printWriter.println(packageInfo.versionCode);
                printWriter.print("OS Version: ");
                printWriter.print(Build.VERSION.RELEASE);
                printWriter.print("_");
                printWriter.println(Build.VERSION.SDK_INT);
                printWriter.print("Vendor: ");
                printWriter.println(Build.MANUFACTURER);
                printWriter.print("Model: ");
                printWriter.println(Build.MODEL);
                printWriter.print("Device: ");
                printWriter.println(Build.DEVICE);
                printWriter.print("CPU ABI: ");
                printWriter.println(Build.CPU_ABI);
                printWriter.println();
                printWriter.print(Log.getStackTraceString(th));
                printWriter.close();
            } catch (Exception e) {
                C0170.m84("CrashHandler dump crash info failed：" + e.toString());
            }
        }
    }
}
