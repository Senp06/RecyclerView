package com.example.exmp_recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SuperHero(
    val imgSuperhro: Int,
    val nameSuperhro: String,
    val descSuperhero: String
) : Parcelable
