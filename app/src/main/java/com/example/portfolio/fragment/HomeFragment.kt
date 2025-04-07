package com.example.portfolio.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.portfolio.R

class HomeFragment : Fragment() {

    private lateinit var githubButton: Button
    private lateinit var linkedInButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        githubButton = view.findViewById(R.id.btnGitHub)
        linkedInButton = view.findViewById(R.id.btnLinkedIn)

        githubButton.setOnClickListener {

        }

        githubButton.setOnClickListener {
            openUrl("https://github.com/aryangupta02092002")
        }
        linkedInButton.setOnClickListener {
            openUrl("https://www.linkedin.com/in/aryan-gupta-1bb108192/")
        }

        return view
    }

    private fun openUrl(url: String){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}