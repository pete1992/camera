/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface l
extends IInterface {
    public void ci(int var1) throws RemoteException;

    public void o(Status var1) throws RemoteException;

    public static abstract class com.google.android.gms.drive.realtime.internal.l$a
    extends Binder
    implements l {
        public static l ah(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements l {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public IBinder asBinder();

            @Override
            public void ci(int var1) throws RemoteException;

            @Override
            public void o(Status var1) throws RemoteException;
        }

    }

}

