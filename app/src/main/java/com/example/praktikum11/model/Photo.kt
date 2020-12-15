package com.example.praktikum11.model

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

data class Photo (
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("thumbnailUrl")
    val thumbnail: String?
    )