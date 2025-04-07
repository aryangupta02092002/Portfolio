package com.example.portfolio.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.adapter.ProjectsAdapter
import com.example.portfolio.data.Project

class ProjectFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProjectsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_project, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewProjects)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = ProjectsAdapter(getDemoProjects())
        recyclerView.adapter = adapter

        return view
    }

    private fun getDemoProjects(): List<Project>{
        return listOf(
            Project("NotesKeeper", "Notes Application", R.drawable.project_icon, "https://github.com/aryangupta02092002/NotesKeeper"),
            Project("Khabar", "News Application", R.drawable.project_icon, "https://github.com/aryangupta02092002/News-Application"),
            Project("Us", "Chatting Web Application", R.drawable.project_icon, "https://github.com/aryangupta02092002/Us-Chatting-Site")
        )
    }

}