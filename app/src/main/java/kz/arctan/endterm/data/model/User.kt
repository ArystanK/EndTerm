package kz.arctan.endterm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey var id: Int,
    var firstName: String,
    var lastName: String,
    var username: String,
    var password: String
)