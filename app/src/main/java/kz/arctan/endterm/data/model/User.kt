package kz.arctan.endterm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class User(
    var id: Int,
    var firstName: String,
    var lastName: String,
    var username: String,
    var password: String
)