package com.hoantruong6814.runingtracker.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run);

    @Delete
    suspend fun deleteRun(run: Run);
    @Query("SELECT * FROM run_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortByAvgSpeedInKMH(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortByDistanceInMeters(): LiveData<List<Run>>
    @Query("SELECT SUM(timeInMillis) FROM run_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(distanceInMeters) FROM run_table")
    fun getTotalTimeInDistanceInMeters(): LiveData<Int>

    @Query("SELECT SUM(avgSpeedInKMH) FROM run_table")
    fun getTotalTimeInDistanceInAvgSpeedInKMH(): LiveData<Float>

    @Query("SELECT SUM(caloriesBurned) FROM run_table")
    fun getTotalTimeInCaloriesBurned(): LiveData<Int>
}