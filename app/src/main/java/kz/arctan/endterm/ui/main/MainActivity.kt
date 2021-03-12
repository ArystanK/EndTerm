package kz.arctan.endterm.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kz.arctan.endterm.R
import kz.arctan.endterm.adapter.RecentAdapter
import kz.arctan.endterm.data.model.Recent

class MainActivity : AppCompatActivity() {
    private lateinit var recentRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        // TODO get data from db to List<Recent>

        val recentList = ArrayList<Recent>()
        recentList.add(Recent(0, R.drawable.recent_image1, "AM Lake", "India", 200))
        recentList.add(Recent(0, R.drawable.recent_image2, "Nilgiri Hills", "India", 300))
        recentList.add(Recent(0, R.drawable.recent_image1, "AM Lake", "India", 200))
        recentList.add(Recent(0, R.drawable.recent_image2, "Nilgiri Hills", "India", 300))

        setRecentRecyclerView(recentList)
    }

    private fun setRecentRecyclerView(recentList: List<Recent>) {
        recentRecyclerView = findViewById(R.id.recent_recycler_view)
        val layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recentRecyclerView.layoutManager = layoutManager
        val recentAdapter = RecentAdapter(this, recentList)
        recentRecyclerView.adapter = recentAdapter
    }
}