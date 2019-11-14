package org.example.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_view_pager.*
import org.example.myapplication.ViewPagerAdapter
import org.example.myapplication.ViewPagerMotionHeader

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_view_pager)

        val motionLayout = findViewById<ViewPagerMotionHeader>(R.id.header)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        pager.adapter = adapter
        tabLayout.setupWithViewPager(pager)

        motionLayout?.let {
            motionLayout.setPagesCount(adapter.count)
            pager.addOnPageChangeListener(it as ViewPager.OnPageChangeListener)
        }
    }
}
