package com.qingyu.rm.util;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import p000.C$CUG6QCUV;
import p000.C0160;
import p000.HandlerC0163;
import p000.InterfaceC0188;
import p000.InterfaceC0189;

/* compiled from: 6QCUV7VKN */
/* renamed from: 　ۦ　́, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ToastUtils {

    /* renamed from: ́ */
    private static InterfaceC0189 f392;

    /* renamed from: ۥ */
    private static Toast f393;

    /* renamed from: ۦ */
    private static InterfaceC0188 f394;

    /* renamed from: ۬ */
    public static boolean f395 = false;

    /* renamed from: ۬ */
    public static void init(Context context) {
        if (f395) {
            return;
        }
        if (context != null) {
            if (f392 == null) {
                HandlerC0163 handlerC0163 = new HandlerC0163(context);
                if (handlerC0163 != null) {
                    f392 = handlerC0163;
                    if (f393 != null) {
                        f392.mo82(f393);
                    }
                } else {
                    throw new NullPointerException("are you ok?");
                }
            }
            if (f394 == null) {
                f394 = new C0160(context);
            }
            C$CUG6QCUV c$cug6qcuv = new C$CUG6QCUV(context);
            if (c$cug6qcuv != null) {
                f393 = c$cug6qcuv;
                if (f392 != null) {
                    f392.mo82(f393);
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(f394.mo71());
                gradientDrawable.setCornerRadius(30.0f);
                TextView textView = new TextView(context);
                textView.setId(R.id.message);
                textView.setTextColor(-1);
                textView.setTextSize(0, f394.mo70());
                if (Build.VERSION.SDK_INT >= 16) {
                    textView.setPaddingRelative(f394.mo74(), f394.mo73(), f394.mo79(), f394.mo78());
                } else {
                    textView.setPadding(f394.mo74(), f394.mo73(), f394.mo79(), f394.mo78());
                }
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                if (Build.VERSION.SDK_INT >= 16) {
                    textView.setBackground(gradientDrawable);
                } else {
                    textView.setBackgroundDrawable(gradientDrawable);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setZ(30.0f);
                }
                if (f394.mo75() > 0) {
                    textView.setMaxLines(f394.mo75());
                }
                if (f393 == null) {
                    throw new IllegalStateException("ToastUtils has not been initialized");
                }
                if (textView != null) {
                    if (f393 != null) {
                        f393.cancel();
                        f393.setView(textView);
                    }
                    int mo72 = f394.mo72();
                    int mo69 = f394.mo69();
                    if (f393 != null) {
                        if (Build.VERSION.SDK_INT >= 17) {
                            mo72 = Gravity.getAbsoluteGravity(mo72, f393.getView().getResources().getConfiguration().getLayoutDirection());
                        }
                        f393.setGravity(mo72, 0, mo69);
                        f395 = true;
                        return;
                    }
                    throw new IllegalStateException("ToastUtils has not been initialized");
                }
                throw new NullPointerException("are you ok?");
            }
            throw new NullPointerException("are you ok?");
        }
        throw new NullPointerException("are you ok?");
    }

    /* renamed from: ۬ */
    public static synchronized void show(CharSequence charSequence) {
        synchronized (ToastUtils.class) {
            if (f393 != null) {
                f392.mo83(charSequence);
            } else {
                throw new IllegalStateException("ToastUtils has not been initialized");
            }
        }
    }
}
