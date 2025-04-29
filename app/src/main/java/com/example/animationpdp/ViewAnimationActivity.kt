package com.example.animationpdp

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityViewAnimationBinding

class ViewAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartAnimation.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.view_animation_sample)
            binding.imageView.startAnimation(animation)
        }
    }
}