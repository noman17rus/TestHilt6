package com.example.testhilt6

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val authRepository: AuthRepository
):ViewModel() {
    fun login() = viewModelScope.launch {
        authRepository.login()
    }

    fun reg() = viewModelScope.launch {
        authRepository.register()
    }
}