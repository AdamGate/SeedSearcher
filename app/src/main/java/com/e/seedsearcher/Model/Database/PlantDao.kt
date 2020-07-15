package com.e.seedsearcher.Model.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlantDao {

    @Query("SELECT * from plant_info ORDER BY plant_id ASC")
    fun getPlantMasterList(): List<Plant>

    @Query("SELECT * FROM plant_info WHERE plant_id LIKE :plant_id OR common_name = :common_name")
    fun getPlant(plant_id: Int, common_name: String): Plant

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(plant: Plant)

}