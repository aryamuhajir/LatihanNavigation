package com.binar.chapter3f

import android.os.Parcel
import android.os.Parcelable

data class dataUser(var username : String?, var password : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(password)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<dataUser> {
        override fun createFromParcel(parcel: Parcel): dataUser {
            return dataUser(parcel)
        }

        override fun newArray(size: Int): Array<dataUser?> {
            return arrayOfNulls(size)
        }
    }
}
