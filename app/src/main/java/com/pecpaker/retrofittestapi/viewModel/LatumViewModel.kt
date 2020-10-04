package com.pecpaker.retrofittestapi.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pecpaker.retrofittestapi.model.Latum
import com.pecpaker.retrofittestapi.repository.Repository
import kotlinx.coroutines.launch

class LatumViewModel(val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Latum> = MutableLiveData()
    fun getLatum(){
        viewModelScope.launch {
            val response = repository.getLatum()
            myResponse.value = response
        }
    }
}