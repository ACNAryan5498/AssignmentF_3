package com.example.assignmentf_3.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignmentf_3.fragments.AllFragment
import com.example.assignmentf_3.fragments.HomeFragment
import com.example.assignmentf_3.fragments.NearbyFragment
import com.example.assignmentf_3.fragments.PopularFragment

class TabLayoutAdapter(fragmentActivity : HomeFragment) : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        when {
            position == 0 -> return NearbyFragment()
            position == 1 -> return PopularFragment()
            else -> return AllFragment()
        }
    }

}