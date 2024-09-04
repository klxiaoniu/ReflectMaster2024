package com.qingyu.rm;

import android.app.Application;
import com.qingyu.rm.util.ToastUtils;
import com.qingyu.rm.util.CrashHandler;

/* loaded from: classes.dex */
public class App extends Application {
    @Override // android.app.Application
    public void onCreate() {
        ToastUtils.init(this);
        if (!BuildConfig.DEBUG) {
            CrashHandler.init(this);
        }
        super.onCreate();
    }
}
