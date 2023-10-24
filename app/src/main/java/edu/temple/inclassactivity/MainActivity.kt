package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()
        val fragment1 = ImageDisplayFragment.newInstance(imageArray)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, fragment1)
            .commit()
    }
}