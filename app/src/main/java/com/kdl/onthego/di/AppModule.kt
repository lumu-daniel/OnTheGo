package com.kdl.onthego.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.room.Room
import com.kdl.onthego.db.RunDao
import com.kdl.onthego.db.RunningDatabase
import com.kdl.onthego.orther.Constants.KEY_FIRST_TIME_TOGGLE
import com.kdl.onthego.orther.Constants.KEY_NAME
import com.kdl.onthego.orther.Constants.KEY_WEIGHT
import com.kdl.onthego.orther.Constants.RUNNING_DATABASE_NAME
import com.kdl.onthego.orther.Constants.SHARED_PREFERENCES_NAME
import com.kdl.onthego.repositories.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(database: RunningDatabase) = database.getRunDao()

    @Singleton
    @Provides
    fun provideMainRepository(
        dao: RunDao
    ) = MainRepository(dao)

    @Singleton
    @Provides
    fun provideSharedPrefrences(
        @ApplicationContext app: Context
    ) = app.getSharedPreferences(SHARED_PREFERENCES_NAME, MODE_PRIVATE)

    @Singleton
    @Provides
    fun providesName(
        sharedPreferences: SharedPreferences
    ) = sharedPreferences.getString(KEY_NAME,"") ?: ""

    @Singleton
    @Provides
    fun providesWeight(
        sharedPreferences: SharedPreferences
    ) = sharedPreferences.getFloat(KEY_WEIGHT,80f)

    @Singleton
    @Provides
    fun provideFirstTimeToggle(
        sharedPreferences: SharedPreferences
    ) = sharedPreferences.getBoolean(KEY_FIRST_TIME_TOGGLE,true)
}