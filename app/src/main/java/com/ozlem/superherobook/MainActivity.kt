package com.ozlem.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
// MainActivity ve XML arasındaki senkronizasyonu sağlamak için:
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Veri Hazırlığı:
        var superHeroNames = ArrayList<String>()
        superHeroNames.add("Batman")
        superHeroNames.add("Superman")
        superHeroNames.add("Ironman")
        superHeroNames.add("Aquaman")
        superHeroNames.add("Spiderman")

        // Verimsiz Tanımlamalar:
        // Şuanda batman için Bitmap oluşturduk:
        var batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        var supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        var ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        var aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        var spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superHeroImages =ArrayList<Bitmap>()
        superHeroImages.add(batmanBitmap)
        superHeroImages.add(supermanBitmap)
        superHeroImages.add(ironmanBitmap)
        superHeroImages.add(aquamanBitmap)
        superHeroImages.add(spidermanBitmap)


        // Adapter'ı oluşturalım:
        // Önce recyclerView'umuzun nasıl görüneceğini söylememiz gerekiyor.
        // Biz alt alta durmalarını istiyoruz:
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        // adapter'ı oluşturalım:
        val adapter = RecyclerAdapter(superHeroNames , superHeroImages)
        recyclerView.adapter = adapter

    }
}