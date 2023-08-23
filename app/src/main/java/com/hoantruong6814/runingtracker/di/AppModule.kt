package com.hoantruong6814.runingtracker.di

import android.content.Context
import androidx.room.Room
import com.hoantruong6814.runingtracker.Constants.RUNNING_DATABASE_NAME
import com.hoantruong6814.runingtracker.db.RunDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, RunDatabase::class.java, RUNNING_DATABASE_NAME).build();

    @Singleton
    @Provides
    fun provideRunDao(db: RunDatabase) = db.getRunDao();


}