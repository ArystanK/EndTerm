package kz.arctan.endterm.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kz.arctan.endterm.data.model.Recent

@Dao
interface RecentDao {
    @Insert
    fun insertRecent(recent: Recent)

    @Update
    fun updateRecent(recent: Recent)

    @Delete
    fun deleteRecent(recent: Recent)

    @Query("SELECT * FROM recent")
    fun getRecentList(): LiveData<List<Recent>>
}