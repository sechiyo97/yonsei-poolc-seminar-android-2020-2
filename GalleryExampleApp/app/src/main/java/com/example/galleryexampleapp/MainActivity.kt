package com.example.galleryexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = GridLayoutManager(this, 3)

        val myAdapter = MyImageAdapter()
        recycler_view.adapter = myAdapter
        myAdapter.imageResourceList = listOf(
            R.drawable.img_001,
            R.drawable.img_002,
            R.drawable.img_003,
            R.drawable.img_004,
            R.drawable.img_005
        )
        //myAdapter.notifyDataSetChanged()


    }
}