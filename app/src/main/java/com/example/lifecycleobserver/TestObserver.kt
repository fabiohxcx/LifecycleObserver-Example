package com.example.lifecycleobserver

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class TestObserver(lifecycle: Lifecycle) : LifecycleObserver {

    val TAG = TestObserver::class.qualifiedName

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun dummyMethodStart() {
        Log.d(TAG, "dummyMethodStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun dummyMethodStop() {
        Log.d(TAG, "dummyMethodStop")
    }

}