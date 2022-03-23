package com.binar.chapter3f

import android.os.Parcel
import android.os.Parcelable

data class Tahun(var sekarang : Int, var lahir : Int, var user : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(sekarang)
        parcel.writeInt(lahir)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tahun> {
        override fun createFromParcel(parcel: Parcel): Tahun {
            return Tahun(parcel)
        }

        override fun newArray(size: Int): Array<Tahun?> {
            return arrayOfNulls(size)
        }
    }
}
