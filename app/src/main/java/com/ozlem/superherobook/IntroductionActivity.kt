package com.ozlem.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// MainActivity ve XML arasındaki senkronizasyonu sağlamak için:
import kotlinx.android.synthetic.main.activity_introduction.*


class IntroductionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)

        // Yollanan veriyi alalım:
        val intent = intent
        val chooseHero = intent.getStringExtra( "SuperHeroName")
        textViewIntroID.text = chooseHero

        val choosenHeroImage = intent.getIntExtra("SuperHeroImages",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources , choosenHeroImage)
        imageViewID.setImageBitmap(bitmap)

        /*
        val choose_hero = SingletonClass.ChooseHero
        val chooseImage = SingletonClass.image
        imageView.setImageBitmap(chooseImage)
         */
    }
}