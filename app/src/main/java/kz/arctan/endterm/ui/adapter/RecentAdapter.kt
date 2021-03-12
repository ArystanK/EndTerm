package kz.arctan.endterm.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.arctan.endterm.R
import kz.arctan.endterm.data.model.Recent

class RecentAdapter(private val context: Context, private val recentDataList: List<Recent>) :
    RecyclerView.Adapter<RecentAdapter.RecentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recent_row_item, parent, false)
        return RecentViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {
        holder.placeImage.setImageResource(recentDataList[position].imageUrl)
        holder.placeName.text = recentDataList[position].placeName
        holder.countryName.text = recentDataList[position].countryName
        holder.price.text = "From $${recentDataList[position].price}"
    }

    override fun getItemCount(): Int {
        return recentDataList.size
    }

    class RecentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val placeImage: ImageView = itemView.findViewById(R.id.place_image_view)
        val placeName: TextView = itemView.findViewById(R.id.place_name_text_view)
        val countryName: TextView = itemView.findViewById(R.id.country_name_text_view)
        val price: TextView = itemView.findViewById(R.id.price_text_view)
    }
}