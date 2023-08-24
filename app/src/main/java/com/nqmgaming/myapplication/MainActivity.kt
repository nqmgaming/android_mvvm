package com.nqmgaming.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.nqmgaming.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.controlButton.setOnClickListener {
            displayProgressBar();
        }

    }

    private fun displayProgressBar() {
        binding.apply {
            if (progressCircular.visibility == View.GONE) {
                progressCircular.visibility = View.VISIBLE
                controlButton.text = "Stop"
            } else {
                progressCircular.visibility = View.GONE
                controlButton.text = "Start"
            }
        }
    }


}