package com.example.lifecycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.lifecycleobserver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.qualifiedName

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val testObserver = TestObserver(this.lifecycle)

        if (savedInstanceState != null) {
            binding.editTextName.setText(savedInstanceState.getString("key_name"))
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key_name", binding.editTextName.toString())
        Log.d(TAG, "onSaveInstanceState")
    }

}

