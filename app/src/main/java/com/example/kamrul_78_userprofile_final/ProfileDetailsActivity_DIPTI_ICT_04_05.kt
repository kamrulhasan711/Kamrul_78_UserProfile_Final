package com.example.kamrul_78_userprofile_final

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileDetailActivity : AppCompatActivity() {
    private lateinit var userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05

    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dobTextView: TextView
    private lateinit var districtTextView: TextView
    private lateinit var mobileTextView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details_dipti_ict0405)

        // Retrieve the user profile from the intent
        userProfileDIPTIICT0405 = intent.getSerializableExtra("USER_PROFILE") as UserProfile_DIPTI_ICT_04_05

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        dobTextView = findViewById(R.id.dobTextView)
        districtTextView = findViewById(R.id.districtTextView)
        mobileTextView = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameTextView.text = userProfileDIPTIICT0405.name
        emailTextView.text = userProfileDIPTIICT0405.email
        dobTextView.text = userProfileDIPTIICT0405.dob
        districtTextView.text = userProfileDIPTIICT0405.district
        mobileTextView.text = userProfileDIPTIICT0405.mobile
    }
}