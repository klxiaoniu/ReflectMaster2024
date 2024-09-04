package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.util.ToastUtils;

/* compiled from: +OCIG9KPFQY */
/* renamed from: ۦ́ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0085 extends AbstractC0100 {

    /* renamed from: ۬　 */
    static Bitmap f211 = null;

    /* renamed from: ۦ　 */
    private Object f212;

    /* renamed from: ۬۬ */
    Bitmap f213;

    public C0085(Object obj, Object obj2) {
        super(obj, obj2);
        this.f213 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC0100
    /* renamed from: ۬ */
    public final void mo24() {
        this.f212 = this.f258[0];
        super.mo24();
    }

    @Override // p000.AbstractC0100
    /* renamed from: ́ */
    protected final void mo23() {
        Bitmap bitmap;
        if (this.f212 instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) this.f212;
            this.f213 = bitmap2;
            f211 = bitmap2;
        } else if (this.f212 instanceof Drawable) {
            Drawable drawable = (Drawable) this.f212;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth < 0 || intrinsicHeight < 0) {
                bitmap = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas);
                bitmap = createBitmap;
            }
            this.f213 = bitmap;
            f211 = bitmap;
        } else {
            ToastUtils.show("null...");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(f255);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(1);
        new C0167(AbstractC0100.f255, this.f260, this.f257, linearLayout, false);
        Button button = new Button(AbstractC0100.f255);
        button.setText("保存");
        m46(linearLayout, button, new C0098(this));
        LinearLayout linearLayout2 = new LinearLayout(f255);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setGravity(17);
        ImageView imageView = new ImageView(f255);
        int i = Constants.getSP().getInt(Constants.CKDX.value, 1200);
        imageView.setMaxWidth(i);
        imageView.setMaxHeight(i);
        imageView.setImageBitmap(this.f213);
        m45(linearLayout2, imageView).m45(linearLayout, linearLayout2);
        this.f260.addView(linearLayout, this.f257);
    }
}
