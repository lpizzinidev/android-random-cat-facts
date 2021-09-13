package it.lucapizzini.randomcatfacts.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CatFact (
    @SerializedName("fact")
    @Expose
    var fact: String,

    @SerializedName("length")
    @Expose
    var length: Int
)