package com.rehan.politeknik.model

import com.rehan.politeknik.R

data class modelPoli(
    val  image: Int
)

object Mocklist{

    fun getModel() : List<modelPoli>{
        val itemModel1 = modelPoli(
            R.drawable.logopoli
        )

        val itemModel2 = modelPoli(
            R.drawable.ti
        )

        val itemModel3 = modelPoli(
            R.drawable.gambar1
        )

        val itemModel4 = modelPoli(
            R.drawable.gambar2
        )

        val itemModel5 = modelPoli(
            R.drawable.gambar3
        )

        val itemModel6 = modelPoli(
            R.drawable.gambar4
        )

        val itemList: ArrayList<modelPoli> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
