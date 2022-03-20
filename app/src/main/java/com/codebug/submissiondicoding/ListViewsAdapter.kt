package com.codebug.submissiondicoding

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListViewsAdapter(private val listViews: ArrayList<Views>) :
    RecyclerView.Adapter<ListViewsAdapter.ListViewHolder>() {
    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvSlug : TextView = itemView.findViewById(R.id.tv_item_slug)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewsAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_views,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewsAdapter.ListViewHolder, position: Int) {
        val views = listViews[position]
        val viewItems = holder.itemView
        Glide.with(holder.itemView.context)
            .load(views.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = views.name
        holder.tvSlug.text = views.detail

        viewItems.setOnClickListener{
            val intent = Intent(viewItems.context,DetailViewsActivity::class.java)
            intent.putExtra(DetailViewsActivity.KEY_STORE,views)
            viewItems.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listViews.size
    }
}