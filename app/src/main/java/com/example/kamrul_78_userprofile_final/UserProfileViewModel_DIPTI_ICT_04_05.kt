package com.example.kamrul_78_userprofile_final

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_DIPTI_ICT_04_05(application: Application) : AndroidViewModel(application) {
    private val repository: UserProfileRepository_DIPTI_ICT_04_05

    init {
        val userProfileDao = UserDatabase_DIPTI_ICT_04_05.getDatabase(application).userProfileDao()
        repository = UserProfileRepository_DIPTI_ICT_04_05(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_04_05>> {
        return repository.getUserProfiles()
    }

    fun insertUserProfile(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(userProfileDIPTIICT0405)
        }
    }

    fun updateUserProfile(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfileDIPTIICT0405)
        }
    }

    fun deleteUserProfile(userProfileDIPTIICT0405: UserProfile_DIPTI_ICT_04_05) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfileDIPTIICT0405)
        }
    }
}