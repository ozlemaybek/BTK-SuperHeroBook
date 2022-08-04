package com.ozlem.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter (val superHeroList : ArrayList<String> , val HeroImages : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>() {
    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    // ViewHolder sınıfı oluşturulduğu zaman yapılacak işlemler:
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {

        // from içinde bizden bir context istiyor. Gördüğümüz gibi burada context'e daha farklı ulaşıyoruz.
        // inflate ile recycler_row'a ulaşabiliriz:
        // 3. parametre Root'a bağlayayım mı diye soruyor.
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent , false )
        return SuperHeroVH(itemView)
    }

    // SuperHeroVH'a holder değişkeni ile ulaşabiliriz:
    // position sırayla 0 1 2 3 diye gidecek item gibi düşünebiliriz:
    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.recyclerViewTextViewID.text = superHeroList.get(position)
        // Diğer ekrana geçiş:
        holder.itemView.setOnClickListener{
            // it: tıklanan view
            // ilk parametre olarak context'i 2. parametre olarak gideceğimiz yeri istiyor:
            val intent = Intent(holder.itemView.context , IntroductionActivity::class.java)
            intent.putExtra("SuperHeroName" , superHeroList.get(position))
            intent.putExtra("SuperHeroImages",HeroImages.get(position))
            /* Verimsiz kısım:
            val singleton = SingletonClass.ChooseHero
            singleton.image = HeroImages.get(position)
             */
            holder.itemView.context.startActivity(intent)

            // Şimdi görselleri yollayalım:
            // intent ile görsel yollayamayız çünkü intent ile büyük boyutlu şeyler yollamaya çalıştığımzda uygulama çöker.
            // Çünkü intent küçük boyutlu verileri taşımak için oluşturulmuş bir yapı.
            // Genelde görselleri bir actiivty'den diğerine aktarmayız bu çok tercih edilen bir yapı değil.
        }
    }

    // Bu recyclerView içerinde kaç tane row olacak:
    override fun getItemCount(): Int {
        return superHeroList.size
    }
}