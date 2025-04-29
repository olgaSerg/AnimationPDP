package com.example.animationpdp

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityPropertyAnimationBinding

class PropertyAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPropertyAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPropertyAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartAnimation.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(binding.imageView, "translationY", 0f, 300f)
            animator.duration = 1000
            animator.repeatCount = 1
            animator.repeatMode = ObjectAnimator.REVERSE
            animator.start()
        }
    }
}