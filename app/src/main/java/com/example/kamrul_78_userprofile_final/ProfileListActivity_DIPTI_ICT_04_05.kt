package com.example.kamrul_78_userprofile_final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_DIPTI_ICT_04_05 : AppCompatActivity() {

    private lateinit var profileViewModel: UserProfileViewModel_DIPTI_ICT_04_05
    private lateinit var profileAdapter: ProfileAdapter_DIPTI_ICT_04_05

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_item_dipti_ict_04_05)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_DIPTI_ICT_04_05::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter = ProfileAdapter_DIPTI_ICT_04_05()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Observe profiles from ViewModel
        profileViewModel.getUserProfiles().observe(this, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        // Set item click listener for details
        profileAdapter.setOnItemClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_04_05, ProfileDetailActivity::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        // Set delete click listener
        profileAdapter.setOnDeleteClickListener { userProfile ->
            showDeleteConfirmationDialog(userProfile)
        }

        // Set update click listener
        profileAdapter.setOnUpdateClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_04_05, UpdateProfileActivity_DIPTI_ICT_04_05::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        // Add profile button click listener
        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_04_05, AddProfileActivity_DIPTI_ICT_04_05::class.java)
            startActivity(intent)
        }
    }

    // Show delete confirmation dialog
    private fun showDeleteConfirmationDialog(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Delete Profile")
        builder.setMessage("Are you sure you want to delete this profile?")

        builder.setPositiveButton("Yes") { dialog, which ->
            profileViewModel.deleteUserProfile(userProfileDIPTIICT0405)  // Delete the profile
            dialog.dismiss()
        }

        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()  // Cancel delete operation
        }





        val dialog = builder.create()
        dialog.show()

    }
}