package com.chobo.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.chobo.domain.useCase.MartUseCase

class HomeViewModel(
    private val martUseCase: MartUseCase
) : ViewModel() {
    suspend fun returdsn(){
        martUseCase.getAllMarts()
    }
}