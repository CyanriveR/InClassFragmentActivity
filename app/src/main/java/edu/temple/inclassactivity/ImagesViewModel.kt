package edu.temple.inclassactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImagesViewModel : ViewModel() {
        private val images = MutableLiveData<IntArray>()

        fun setImage(newimages : IntArray){
                images.value = newimages
        }

        fun getImages () : LiveData<IntArray> {
                return images
        }
}