package com.chobo.domain.useCase

import com.chobo.data.entity.MartEntity
import com.chobo.domain.repository.MartRepository

class MartUseCase(private val martRepository: MartRepository) {

    suspend fun getAllMarts(): List<MartEntity> {
        return martRepository.getAllUsers()
    }

    suspend fun getMartById(martId: Long): MartEntity? {
        return martRepository.getMartById(martId)
    }

    suspend fun getNumberOfMarts(): Int {
        return martRepository.getNumberOfRows()
    }

    suspend fun insertMart(mart: MartEntity) {
        martRepository.insertUser(mart)
    }

    suspend fun updateMart(mart: MartEntity) {
        martRepository.updateUser(mart)
    }

    suspend fun deleteMart(mart: MartEntity) {
        martRepository.deleteUser(mart)
    }
}
