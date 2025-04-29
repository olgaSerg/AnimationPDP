package com.example.animationpdp

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityAnimatorSetBinding

class AnimatorSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimatorSetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimatorSetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnimate.setOnClickListener {
            val scaleX = ObjectAnimator.ofFloat(binding.imageView, "scaleX", 1f, 1.5f)
            val scaleY = ObjectAnimator.ofFloat(binding.imageView, "scaleY", 1f, 1.5f)
            val rotation = ObjectAnimator.ofFloat(binding.imageView, "rotation", 0f, 360f)

            AnimatorSet().apply {
                playTogether(scaleX, scaleY)
                play(rotation).after(scaleX)
                duration = 1000
                interpolator = AccelerateDecelerateInterpolator()
                start()
            }
        }
    }
}