package com.e.seedsearcher.View

import android.Manifest
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.seedsearcher.Model.PlantList
import com.e.seedsearcher.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    //Codes
    private val TAG = "MAIN_ACTIVITY"
    private val PERMISSIONS_REQUEST_CAMERA = 100
    private val PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 101
    private var hasCameraFunctionality = true
    private var hasStorageFunctionality = true
    private val REQUEST_IMAGE_CAPTURE = 1000
    private val REQUEST_IMAGE_GALLERY = 1001
    private val REQUEST_IMAGE_ANAYLZE = 1002

    private var pList = PlantList()

    //Layout
    private var areButtonsShowing = true
    private lateinit var leftGroupDetails: Group
    private lateinit var midGroupDetails: Group
    private lateinit var rightGroupDetails: Group
    private lateinit var extendedGroupDetails: Group

    private var currentDisplayPlant = "empty"

    //Directory
    private lateinit var currentPhotoPath: String

    //Permissions
    private val appPermissions = arrayOf(
        Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }
}