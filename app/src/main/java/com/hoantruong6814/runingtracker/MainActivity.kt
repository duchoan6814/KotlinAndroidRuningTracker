package com.hoantruong6814.runingtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hoantruong6814.runingtracker.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"


    @Inject
    lateinit var runDao: RunDao;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: rundao ${hashCode()}")
    }
}