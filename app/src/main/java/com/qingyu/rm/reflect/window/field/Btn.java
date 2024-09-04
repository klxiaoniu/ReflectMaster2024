package com.qingyu.rm.reflect.window.field;

/* loaded from: classes.dex */
public enum Btn {
    CKSZ("查看数组", 0),
    HS("函数", 1),
    FLBL("父类变量", 2),
    XCDEX("写出Dex", 3),
    JSDC("解散弹窗", 4),
    GZQ("构造器", 5),
    JSHD("结束活动", 6),
    CKTP("查看图片", 7),
    FZZ("复制值", 8),
    XCBYTES("写出[B", 9),
    BCDX("保存对象", 10),
    CJDX("创建对象", 11),
    CZLM("查找类名", 12);


    /* renamed from: id */
    public int f26id;
    public CharSequence text;

    Btn(CharSequence charSequence, int i) {
        this.text = charSequence;
        this.f26id = i;
    }

    public static Btn getByID(int i) {
        return values()[i];
    }
}
