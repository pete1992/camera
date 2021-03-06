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
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public interface f
extends IInterface {
    public void b(DataHolder var1) throws RemoteException;

    public void o(Status var1) throws RemoteException;

    public static abstract class com.google.android.gms.drive.realtime.internal.f$a
    extends Binder
    implements f {
        public static f ab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
            if (iInterface != null && iInterface instanceof f) {
                return (f)iInterface;
            }
            return new a(iBinder);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int n, Parcel parcel, Parcel parcel2, int n2) throws RemoteException {
            DataHolder dataHolder = null;
            SafeParcelable safeParcelable = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 1598968902: {
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    return true;
                }
                case 1: {
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (parcel.readInt() != 0) {
                        safeParcelable = DataHolder.CREATOR.z(parcel);
                    }
                    this.b((DataHolder)safeParcelable);
                    parcel2.writeNoException();
                    return true;
                }
                case 2: 
            }
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
            safeParcelable = dataHolder;
            if (parcel.readInt() != 0) {
                safeParcelable = Status.CREATOR.createFromParcel(parcel);
            }
            this.o((Status)safeParcelable);
            parcel2.writeNoException();
            return true;
        }

        private static class a
        implements f {
            private IBinder lb;

            a(IBinder iBinder) {
                this.lb = iBinder;
            }

            @Override
            public IBinder asBinder() {
                return this.lb;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             */
            @Override
            public void b(DataHolder dataHolder) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (dataHolder != null) {
                        parcel.writeInt(1);
                        dataHolder.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.lb.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             */
            @Override
            public void o(Status status) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (status != null) {
                        parcel.writeInt(1);
                        status.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.lb.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }

    }

}

