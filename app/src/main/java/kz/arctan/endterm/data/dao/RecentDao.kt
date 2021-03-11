package kz.arctan.endterm.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kz.arctan.endterm.data.model.Recent


//TODO add annotations
interface RecentDao {
    fun insertRecent(recent: Recent)

    fun updateRecent(recent: Recent)

    fun deleteRecent(recent: Recent)

    fun getRecentList(): LiveData<List<Recent>>
}