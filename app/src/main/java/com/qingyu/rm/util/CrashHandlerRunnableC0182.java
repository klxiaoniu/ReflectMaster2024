package com.qingyu.rm.util;

import android.os.Looper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: %TCUJ7VKN */
/* renamed from: 　　ۦ́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CrashHandlerRunnableC0182 implements Runnable {

    /* renamed from: ۬ */
    final /* synthetic */ CrashHandler f438;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CrashHandlerRunnableC0182(CrashHandler crashHandler) {
        this.f438 = crashHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                this.f438.m116(th);
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.close();
                ToastUtils.show(this.f438.f449 == null ? stringWriter.toString() : th.toString() + "\n\n详细日志请查看：" + this.f438.f449.getAbsolutePath());
                try {
                    stringWriter.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
