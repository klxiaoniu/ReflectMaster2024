package p000;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/* compiled from: $CUG6QCUV */
/* renamed from: 　　۬́, reason: use source file name and invalid class name */
/* loaded from: classes.dex */
public final class C$CUG6QCUV extends Toast {

    /* renamed from: ۬ */
    private TextView f453;

    public C$CUG6QCUV(Context context) {
        super(context);
    }

    @Override // android.widget.Toast
    public final void setView(View view) {
        TextView m118;
        super.setView(view);
        if (view instanceof TextView) {
            m118 = (TextView) view;
        } else if (view.findViewById(R.id.message) instanceof TextView) {
            m118 = (TextView) view.findViewById(R.id.message);
        } else if (!(view instanceof ViewGroup) || (m118 = m118((ViewGroup) view)) == null) {
            throw new IllegalArgumentException("The layout must contain a TextView");
        }
        this.f453 = m118;
    }

    @Override // android.widget.Toast
    public final void setText(CharSequence charSequence) {
        this.f453.setText(charSequence);
    }

    @Override // android.widget.Toast
    public final void setDuration(int i) {
        super.setDuration(1);
    }

    /* renamed from: ۬ */
    private static TextView m118(ViewGroup viewGroup) {
        TextView m118;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof TextView) {
                    return (TextView) childAt;
                }
                if (!(childAt instanceof ViewGroup) || (m118 = m118((ViewGroup) childAt)) == null) {
                    i = i2 + 1;
                } else {
                    return m118;
                }
            } else {
                return null;
            }
        }
    }
}
