package kz.arctan.endterm.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kz.arctan.endterm.data.model.TopPlace

interface TopPlaceDao {
    fun insertTopPlace(topPlace: TopPlace)

    fun updateTopPlace(topPlace: TopPlace)

    fun deleteTopPlace(topPlace: TopPlace)

    fun getAllTopPlaces(): LiveData<List<TopPlace>>
}