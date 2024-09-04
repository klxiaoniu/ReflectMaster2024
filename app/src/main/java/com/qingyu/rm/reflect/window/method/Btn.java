package com.qingyu.rm.reflect.window.method;

/* loaded from: classes.dex */
public enum Btn {
    FLHS("父类函数", 1);


    /* renamed from: id */
    public int f28id = 1;
    public CharSequence text;

    Btn(CharSequence charSequence, int i) {
        this.text = charSequence;
    }

    public static Btn getByID(int i) {
        for (Btn btn : values()) {
            if (btn.f28id == i) {
                return btn;
            }
        }
        return null;
    }
}
