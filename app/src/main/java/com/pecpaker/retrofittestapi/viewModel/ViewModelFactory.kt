package com.pecpaker.retrofittestapi.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pecpaker.retrofittestapi.repository.Repository

class ViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LatumViewModel(repository) as T
    }
}