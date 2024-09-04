package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.reflect.window.field.Btn;
import com.qingyu.rm.util.ToastUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

/* compiled from: $WVVQP.C[QWV */
/* renamed from: ́　　, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0078 extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: ́ */
    private Context context;

    /* renamed from: ۦ */
    private Object object;

    /* renamed from: ۬ */
    private C0063 f190;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0078(C0063 c0063) {
        super(C0063.f255);
        this.f190 = c0063;
        this.context = C0063.f255;
        this.object = c0063.f259;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.context);
        LinearLayout linearLayout = new LinearLayout(this.context);
        addBtns(linearLayout);
        horizontalScrollView.addView(linearLayout);
        addView(horizontalScrollView);
    }

    /* renamed from: ۬ */
    private void addBtns(LinearLayout linearLayout) {
        C0063 c0063 = this.f190;
        Object obj = this.object;
        for (Btn btn : Btn.values()) {
            switch (Btns.btns[btn.ordinal()]) {
                case 1:
                    if (!obj.getClass().isArray()) {
                        continue;
                    }
                    break;
                case 2:
                    if (!(obj instanceof Dialog)) {
                        continue;
                    }
                    break;
                case 3:
                    if (!(obj instanceof Activity)) {
                        continue;
                    }
                    break;
                case 4:
                    if (!(obj instanceof Drawable) && !(obj instanceof Bitmap)) {
                        continue;
                    }
                    break;
                case 5:
                    if (obj instanceof Drawable) {
                        continue;
                    } else if (obj instanceof Bitmap) {
                        continue;
                    } else if (obj instanceof byte[]) {
                        continue;
                    }
                    break;
                case 6:
                    InterfaceC0069 interfaceC0069 = null;
                    if (!(obj instanceof byte[])) {
                        if (obj instanceof TextView) {
                            interfaceC0069 = new C0116();
                        } else if (obj instanceof ImageView) {
                            interfaceC0069 = new C0071();
                        }
                        if (interfaceC0069 != null) {
                            interfaceC0069.mo33(c0063, linearLayout);
                        }
                        if (obj instanceof ViewGroup) {
                            new C0106().mo33(c0063, linearLayout);
                        }
                        if (obj instanceof View) {
                            new C0112().mo33(c0063, linearLayout);
                        }
                        if (obj instanceof List) {
                            new C0128().mo33(c0063, linearLayout);
                        }
                        if (obj instanceof Set) {
                            new C0118().mo33(c0063, linearLayout);
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        ToastUtils.show("这是一个byte数组,可以将其写出到SD卡");
                        break;
                    }
            }
            Button button = new Button(this.context);
            button.setText(btn.text);
            button.setId(btn.f26id);
            button.setOnClickListener(this);
            button.setOnLongClickListener(this);
            linearLayout.addView(button);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0063 c0063 = this.f190;
        Object obj = this.object;
        File externalStorageDirectory = C0063.m31() ? Environment.getExternalStorageDirectory() : this.context.getFilesDir();
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        EditText editText = new EditText(this.context);
        switch (Btns.btns[Btn.getByID(view.getId()).ordinal()]) {
            case 1:
                Object[] m60 = C0135.m60(this.object);
                int length = m60.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = String.format("[%d] %s", Integer.valueOf(i), C0135.m61(m60[i]));
                }
                C0101 c0101 = new C0101(this.context, c0063.f260);
                c0101.f270 = new C0134(c0101.f267, strArr);
                c0101.f268 = false;
                c0101.setListener(new C0077(this, m60));
                c0101.f271 = "选择其中一个对象，总共有:" + m60.length;
                c0101.m49(700, 700);
                return;
            case 2:
                Dialog dialog = (Dialog) obj;
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mShowing");
                    declaredField.setAccessible(true);
                    declaredField.set(dialog, Boolean.TRUE);
                } catch (Throwable th) {
                }
                dialog.dismiss();
                ToastUtils.show("已解散当前弹窗");
                return;
            case 3:
                ((Activity) obj).finish();
                return;
            case 4:
                new C0085(obj, obj);
                return;
            case 5:
                C0063.m44(String.valueOf(obj));
                return;
            case 6:
                new C0167(AbstractC0100.f255, c0063.f260, c0063.f257, linearLayout, false);
                int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
                c0063.f257.width = i;
                c0063.f257.height = i;
                TextView textView = new TextView(this.context);
                textView.setText("文件输出路径，默认请留空");
                textView.setTextColor(Color.parseColor("#c7c7c7"));
                c0063.m47(linearLayout, textView, null, null);
                editText.setHint(externalStorageDirectory.getAbsolutePath());
                editText.setText(c0063.f262.getString(Constants.SZSCMZ.value, "Reflect.data"));
                editText.setHintTextColor(Color.parseColor("#a2a2a2"));
                editText.setTextColor(-1);
                c0063.m47(linearLayout, editText, null, null);
                Button button = new Button(AbstractC0100.f255);
                button.setText("确定");
                c0063.m47(linearLayout, button, new C0075(this, c0063, linearLayout, editText, externalStorageDirectory), null);
                c0063.f260.addView(linearLayout, c0063.f257);
                return;
            case 7:
                new C0123(obj, c0063.f261);
                return;
            case 8:
                c0063.m32((Button) view);
                return;
            case 9:
                new C0167(AbstractC0100.f255, c0063.f260, c0063.f257, linearLayout, false);
                int size = Constants.getSP().getInt(Constants.CKDX.value, 1200);
                c0063.f257.width = size;
                c0063.f257.height = size;
                TextView textView2 = new TextView(this.context);
                textView2.setText("dex文件输出路径，默认请留空");
                textView2.setTextColor(Color.parseColor("#c7c7c7"));
                textView2.setGravity(17);
                c0063.m47(linearLayout, textView2, null, null);
                Switch r6 = new Switch(this.context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r6.setLayoutParams(layoutParams);
                r6.setText("修复Magic");
                r6.setChecked(c0063.f262.getBoolean(Constants.XFDEX.value, false));
                r6.setOnCheckedChangeListener(new C0074(this, c0063));
                c0063.m47(linearLayout, r6, null, null);
                editText.setTextColor(-1);
                editText.setHint(externalStorageDirectory.getAbsolutePath());
                editText.setHintTextColor(Color.parseColor("#a2a2a2"));
                editText.setText(c0063.f262.getString(Constants.DEXSCMZ.value, "classes.dex"));
                editText.setTextColor(-1);
                c0063.m47(linearLayout, editText, null, null);
                Button button2 = new Button(AbstractC0100.f255);
                button2.setText("确定");
                c0063.m47(linearLayout, button2, new C0076(this, c0063, linearLayout, editText, r6, externalStorageDirectory), null);
                c0063.f260.addView(linearLayout, c0063.f257);
                return;
            case 10:
                new C0030(obj, c0063.f261);
                return;
            case 11:
                Constants.addVar(this.object);
                return;
            case 12:
                new RunnableC0082(this.object, 0, 0);
                return;
            case 13:
                new RunnableC0082(this.object, 1, 0);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001b, code lost:
    
        return true;
     */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        C0063 c0063 = this.f190;
        switch (Btns.btns[Btn.getByID(view.getId()).ordinal()]) {
            case 5:
                HandlerC0184.m111(AbstractC0100.f255, String.valueOf(this.object));
                break;
            case 7:
                if (this.object instanceof Class) {
                    new C0123(this.object, (Class) this.object);
                    break;
                }
                break;
            case 9:
                File externalStorageDirectory = C0063.m31() ? Environment.getExternalStorageDirectory() : this.context.getFilesDir();
                LinearLayout linearLayout = new LinearLayout(this.context);
                linearLayout.setBackgroundColor(-12303292);
                linearLayout.setOrientation(1);
                new C0167(AbstractC0100.f255, c0063.f260, c0063.f257, linearLayout, false);
                int size = Constants.getSP().getInt(Constants.CKDX.value, 1200);
                c0063.f257.width = size;
                c0063.f257.height = size;
                TextView textView = new TextView(this.context);
                textView.setText("dex文件夹输出路径，默认请留空");
                textView.setTextColor(Color.parseColor("#c7c7c7"));
                textView.setGravity(17);
                c0063.m47(linearLayout, textView, null, null);
                Switch r0 = new Switch(this.context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r0.setLayoutParams(layoutParams);
                r0.setText("修复Magic");
                r0.setChecked(c0063.f262.getBoolean(Constants.XFDEX.value, false));
                r0.setOnCheckedChangeListener(new C0068(this, c0063));
                c0063.m47(linearLayout, r0, null, null);
                EditText editText = new EditText(this.context);
                editText.setHint(externalStorageDirectory.getAbsolutePath());
                editText.setHintTextColor(Color.parseColor("#a2a2a2"));
                editText.setText(c0063.f262.getString(Constants.DEXSCWJJ.value, "dump"));
                editText.setTextColor(-1);
                c0063.m47(linearLayout, editText, null, null);
                Button button = new Button(AbstractC0100.f255);
                button.setText("确定");
                c0063.m47(linearLayout, button, new C0067(this, c0063, linearLayout, editText, externalStorageDirectory), null);
                c0063.f260.addView(linearLayout, c0063.f257);
                break;
            case 10:
                if (this.object instanceof Class) {
                    new C0030(this.object, (Class) this.object);
                    break;
                }
                break;
            case 12:
                new RunnableC0082(this.object, 0, 1);
                break;
            case 13:
                new RunnableC0082(this.object, 1, 1);
                break;
        }
        return true;
        //todo check this
    }
}
