package ru.geekbrains.kotlinhomework

import androidx.databinding.ObservableField

class ViewModel {
    var model: Model = Model()
    val text = ObservableField<String>()
    val isLoading = ObservableField<Boolean>()

    fun refresh(){
        isLoading.set(true) //состояние загрузки
        model.refreshData(object : OnDataReadyCallback {
            override fun onDataReady(data: Int) {
                isLoading.set(false) //данные получены
                text.set(data.toString())
            }
        })
    }

}