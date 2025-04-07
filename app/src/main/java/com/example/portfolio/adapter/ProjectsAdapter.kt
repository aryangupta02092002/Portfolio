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
import com.example.portfolio.data.Project

class ProjectsAdapter(private val projects: List<Project>): RecyclerView.Adapter<ProjectsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectsAdapter.ViewHolder, position: Int) {
        val project = projects[position]
        holder.bind(project)
    }

    override fun getItemCount(): Int {
        return projects.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val thumbnailImageView: ImageView = itemView.findViewById(R.id.ivThumbnail)
        private val titleTextView: TextView = itemView.findViewById(R.id.tvProjectTitle)
        private val descTextView: TextView = itemView.findViewById(R.id.tvProjectDesc)
        private val viewProjectButton: Button = itemView.findViewById(R.id.btnViewProject)

        fun bind(project: Project){
            thumbnailImageView.setImageResource(project.thumbnailResId)
            titleTextView.text = project.title
            descTextView.text = project.description

            // set on click, for redirecting to project link
            viewProjectButton.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(project.projectLink))
                it.context.startActivity(intent)
            }
        }
    }

}