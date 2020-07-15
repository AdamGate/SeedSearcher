package com.e.seedsearcher.Model.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [Plant::class], version = 1, exportSchema = false)
public abstract class PlantRoomDatabase : RoomDatabase() {

    abstract fun plantDao() : PlantDao
    companion object {
        //Singleton prevents multiple instances of database opening at the same time
        @Volatile private var INSTANCE: PlantRoomDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): PlantRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlantRoomDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}