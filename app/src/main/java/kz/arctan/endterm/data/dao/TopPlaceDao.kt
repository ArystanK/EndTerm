package kz.arctan.endterm.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kz.arctan.endterm.data.model.TopPlace

@Dao
interface TopPlaceDao {
    @Insert
    fun insertTopPlace(topPlace: TopPlace)

    @Update
    fun updateTopPlace(topPlace: TopPlace)

    @Delete
    fun deleteTopPlace(topPlace: TopPlace)

    @Query("SELECT * FROM top_place")
    fun getAllTopPlaces(): LiveData<List<TopPlace>>
}