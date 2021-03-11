package kz.arctan.endterm.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kz.arctan.endterm.R
import java.lang.Exception

private val TAB_TITLES = arrayOf(
    R.string.tab_top_places,
    R.string.tab_top_hotels,
    R.string.tab_recent_place
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        val fragment = when (position) {
            0 -> FragmentTopPlaces()
            1 -> FragmentTopHotels()
            2 -> FragmentRecentPlace()
            else -> null
        }
        if (fragment != null)
            return fragment
        else throw Exception()
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}