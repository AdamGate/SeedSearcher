package com.e.seedsearcher.Model.Database

import android.graphics.drawable.Drawable
import androidx.room.*

@Entity
data class Region(
    @PrimaryKey val region_id: String
)

@Entity(tableName = "plant_info")
data class Plant(
    @PrimaryKey val plant_id: Int,
                val scientific_name: String,
                val common_name: String,
                val plant_image_filepath: String?,
                val seed_image_filepath: String?,
                val seed_info: String
)

//@Entity(tableName = "recent_searches")
//data class RecentSearches(
//    @PrimaryKey val search_id: Int,
//    @ForeignKey val plant_id: Int
//)
//
//data class User(
//    @PrimaryKey val user_id
//)