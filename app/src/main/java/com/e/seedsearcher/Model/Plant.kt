package com.e.seedsearcher.Model

import android.graphics.drawable.Drawable

class Plant(common_name : String, scientific_name : String, id : String, seedImage: Drawable, flowerImage: Drawable,
            propagation: String, plantImage: Drawable) {

    var common_name = "empty"
    var scientific_name: String = "empty"
    var plantImage: Drawable? = null
    var flowerImage: Drawable? = null
    var seedImage: Drawable? = null
    var id: String? = "empty"
    var propagation: String = "empty"

    init {
        this.common_name = common_name
        this.scientific_name = scientific_name
        this.id = id
        this.seedImage = seedImage
        this.flowerImage = flowerImage
        this.propagation = propagation
        this.plantImage = plantImage
    }
}