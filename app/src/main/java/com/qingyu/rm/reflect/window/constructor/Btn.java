package com.qingyu.rm.reflect.window.constructor;

/* loaded from: classes.dex */
public enum Btn {
    FLHS("父类构造器", 1);


    /* renamed from: id */
    public int f23id = 1;
    public CharSequence text;

    Btn(CharSequence charSequence, int i) {
        this.text = charSequence;
    }

    public static Btn getByID(int i) {
        for (Btn btn : values()) {
            if (btn.f23id == i) {
                return btn;
            }
        }
        return null;
    }
}
