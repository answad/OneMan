package com.chobo.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.chobo.data.entity.MartEntity

@Dao
interface MartDao {

    @Query("SELECT * FROM marts")
    fun getAllUsers(): List<MartEntity>

    @Query("SELECT * FROM marts WHERE id = :martId")
    fun getMartById(martId: Long): MartEntity?

    @Query("SELECT COUNT(*) FROM marts")
    fun getNumberOfRows(): Int

    @Insert
    fun insertUser(mart: MartEntity)

    @Update
    fun updateUser(mart: MartEntity)

    @Delete
    fun deleteUser(mart: MartEntity)

}