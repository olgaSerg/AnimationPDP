package com.example.animationpdp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import com.example.animationpdp.databinding.ActivityConstraintSetAnimationBinding

class ConstraintSetAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConstraintSetAnimationBinding
    private var toggled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintSetAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToggle.setOnClickListener {
            val constraintSet = ConstraintSet()
            constraintSet.clone(this, if (toggled) R.layout.activity_constraint_set_animation else R.layout.activity_constraint_set_animation_alt)
            TransitionManager.beginDelayedTransition(binding.root)
            constraintSet.applyTo(binding.root)
            toggled = !toggled
        }
    }
}