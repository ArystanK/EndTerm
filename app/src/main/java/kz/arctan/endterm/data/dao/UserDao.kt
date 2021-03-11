package kz.arctan.endterm.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kz.arctan.endterm.data.model.User

//TODO add annotations
interface UserDao {
    fun insertUser(user: User)

    fun updateUser(user: User)

    fun deleteUser(user: User)

    fun getUser(username: String, password: String): LiveData<User>
}