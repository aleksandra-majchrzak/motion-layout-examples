package org.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    fm: FragmentManager,
    behavior: Int = BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) : FragmentPagerAdapter(fm, behavior) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ViewPagerFragment.newInstance("page0")
            1 -> ViewPagerFragment.newInstance("page1")
            else -> ViewPagerFragment.newInstance("page2")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "tab${position}"
    }

    override fun getCount(): Int = 3
}