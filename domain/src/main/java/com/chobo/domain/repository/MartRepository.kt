package com.chobo.domain.repository

import com.chobo.data.entity.MartEntity

interface MartRepository {
    suspend fun getAllUsers(): List<MartEntity>

    suspend fun getMartById(martId: Long): MartEntity?

    suspend fun getNumberOfRows(): Int

    suspend fun insertUser(mart: MartEntity)

    suspend fun updateUser(mart: MartEntity)

    suspend fun deleteUser(mart: MartEntity)
}