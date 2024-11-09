package com.example.kamrul_78_userprofile_final

import androidx.lifecycle.LiveData

class UserProfileRepository_DIPTI_ICT_04_05(private val userProfileDao: UserProfileDao_DIPTI_ICT_04_05) {
    fun getUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_04_05>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        userProfileDao.insert(userProfileDIPTIICT0405)
    }


    suspend fun update(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        userProfileDao.update(userProfileDIPTIICT0405)
    }

    suspend fun delete(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        userProfileDao.delete(userProfileDIPTIICT0405)
    }
}