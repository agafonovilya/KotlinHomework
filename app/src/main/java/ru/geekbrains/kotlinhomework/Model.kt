package ru.geekbrains.kotlinhomework

import android.os.Handler

class Model {
    var count: Int = 0

    fun refreshData(onDataReadyCallback: OnDataReadyCallback) {
        count += 1
        Handler().postDelayed({
            onDataReadyCallback.onDataReady(count)
        },2000)
    }
}

interface OnDataReadyCallback {
    fun onDataReady(data: Int)
}