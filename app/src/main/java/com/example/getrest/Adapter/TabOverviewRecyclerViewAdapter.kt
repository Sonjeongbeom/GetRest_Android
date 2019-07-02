package com.example.getrest.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.getrest.Data.ProductOverviewData
import com.example.getrest.Data.TabOverviewData
import com.example.getrest.R
import org.w3c.dom.Text

class TabOverviewRecyclerViewAdapter(val ctx: Context, val dataList : ArrayList<TabOverviewData>): RecyclerView.Adapter<TabOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TabOverviewRecyclerViewAdapter.Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_edit_tab_item_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: TabOverviewRecyclerViewAdapter.Holder, position: Int) {
        holder.tab_name.text= dataList[position].tab_name
    }



    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tab_name = itemView.findViewById(R.id.txt_rv_edit_tab_item_overview_tabname) as TextView
    }

    fun swapItems(fromPosition: Int, toPosition: Int){
        if (fromPosition < toPosition) {
            for (i in fromPosition..toPosition-1) {
                dataList.set(i, dataList.set(i+1, dataList.get(i)))
            }
        }
        else {
            for (i in fromPosition..toPosition+1) {
                dataList.set(i, dataList.set(i-1, dataList.get(i)))
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }
}


