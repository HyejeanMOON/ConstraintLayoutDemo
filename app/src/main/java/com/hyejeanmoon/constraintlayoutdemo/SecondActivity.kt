package com.hyejeanmoon.constraintlayoutdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyejeanmoon.constraintlayoutdemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)

        title = "GuideLine"

        binding.next.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

}