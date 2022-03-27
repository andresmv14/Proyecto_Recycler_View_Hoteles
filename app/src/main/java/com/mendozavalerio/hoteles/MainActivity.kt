package com.mendozavalerio.hoteles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mendozavalerio.hoteles.adaptador.AdaptadorHotel
import com.mendozavalerio.hoteles.modelo.Hotel

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaHoteles = ArrayList<Hotel>()
        listaHoteles.add(Hotel("HardRock","Cancún, Q.R.","$9,300","https://media-cdn.tripadvisor.com/media/photo-s/1d/fa/f6/d7/hrhcancun-exterior.jpg"))
        listaHoteles.add(Hotel("Krystal","Cancún, Q.R.","$1,850","https://www.krystal-cancun.com/uploads/galeriahoteles/backgrounds-krystalcancun_u826K0A.jpg"))
        listaHoteles.add(Hotel("Flamingo","Cancún, Q.R.","$1,794","https://imgcy.trivago.com/c_limit,d_dummy.jpeg,f_auto,h_1300,q_auto,w_2000/itemimages/34/46/34464_v6.jpeg"))
        listaHoteles.add(Hotel("Fiesta Inn","Cancún, Q.R.","$1,614","https://media-cdn.tripadvisor.com/media/photo-s/1c/df/0c/6a/exterior.jpg"))
        listaHoteles.add(Hotel("Hilton","Pto. Vallarta, Jal.","$4,636","https://media-cdn.tripadvisor.com/media/photo-s/21/9c/cf/45/exterior.jpg"))
        listaHoteles.add(Hotel("Vamar","Pto. Vallarta, Jal.","$2,796","https://media-cdn.tripadvisor.com/media/photo-s/0f/6b/69/f3/llegando-al-hotel-vamar.jpg"))
        listaHoteles.add(Hotel("HardRock","Guadalajara, Jal.","$2,232","https://imgcy.trivago.com/c_limit,d_dummy.jpeg,f_auto,h_1300,q_auto,w_2000/itemimages/91/94/9194314_v1.jpeg"))
        listaHoteles.add(Hotel("Riu","Guadalajara, Jal","$1,874","https://ibasica.com.mx/wp-content/uploads/2017/06/riugdl.jpg"))


        miRecycler = findViewById(R.id.recyclerHoteles)

        miRecycler.adapter = AdaptadorHotel(listaHoteles)

        miRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}