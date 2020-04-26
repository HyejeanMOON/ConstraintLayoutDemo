package com.hyejeanmoon.constraintlayoutdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyejeanmoon.constraintlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        title = "Constraint Barrier"

        var count = 0
        binding.change.setOnClickListener {
            if (count % 2 == 0) {
                binding.textView1.text = "TextViewText1TextViewText"
                binding.textView2.text = "TextView2"
            } else {
                binding.textView1.text = "TextView1"
                binding.textView2.text = "TextViewTextTextView2"
            }
            count++
        }

        binding.next.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}
