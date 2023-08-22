package com.hoantruong6814.runingtracker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    version = 1,
    entities = [Run::class]
)
@TypeConverters(Converters::class)
abstract class RunDatabase: RoomDatabase() {

    abstract fun getRunDao(): RunDao;

}