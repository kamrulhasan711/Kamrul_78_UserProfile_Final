package com.example.kamrul_78_userprofile_final

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database(entities = [UserProfile_DIPTI_ICT_04_05::class], version = 1)
abstract class UserDatabase_DIPTI_ICT_04_05 : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao_DIPTI_ICT_04_05

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_DIPTI_ICT_04_05? = null

        fun getDatabase(context: Context): UserDatabase_DIPTI_ICT_04_05 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_DIPTI_ICT_04_05::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}