package com.example.getrest.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.getrest.Adapter.ProductOverviewRecyclerViewAdapter
import com.example.getrest.Data.ProductOverviewData

import com.example.getrest.R
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.support.v4.act

class HomeFragment : Fragment() {

    lateinit var productOverviewRecyclerViewAdapter: ProductOverviewRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList: ArrayList<ProductOverviewData> = ArrayList()
        dataList.add(ProductOverviewData(
            "솝트", "2019.03 ~ 2019.07", "#동아리"))
        dataList.add(ProductOverviewData(
            "KB DNA", "2019.03 ~ 2019.07", "#대외활동"))
        dataList.add(ProductOverviewData(
            "전주국제영화제", "2019.03 ~ 2019.07,", "#동아리"))
        dataList.add(ProductOverviewData(
            "솝트", "2019.03 ~ 2019.07", "#동아리"))
        dataList.add(ProductOverviewData(
            "KB DNA", "2019.03 ~ 2019.07", "#대외활동"))
        dataList.add(ProductOverviewData(
            "전주국제영화제", "2019.03 ~ 2019.07,", "#동아리"))


        productOverviewRecyclerViewAdapter = ProductOverviewRecyclerViewAdapter(context!!, dataList)
        rv_home_product_overview.adapter = productOverviewRecyclerViewAdapter
        rv_home_product_overview.layoutManager = LinearLayoutManager(context!!)

        setupBarChartData()
    }

    private fun setupBarChartData() {
        val bargroup = ArrayList<BarEntry>()
        bargroup.add(BarEntry(1f, 1f, "1"))
        bargroup.add(BarEntry(2f, 2f, "2"))
        bargroup.add(BarEntry(3f, 3f, "3"))
        bargroup.add(BarEntry(4f, 4f, "4"))
        bargroup.add(BarEntry(5f, 1f, "5"))
        bargroup.add(BarEntry(6f, 2f, "6"))
        bargroup.add(BarEntry(7f, 3f, "7"))
        bargroup.add(BarEntry(8f, 4f, "8"))
        bargroup.add(BarEntry(9f, 1f, "9"))
        bargroup.add(BarEntry(10f, 2f, "10"))
        bargroup.add(BarEntry(11f, 3f, "11"))
        bargroup.add(BarEntry(12f, 4f, "12"))

        val xAxis = barChart.xAxis
        xAxis.setDrawLabels(false)
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.granularity = 1f

        val rightYAxis = barChart.axisRight
        rightYAxis.setDrawLabels(false)

        val leftYAxis = barChart.axisLeft
        leftYAxis.setDrawLabels(false)

        val barDataSet = BarDataSet(bargroup, "")
        val data = BarData(barDataSet)

        barDataSet.color = ContextCompat.getColor(activity!!, android.R.color.holo_green_light)
        barDataSet.valueTextColor = ContextCompat.getColor(activity!!, android.R.color.black)

        barChart.xAxis.labelCount = 11
        barChart.setData(data)
        barChart.setFitBars(true)
        barChart.description.isEnabled = false
        barChart.setPinchZoom(false)
        barChart.legend.isEnabled = false
        barChart.data.setDrawValues(false)
        barChart.invalidate()

    }


}
