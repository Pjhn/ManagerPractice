package com.example.managerpracticeapp.ui.status

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class ReservationInfo(
    val id: String,
    val name: String,
    val date: Date,
) : Parcelable