# SuperHeroBook

# Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

## Uygulama Resimlerinde Telif Hakkı

> Eğer bir projeyi google play'e yükleyeceksek içine google'dan aldığımız resimleri koyamayız. Çünkü telif hakkına girer. Bu durumda telif hakkı olmayan görselleri ya da kendi görsellerimizi kullanmamız gerekir.

> Telif hakkı olmayan görselleri bulabiliriz. Google'a "Royalty Free Image" yazdığımızda telif hakkı ödemeyeceğimiz görseller demektir. Gelen web sitelerinde araştırma yapıp ücretsiz resimler bulabiliriz. 

## RecyclerView

> RecyclerView; bizim bazı elemanları liste şeklinde göstermemizi sağlar.

> Kullanmadan önce indirmemiz gerekebilir. İndirdiğimizde build.gradle'da dependicies kısmına eklenip senkronize ediliyor.

> Senkronizasyondan sonra artık recyclerView'u projemizde kullanabiliriz. Ekrana sürüklediğimizde tüm ekranı kaplayacaktır. 

> RecyclerView kendiliğinden scroll yapıya sahiptir.

## Bitmap

> Bitmap resimler için oluşturulmuş bir class.

> Bitmap'i herhangi bir kaynaktan oluşturabilmek için BitmapFactory dediğimiz yapıyı kullanıyoruz. 

> BitmapFactory: FArklı kaynaklarda Bitmap objeleri oluşturmamızı sağlayan class. BitmapFactory birçok şeyi decode edebilir yani Bitmap'e çevirebilir. 

> İnternetten bir görsel indirirken aslında görsel olarak değil veri olarak indiriyoruz ve kod içinde görsele çeviriyoruz. 

## Adapter

> Adaptör; kaynakları bağlarken kullandığımız bir yapıdır.

> Bir recyclerView adapter'ı yazarken önce adapter için bir sınıf oluşturmamız sonrada bu sınıfın bir RecyclerView adapter'ı olacağını belirtmemiz gerekiyor. 

> Bunu yaparken bizden bir ViewHolder yani görünüm tutucu sınıf istenecek.  

> View Holder olarak belirlediğimiz class'ı oluşturmalıyız. Oluştururken nerede oluşturmak istediğimizi soracak:

![image](https://user-images.githubusercontent.com/109730490/182865402-6e5ced18-be91-4f01-a379-bc92d7693236.png)

- Extract to Seperate File: Başka bir dosyada

- RecyclerAdapter.kt: Bunun içerisinde

- RecyclerAdapter: Sınıfın içerisinde

> Biz sınıfın içinde oluşturmayı seçtik. 

## NOT

- Bir XML'i bir yere bağlarken inflater kullanırız. 

## Singleton

> Birsınıf oluşturacağız bu sınıfın içerisinde sadece bir nesne olacak.

> Tek nesne olması bize şöyle bir fayda sağlayacak. Biz o neseneyi her çağırdığımızda uygulamanın herhangi bir yerinde ulaşabileceğim. Yani istediğim her yerde o nesneyi çağıracağım ve aynı nesneye referans göstereceğim. Bu yüzden o nesnenin görsel özelliğini değiştirdiğimde ve bir Bitmap'e eşitlediğimde başkabir activity'de de aynı referansa ulaşacağım için yine aynı görseleulaşabileceğim. Normalde eğer bir Singleton sınıfımız yoksa bunu yapamayız. Çünkü başka bir activity'de başka bir sınıfta oluşturduğumuz nesne başka bir nesene olacaktır. Singleton'da ise birebir aynı nesne olur. 

> companion object; Singleton'da kullanılan bir yapıdır. 
 
## Projede Yapılanlar

> Recycler view'un tek bir satırının nasıl görüneceğini tasarlamak için Layout klasöründe yeni bir "Layout Resource File" oluşturduk:

![image](https://user-images.githubusercontent.com/109730490/182859490-0cc0bc2f-fd6a-4a34-950a-fa2aa61d2f9c.png)

> Layout ismi belirlerken büyük harf kullanamayız onun yerine alt tire kullanıyoruz:

![image](https://user-images.githubusercontent.com/109730490/182859812-ee8fe87d-620d-4175-979d-df3a31c10e4e.png)

> Bu fonksiyon bizden bir SuperHeroVH döndürmemizi istiyor:

![image](https://user-images.githubusercontent.com/109730490/182869318-3ffcb9e0-65a1-4c4f-b257-11bd4f00366b.png)

## Projenin Ekran Görüntüleri

![image](https://user-images.githubusercontent.com/109730490/182955815-4b2fd88e-6c7b-4110-bf44-59e6d2d85c33.png)

- ironman'e tıklandığında

![image](https://user-images.githubusercontent.com/109730490/182955914-d005da89-b61f-4e30-8169-77066bfe098b.png)

## Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)
