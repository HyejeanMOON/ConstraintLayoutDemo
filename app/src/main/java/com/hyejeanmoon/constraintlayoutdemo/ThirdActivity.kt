package com.hyejeanmoon.constraintlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyejeanmoon.constraintlayoutdemo.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityThirdBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_third)

        title = "ChainStyle"

    }

}