/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.cameracommon.status.eachcamera;

import com.sonyericsson.cameracommon.status.EachCameraStatusValue;
import com.sonyericsson.cameracommon.status.EnumValue;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class OnlineRemote
extends EnumValue<Value>
implements EachCameraStatusValue {
    public static final Value DEFAULT_VALUE;
    public static final String KEY = "online_remote";
    private static final int REQUIRED_VERSION = 10;

    static;

    public OnlineRemote(Value var1);

    @Override
    public String getKey();

    @Override
    public int minRequiredVersion();

    /*
     * Exception performing whole class analysis.
     * Exception performing whole class analysis ignored.
     */
    public static final class Value
    extends Enum<Value> {
        private static final /* synthetic */ Value[] $VALUES;
        public static final /* enum */ Value OFF;
        public static final /* enum */ Value ON;
        private final String mStringExpression;

        static;

        private Value(String var3);

        public static Value valueOf(String var0);

        public static Value[] values();

        public String toString();
    }

}

