package com.example.animationpdp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationpdp.databinding.ActivityViewPropertyAnimatorBinding

class ViewPropertyAnimatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPropertyAnimatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPropertyAnimatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartAnimation.setOnClickListener {
            binding.imageView.animate()
                .rotation(360f)
                .scaleX(1.5f)
                .scaleY(1.5f)
                .setDuration(1000)
                .withEndAction {
                    binding.imageView.animate()
                        .rotation(0f)
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(1000)
                        .start()
                }
                .start()
        }
    }
}