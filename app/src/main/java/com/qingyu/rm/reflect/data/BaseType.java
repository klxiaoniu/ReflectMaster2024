package com.qingyu.rm.reflect.data;

/* loaded from: classes.dex */
public enum BaseType {
    INT("int", "java.lang.Integer"),
    SHORT("short", "java.lang.Short"),
    LONG("long", "java.lang.Long"),
    BYTE("byte", "java.lang.Byte"),
    BOOLEAN("boolean", "java.lang.Boolean"),
    CHAR("char", "java.lang.Character"),
    FLOAT("float", "java.lang.Float"),
    DOUBLE("double", "java.lang.Double"),
    DEFAULT("Object", "java.lang.Object");


    /* renamed from: b */
    String f10b;

    /* renamed from: o */
    String f11o;

    BaseType(String str, String str2) {
        this.f10b = str;
        this.f11o = str2;
    }

    public static BaseType getByBase(String str) {
        for (BaseType baseType : values()) {
            if (baseType.f10b.equals(str)) {
                return baseType;
            }
        }
        return DEFAULT;
    }

    public static BaseType getByObj(String str) {
        for (BaseType baseType : values()) {
            if (baseType.f11o.equals(str)) {
                return baseType;
            }
        }
        return DEFAULT;
    }
}
