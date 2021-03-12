package kz.arctan.endterm.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.arctan.endterm.R
import kz.arctan.endterm.data.model.TopPlace

class TopPlaceAdapter(private val context: Context, private val topPlaceDataList: List<TopPlace>) :
    RecyclerView.Adapter<TopPlaceAdapter.TopPlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPlaceViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.top_place_row_item, parent, false)
        return TopPlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopPlaceViewHolder, position: Int) {
        holder.placeImage.setImageResource(topPlaceDataList[position].imageUrl)
        holder.placeName.text = topPlaceDataList[position].placeName
        holder.countryName.text = topPlaceDataList[position].countryName
        holder.price.text = "From $${topPlaceDataList[position].price}"
    }

    override fun getItemCount(): Int {
        return topPlaceDataList.size
    }

    class TopPlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val placeImage: ImageView = itemView.findViewById(R.id.place_image_view)
        val placeName: TextView = itemView.findViewById(R.id.place_name_text_view)
        val countryName: TextView = itemView.findViewById(R.id.country_name_text_view)
        val price: TextView = itemView.findViewById(R.id.price_text_view)
    }
}