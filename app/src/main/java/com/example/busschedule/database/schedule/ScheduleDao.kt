package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll()

    @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY stop_name ASC")
    fun getByStopName(stopName: String)
}