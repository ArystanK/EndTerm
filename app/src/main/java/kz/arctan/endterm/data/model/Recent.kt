package kz.arctan.endterm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recent(
    @PrimaryKey val id: Int,
    val imageUrl: Int,
    val placeName: String,
    val countryName: String,
    val price: Int
)
