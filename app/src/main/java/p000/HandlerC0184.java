package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;

/* compiled from: &KCNQI/UI */
/* renamed from: 　　ۦۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class HandlerC0184 extends Handler {

    /* renamed from: ۬ */
    private static HandlerC0184 f441 = null;

    /* renamed from: ́ */
    public InterfaceC0169 f442;

    /* renamed from: ۥ */
    private AlertDialog f443;

    /* renamed from: ۦ */
    public boolean f444;

    /* renamed from: 　́ */
    public TextView f445;

    /* renamed from: 　۬ */
    public String f446;

    /* renamed from: 　　 */
    public String f447;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ́ */
    public static /* synthetic */ String m101(HandlerC0184 handlerC0184, String str) {
        handlerC0184.f446 = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public static /* synthetic */ AlertDialog m105(HandlerC0184 handlerC0184, AlertDialog alertDialog) {
        handlerC0184.f443 = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public static /* synthetic */ TextView m106(HandlerC0184 handlerC0184, TextView textView) {
        handlerC0184.f445 = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ۬ */
    public static /* synthetic */ String m108(HandlerC0184 handlerC0184, String str) {
        handlerC0184.f447 = null;
        return null;
    }

    private HandlerC0184() {
        super(Looper.getMainLooper());
        this.f442 = null;
        this.f444 = false;
        this.f443 = null;
        this.f447 = null;
        this.f446 = null;
        this.f445 = null;
    }

    /* renamed from: ۬ */
    private static HandlerC0184 m109() {
        if (f441 == null) {
            synchronized (HandlerC0184.class) {
                if (f441 == null) {
                    f441 = new HandlerC0184();
                }
            }
        }
        return f441;
    }

    /* renamed from: ۬ */
    public static void m111(Context context, Object... objArr) {
        HandlerC0184 m109 = m109();
        m109.f442 = null;
        m109.obtainMessage(0, new Object[]{context, objArr}).sendToTarget();
    }

    /* renamed from: ۬ */
    public static void m110(Context context, InterfaceC0169 interfaceC0169, Object... objArr) {
        HandlerC0184 m109 = m109();
        m109.f442 = interfaceC0169;
        m109.obtainMessage(0, new Object[]{context, objArr}).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        Object[] objArr = (Object[]) message.obj;
        Context context = (Context) objArr[0];
        Object[] objArr2 = (Object[]) objArr[1];
        if (context == null || !(context instanceof Activity) || objArr2 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 4);
        builder.setTitle(i == 0 ? "Tip" : "Error");
        if (objArr2.length == 1) {
            if (objArr2[0] instanceof Throwable) {
                Throwable th = (Throwable) objArr2[0];
                if (th instanceof InvocationTargetException) {
                    th = ((InvocationTargetException) th).getTargetException();
                }
                this.f447 = th.toString();
                this.f446 = Log.getStackTraceString(th);
            } else {
                this.f447 = String.valueOf(objArr2[0]);
            }
        } else if (objArr2.length == 2) {
            String str = (String) objArr2[0];
            Throwable th2 = (Throwable) objArr2[1];
            if (th2 instanceof InvocationTargetException) {
                th2 = ((InvocationTargetException) th2).getTargetException();
            }
            this.f447 = str + "：" + th2.toString();
            this.f446 = str + "：" + Log.getStackTraceString(th2);
        }
        if (this.f447 != null) {
            builder.setMessage(this.f447);
        }
        builder.setPositiveButton(i == 0 ? "OK" : "FUCK", (DialogInterface.OnClickListener) null).setNegativeButton("复制", new DialogInterfaceOnClickListenerC0183(this, context));
        if (this.f446 != null) {
            builder.setNeutralButton("详细", (DialogInterface.OnClickListener) null);
        }
        builder.setOnDismissListener(new DialogInterfaceOnDismissListenerC0173(this));
        this.f443 = builder.show();
        this.f445 = (TextView) this.f443.findViewById(R.id.message);
        if (this.f445 != null) {
            this.f445.setTextIsSelectable(true);
        }
        Button button = this.f443.getButton(-3);
        if (button == null) {
            return;
        }
        button.setOnClickListener(new ViewOnClickListenerC0172(this, button));
    }

    /* renamed from: ́ */
    public static void m102(Context context, Object... objArr) {
        HandlerC0184 m109 = m109();
        m109.f442 = null;
        m109.obtainMessage(1, new Object[]{context, objArr}).sendToTarget();
    }
}
