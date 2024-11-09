package com.example.kamrul_78_userprofile_final

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface UserProfileDao_DIPTI_ICT_04_05 {
    @Insert
    suspend fun insert(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05)

    @Update
    suspend fun update(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05)

    @Delete
    suspend fun delete(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_04_05>>
}