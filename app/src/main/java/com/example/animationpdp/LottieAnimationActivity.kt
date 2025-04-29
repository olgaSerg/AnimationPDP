package com.example.animationpdp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityLottieAnimationBinding

class LottieAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLottieAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottieAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lottieView.setAnimation(R.raw.lottie)
        binding.lottieView.playAnimation()
    }
}