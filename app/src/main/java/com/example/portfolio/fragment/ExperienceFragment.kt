package com.example.portfolio.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.adapter.ExperienceAdapter
import com.example.portfolio.data.Experience

class ExperienceFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExperienceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_experience, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewExperience)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = ExperienceAdapter(getDemoProjects())
        recyclerView.adapter = adapter

        return view
    }

    private fun getDemoProjects(): List<Experience>{
        return listOf(
            Experience("IBM India Pvt Ltd", "Application Developer", R.drawable.ibm_logo, "https://www.ibm.com/in-enr"),
            Experience("Weptex Technology", "Software Developer", R.drawable.weptex_logo, "https://weptex.tech/"),
            Experience("Bobble Ai", "Software Engineer Intern", R.drawable.bobble_logo, "https://www.bobble.ai/en/home")
        )
    }

}