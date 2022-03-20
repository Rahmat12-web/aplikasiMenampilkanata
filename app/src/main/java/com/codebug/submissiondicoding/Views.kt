package com.codebug.submissiondicoding

import android.os.Parcel
import android.os.Parcelable


@Parcelize
class Views(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable {
    constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        detail = parcel.readString().toString()
        photo = parcel.readInt()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        p0?.writeString(name)
        p0?.writeString(detail)
        p0?.writeInt(photo)
    }

    companion object CREATOR : Parcelable.Creator<Views> {
        override fun createFromParcel(parcel: Parcel): Views {
            return Views(parcel)
        }

        override fun newArray(size: Int): Array<Views?> {
            return arrayOfNulls(0)
        }
    }
}

annotation class Parcelize