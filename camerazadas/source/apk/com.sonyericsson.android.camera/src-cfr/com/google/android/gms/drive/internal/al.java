/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DrivePreferences;
import com.google.android.gms.drive.internal.OnDrivePreferencesResponse;

public class al
implements Parcelable.Creator<OnDrivePreferencesResponse> {
    static void a(OnDrivePreferencesResponse onDrivePreferencesResponse, Parcel parcel, int n) {
        int n2 = b.D(parcel);
        b.c(parcel, 1, onDrivePreferencesResponse.BR);
        b.a(parcel, 2, onDrivePreferencesResponse.Pr, n, false);
        b.H(parcel, n2);
    }

    public OnDrivePreferencesResponse an(Parcel parcel) {
        int n = a.C(parcel);
        int n2 = 0;
        DrivePreferences drivePreferences = null;
        block4 : while (parcel.dataPosition() < n) {
            int n3 = a.B(parcel);
            switch (a.aD(n3)) {
                default: {
                    a.b(parcel, n3);
                    continue block4;
                }
                case 1: {
                    n2 = a.g(parcel, n3);
                    continue block4;
                }
                case 2: 
            }
            drivePreferences = a.a(parcel, n3, DrivePreferences.CREATOR);
        }
        if (parcel.dataPosition() != n) {
            throw new a.a("Overread allowed size end=" + n, parcel);
        }
        return new OnDrivePreferencesResponse(n2, drivePreferences);
    }

    public OnDrivePreferencesResponse[] bz(int n) {
        return new OnDrivePreferencesResponse[n];
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.an(parcel);
    }

    @Override
    public /* synthetic */ Object[] newArray(int n) {
        return this.bz(n);
    }
}

