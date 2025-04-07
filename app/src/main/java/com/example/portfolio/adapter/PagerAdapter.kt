package com.example.portfolio.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.portfolio.fragment.ExperienceFragment
import com.example.portfolio.fragment.HomeFragment
import com.example.portfolio.fragment.ProjectFragment
import com.example.portfolio.fragment.SkillFragment

class PagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    private val fragments = listOf(
        HomeFragment(),
        ExperienceFragment(),
        SkillFragment(),
        ProjectFragment()
    )

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Home"
            1 -> "Experience"
            2 -> "Skills"
            3 -> "Projects"
            else -> "Home"
        }
    }

}