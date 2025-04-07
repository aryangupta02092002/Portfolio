package com.example.portfolio.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.data.Experience
import com.example.portfolio.data.Project

class ExperienceAdapter(private val experiences: List<Experience>) : RecyclerView.Adapter<ExperienceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExperienceAdapter.ViewHolder, position: Int) {
        val experience = experiences[position]
        holder.bind(experience)
    }

    override fun getItemCount(): Int {
        return experiences.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val thumbnailImageView: ImageView = itemView.findViewById(R.id.ivThumbnail)
        private val experienceTextView: TextView = itemView.findViewById(R.id.tvProjectTitle)
        private val descTextView: TextView = itemView.findViewById(R.id.tvProjectDesc)
        private val viewExperienceButton: Button = itemView.findViewById(R.id.btnViewProject)

        fun bind(experience: Experience){
            thumbnailImageView.setImageResource(experience.thumbnailResId)
            experienceTextView.text = experience.companyName
            descTextView.text = experience.jobPosition

            // set on click, for redirecting to project link
            viewExperienceButton.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(experience.companyLink))
                it.context.startActivity(intent)
            }
        }
    }
}