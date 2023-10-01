package com.nzdeveloper.smoothcheckbox

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.nzdeveloper.smoothcheckbox.databinding.ActivityMainBinding
import com.nzdeveloper.smoothcheckbox.databinding.ActivitySampleBinding
import com.nzdeveloper.smoothcheckboxlibrary.SmoothCheckBox

class SampleActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SampleActivity::class.java))
        }
    }
    lateinit var binding: ActivitySampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scb.setOnCheckedChangeListener(object: SmoothCheckBox.OnCheckedChangeListener{
            override fun onCheckedChanged(checkBox: SmoothCheckBox?, isChecked: Boolean) {
                Log.d("SmoothCheckBox", "$isChecked")
            }
        })
    }
}