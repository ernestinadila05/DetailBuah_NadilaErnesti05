package com.nadila.detailbuah.model

import android.content.Context
import com.nadila.detailbuah.R

data class ModelBuah(
    val image : Int,
    val nama : String,
    val lokasi : String,
    val deskripsi : String
)

//mock data

object MockList{

    fun getModel(context: Context) : List<ModelBuah>{
        val  itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "apel",
            "Indoneisa",
            context.getString(R.string.st_apel)  //
        )

        val  itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "anggur",
            "Malaysia",
            context.getString(R.string.st_anggur)
        )

        val  itemModel3 = ModelBuah(
            R.drawable.orange,
            nama = "jeruk",
            "Australia",
            context.getString(R.string.st_jeruk)
        )

        val  itemModel4 = ModelBuah(
            R.drawable.pear,
            nama = "pear",
            "Bali",
            context.getString(R.string.st_pear)
        )

        val  itemModel5 = ModelBuah(
            R.drawable.strawberry,
            nama = "strawbery",
            "Filiphina",
            context.getString(R.string.st_strawbery)
        )

        val  itemModel6 = ModelBuah(
            R.drawable.orange,
            nama = "orange",
            "Thailand",
            context.getString(R.string.st_jeruk)
        )

        val itemList:ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}