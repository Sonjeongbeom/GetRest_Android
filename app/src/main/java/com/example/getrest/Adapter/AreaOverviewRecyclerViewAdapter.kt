package com.example.getrest.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.getrest.Data.AreaOverviewData
import com.example.getrest.R

class AreaOverviewRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<AreaOverviewData>): RecyclerView.Adapter<AreaOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): AreaOverviewRecyclerViewAdapter.Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_signup_area_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: AreaOverviewRecyclerViewAdapter.Holder, position: Int) {
        holder.area.text = dataList[position].area
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var area = itemView.findViewById(R.id.txt_rv_signup_area_overview) as TextView
    }
}
