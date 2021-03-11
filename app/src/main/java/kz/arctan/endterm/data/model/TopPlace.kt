package kz.arctan.endterm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "top_place")
data class TopPlace(
    @PrimaryKey val id: Int,
    val imageUrl: Int,
    val placeName: String,
    val countryName: String,
    val price: Int
)