package com.e.seedsearcher.Model


import android.util.Log

class PlantList {
    private val TAG = "PLANT_LIST"
    var plants = ArrayList<Plant>()

    fun getList() : ArrayList<Plant> {
        return plants
    }

    fun setList(newList : ArrayList<Plant>) {
        Log.d(TAG, "Setting old PlantList to new list")
        plants = newList
    }

    //Only keep track of 3 past searches
    fun add(plant: Plant) {
        Log.d(TAG, "Adding plant to list: " + plant.common_name)
        if (getSize() == 3) {
            Log.d(TAG, "List over 3, removing one and adding new plant")

            //shift everything over
            plants[2] = plants[1]
            plants[1] = plants[0]
            plants[0] = plant
        }
        else {
            Log.d(TAG, "List under 3, adding new plant")
            plants.add(plant)
        }
    }

    fun remove(plant: Plant) {
        Log.d(TAG, "Removing plant from list: " + plant.common_name)
        plants.remove(plant)
    }

    fun getSize() : Int {
        return plants.size
    }

}
