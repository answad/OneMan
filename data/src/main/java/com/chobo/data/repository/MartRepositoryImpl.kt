package com.chobo.data.repository

import com.chobo.data.dao.MartDao
import com.chobo.data.entity.MartEntity
import com.chobo.domain.repository.MartRepository

class MartRepositoryImpl(private val martDao: MartDao) :MartRepository {
    override suspend fun getAllUsers(): List<MartEntity> {
        return  martDao.getAllUsers()
    }

    override suspend fun getMartById(martId: Long): MartEntity? {
        return martDao.getMartById(martId)
    }

    override suspend fun getNumberOfRows(): Int {
        return martDao.getNumberOfRows()
    }

    override suspend fun insertUser(mart: MartEntity) {
        martDao.insertUser(mart)
    }

    override suspend fun updateUser(mart: MartEntity) {
        martDao.updateUser(mart)
    }

    override suspend fun deleteUser(mart: MartEntity) {
        martDao.deleteUser(mart)
    }
}