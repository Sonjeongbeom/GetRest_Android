package com.example.getrest.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchHelper
import android.widget.LinearLayout
import com.example.getrest.Adapter.DragManageAdapter
import com.example.getrest.Adapter.TabOverviewRecyclerViewAdapter
import com.example.getrest.Data.ProductOverviewData
import com.example.getrest.Data.TabOverviewData
import com.example.getrest.R
import kotlinx.android.synthetic.main.activity_edit_tab.*
import kotlinx.android.synthetic.main.toolbar_portfolio.*

class EditTabActivity : AppCompatActivity() {

    lateinit var tabOverviewRecyclerViewAdapter: TabOverviewRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_tab)

        configureTitleBar()
        configureRecylerView()

    }

    private fun configureTitleBar() {
        txt_toolbar_portfolio_title.text = "탭편집"

        btn_toolbar_portfolio_edittab.text = "완료"
        btn_toolbar_portfolio_edittab.setOnClickListener {
            finish()
        }
    }

    private fun configureRecylerView() {
        var dataList: ArrayList<TabOverviewData> = ArrayList()
        dataList.add(TabOverviewData("동아리"))
        dataList.add(TabOverviewData("인턴"))
        dataList.add(TabOverviewData("대외활동"))
        dataList.add(TabOverviewData("공모전"))
        dataList.add(TabOverviewData("봉사활동"))
        dataList.add(TabOverviewData("학생"))

        tabOverviewRecyclerViewAdapter = TabOverviewRecyclerViewAdapter(this, dataList)
//        rv_edit_tab_list_overview.adapter = tabOverviewRecyclerViewAdapter
//        rv_edit_tab_list_overview.layoutManager = LinearLayoutManager(this)

        val manager = LinearLayoutManager(this)
        rv_edit_tab_list_overview.layoutManager = manager
        val itemAdapter = tabOverviewRecyclerViewAdapter
        rv_edit_tab_list_overview.adapter = itemAdapter

        val dividerItemDecoration = DividerItemDecoration(this, manager.orientation)
        rv_edit_tab_list_overview.addItemDecoration(dividerItemDecoration)

        val callback = DragManageAdapter(itemAdapter, this, ItemTouchHelper.UP.or(ItemTouchHelper.DOWN),
            ItemTouchHelper.LEFT.or(ItemTouchHelper.RIGHT))
        val helper = ItemTouchHelper(callback)
        helper.attachToRecyclerView(rv_edit_tab_list_overview)

    }
}
