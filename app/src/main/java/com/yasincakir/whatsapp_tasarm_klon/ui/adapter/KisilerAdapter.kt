package com.yasincakir.whatsapp_tasarm_klon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yasincakir.whatsapp_tasarm_klon.data.entity.Kisiler
import com.yasincakir.whatsapp_tasarm_klon.databinding.CardTasarimBinding
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentFragment3Binding

class KisilerAdapter(var mContext:Context,var kisiListesi:List<Kisiler>)
    :RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>(){


    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)

        return CardTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val t = holder.tasarim
        val kisi = kisiListesi.get(position)


        t.imageResim.setImageResource(mContext.resources.getIdentifier(kisi.resim,"drawable",mContext.packageName))

        t.txtAd.text ="${kisi.kisiAd}"
        t.txtMesaj.text ="${kisi.mesaj}"

    }

    override fun getItemCount(): Int {
        return kisiListesi.size
    }

}