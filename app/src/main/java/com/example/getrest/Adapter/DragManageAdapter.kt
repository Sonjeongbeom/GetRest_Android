package com.example.getrest.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

class DragManageAdapter(adapter: TabOverviewRecyclerViewAdapter, context: Context, dragDirs: Int, swipeDirs: Int): ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs)
{
    var dragAdapter = adapter

    override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean
    {
        dragAdapter.swapItems(viewHolder.adapterPosition, target.adapterPosition)
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {}

    override fun getSwipeDirs(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int {
        return super.getSwipeDirs(recyclerView, viewHolder)
    }
}