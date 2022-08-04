package com.ozlem.superherobook

import android.graphics.Bitmap

class SingletonClass {

    // Objemizin adı ChooseHero ve tek bir property'si var oda image
    companion object ChooseHero {
        var image : Bitmap? = null
    }
}