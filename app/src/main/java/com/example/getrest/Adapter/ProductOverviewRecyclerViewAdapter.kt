package com.example.getrest.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.getrest.Data.ProductOverviewData


class ProductOverviewRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<ProductOverviewData>): RecyclerView.Adapter<ProductOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(com.example.getrest.R.layout.rv_home_item_product_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text = dataList[position].title
        holder.period.text = dataList[position].period
        holder.tag.text = dataList[position].tag

        holder.button.setOnClickListener {
            changeView()
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var title = itemView.findViewById(com.example.getrest.R.id.txt_rv_home_item_product_overview_title) as TextView
        var period = itemView.findViewById(com.example.getrest.R.id.txt_rv_home_item_product_overview_period) as TextView
        var tag = itemView.findViewById(com.example.getrest.R.id.txt_rv_home_item_product_overview_tag) as TextView
        var button = itemView.findViewById(com.example.getrest.R.id.img_rv_home_item_product_overview) as ImageView
    }

    private fun changeView() {

    }
}