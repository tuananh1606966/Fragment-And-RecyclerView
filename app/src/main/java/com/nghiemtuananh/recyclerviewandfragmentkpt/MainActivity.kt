package com.nghiemtuananh.recyclerviewandfragmentkpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerviewFragment = RecyclerviewFragment()
        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.ll_main, recyclerviewFragment)
        fragmentTransaction.commit()
    }
}