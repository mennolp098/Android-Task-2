package com.example.android_task_2

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.android_task_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)

    // Don't forget to create a binding object as you did in previous assignments.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews();
    }

    private fun initViews() {

        for (i in Place.PLACE_NAMES.indices) {
            places.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RES_DRAWABLE_IDS[i]))

        }
        placeAdapter.notifyDataSetChanged()

        /*
        binding.rvPlaces.layoutManager = StaggeredGridLayoutManager(2, this@MainActivity, StaggeredGridLayoutManager.HORIZONTAL);
        binding.rvPlaces.adapter = placeAdapter
        binding.rvPlaces.addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
        createItemTouchHelper().attachToRecyclerView(binding.rvPlaces) */
    }

}