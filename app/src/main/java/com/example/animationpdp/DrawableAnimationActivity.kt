package com.example.animationpdp

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityDrawableAnimationBinding

class DrawableAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrawableAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawableAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setBackgroundResource(R.drawable.frame_animation)
        val animationDrawable = binding.imageView.background as AnimationDrawable

        binding.btnStart.setOnClickListener {
            animationDrawable.start()
        }

        binding.btnStop.setOnClickListener {
            animationDrawable.stop()
        }
    }
}