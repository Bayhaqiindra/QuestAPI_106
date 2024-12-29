package com.example.pertemuan12.ui.view

import com.example.pertemuan12.model.Mahasiswa

sealed class DetailUiState {
    object Loading : DetailUiState()
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
}