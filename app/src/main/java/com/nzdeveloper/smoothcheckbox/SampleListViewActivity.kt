package com.nzdeveloper.smoothcheckbox

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nzdeveloper.smoothcheckbox.databinding.ActivitySampleListViewBinding


class SampleListViewActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SampleListViewActivity::class.java))
        }
    }

    private lateinit var binding: ActivitySampleListViewBinding
    private val mList: ArrayList<Bean> = ArrayList<Bean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i in 0..99) {
            mList.add(Bean())
        }
        val adapter = SampleAdapter(mList)
        binding.lv.adapter = adapter
    }
}