package kz.arctan.endterm.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.arctan.endterm.R
import kz.arctan.endterm.adapter.TopPlaceAdapter
import kz.arctan.endterm.data.model.TopPlace

class FragmentTopPlaces : Fragment() {
    private lateinit var topPlacesRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_top_places, container, false)

        val topPlaces = ArrayList<TopPlace>()
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))
        topPlaces.add(TopPlace(0, R.drawable.topplaces, "Kazimir Hill", "India", 500))

        setTopPlaceRecyclerView(topPlaces, view)

        return view
    }

    private fun setTopPlaceRecyclerView(topPlaces: List<TopPlace>, view: View) {
        topPlacesRecyclerView = view.findViewById(R.id.top_places_recycler_view)
        val layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        topPlacesRecyclerView.layoutManager = layoutManager
        val topPlaceAdapter = TopPlaceAdapter(activity!!, topPlaces)
        topPlacesRecyclerView.adapter = topPlaceAdapter
    }
}