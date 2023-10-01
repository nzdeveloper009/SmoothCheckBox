package com.nzdeveloper.smoothcheckbox

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nzdeveloper.smoothcheckbox.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toSample(view: View) {
        SampleActivity.start(this)
    }
    fun toListView(view: View) {
        SampleListViewActivity.start(this)
    }
}