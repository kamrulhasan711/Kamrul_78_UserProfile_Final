package com.example.kamrul_78_userprofile_final

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity_DIPTI_ICT_04_05 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_dipti_ict0405)

        // Simulate loading or some processing time
        Handler(Looper.getMainLooper()).postDelayed({
            // Retrieve the target activity and user profile
            val targetActivityName = intent.getStringExtra("TARGET_ACTIVITY")
            val userProfileDIPTIICT0405 = intent.getSerializableExtra("USER_PROFILE") as UserProfile_DIPTI_ICT_04_05?

            // Navigate to the target activity
            val targetIntent = Intent()
            targetIntent.setClassName(this, targetActivityName ?: return@postDelayed)
            userProfileDIPTIICT0405?.let {
                targetIntent.putExtra("USER_PROFILE", it)
            }
            startActivity(targetIntent)
            finish() // Finish this activity so the user can't return to it
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}