package com.zy.mei_kotlin.main.homepage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.zy.exRecyclerView.CommonRecyclerHolder
import com.zy.exRecyclerView.HolderAdapter

/**
 * Created by yunzou on 17-8-23.
 */
class HomePageAdapter : HolderAdapter() {

    companion object {

        val DATA: MutableList<String> = ArrayList()

        init {
            for (i in 0..50) {
                DATA.add(" ----- $i ------ ")
            }
        }
    }

    private var inflate: LayoutInflater? = null

    override fun getItemCount(): Int {
        return DATA.size
    }

    override fun onCreateView(parent: ViewGroup, viewType: Int): View {
        if (inflate == null){
            inflate = LayoutInflater.from(parent.context)
        }

        return inflate!!.inflate(android.R.layout.simple_list_item_1, parent, false)
    }

    override fun onBindViewHolder(holder: CommonRecyclerHolder, position: Int) {
        holder.getView<TextView>(android.R.id.text1).text = DATA[position]
    }

}