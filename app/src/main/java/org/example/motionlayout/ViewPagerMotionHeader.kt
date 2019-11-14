package org.example.myapplication

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager

class ViewPagerMotionHeader @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attr, defStyleAttr), ViewPager.OnPageChangeListener {

    private var pagesCount = 2

    fun setPagesCount(count: Int) {
        pagesCount = count
    }

    override fun onPageScrollStateChanged(state: Int) = Unit

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        progress = (position + positionOffset) / (pagesCount - 1)
    }

    override fun onPageSelected(position: Int) = Unit
}