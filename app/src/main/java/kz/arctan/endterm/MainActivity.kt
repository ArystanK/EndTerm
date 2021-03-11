package kz.arctan.endterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.arctan.endterm.model.Recent

class MainActivity : AppCompatActivity() {
    private lateinit var recentRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO get data from db to List<Recent>

        val recentList = ArrayList<Recent>()
        recentList.add(Recent(R.drawable.recent_image1, "AM Lake", "India", 200))
        recentList.add(Recent(R.drawable.recent_image2, "Nilgiri Hills", "India", 300))
        recentList.add(Recent(R.drawable.recent_image1, "AM Lake", "India", 200))
        recentList.add(Recent(R.drawable.recent_image2, "Nilgiri Hills", "India", 300))

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