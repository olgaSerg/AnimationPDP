package com.example.animationpdp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnViewAnimation.setOnClickListener {
            startActivity(Intent(this, ViewAnimationActivity::class.java))
        }
        binding.btnPropertyAnimation.setOnClickListener {
            startActivity(Intent(this, PropertyAnimationActivity::class.java))
        }
        binding.btnViewPropertyAnimator.setOnClickListener {
            startActivity(Intent(this, ViewPropertyAnimatorActivity::class.java))
        }
        binding.btnAnimatorSet.setOnClickListener {
            startActivity(Intent(this, AnimatorSetActivity::class.java))
        }
        binding.btnConstraintSetAnimation.setOnClickListener {
            startActivity(Intent(this, ConstraintSetAnimationActivity::class.java))
        }
        binding.btnMotionLayoutAnimation.setOnClickListener {
            startActivity(Intent(this, MotionLayoutAnimationActivity::class.java))
        }
        binding.btnDrawableAnimation.setOnClickListener {
            startActivity(Intent(this, DrawableAnimationActivity::class.java))
        }
        binding.btnLottieAnimation.setOnClickListener {
            startActivity(Intent(this, LottieAnimationActivity::class.java))
        }
    }
}