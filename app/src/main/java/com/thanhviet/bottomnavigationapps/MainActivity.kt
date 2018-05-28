package com.thanhviet.bottomnavigationapps

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.thanhviet.bottomnavigationapps.adapter.ViewPagerAdapter
import com.thanhviet.bottomnavigationapps.fragments.DashboardFragment
import com.thanhviet.bottomnavigationapps.fragments.HomeFragment
import com.thanhviet.bottomnavigationapps.fragments.NotificationdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
    when (item.itemId) {
      R.id.navigation_home -> {
        viewpager.setCurrentItem(0)
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_dashboard -> {
        viewpager.setCurrentItem(1)
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_notifications -> {
        viewpager.setCurrentItem(2)
        return@OnNavigationItemSelectedListener true
      }
    }
    false
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    setupViewPager(viewpager)
    var itemMenu: MenuItem = navigation.menu.getItem(0)
    viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
      override fun onPageScrollStateChanged(state: Int) {
      }

      override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
      }

      override fun onPageSelected(position: Int) {
        if (itemMenu != null) {
          itemMenu.setChecked(false)
        }
        navigation.menu.getItem(position).setChecked(true)
        itemMenu = navigation.menu.getItem(position)
      }
    })
  }

  fun setupViewPager(viewpager: ViewPager) {
    var viewpagerAdapter = ViewPagerAdapter(supportFragmentManager)
    viewpagerAdapter.addFragment(HomeFragment.newInstance())
    viewpagerAdapter.addFragment(DashboardFragment.newInstance())
    viewpagerAdapter.addFragment(NotificationdFragment.newInstance())
    viewpager.apply {
      adapter = viewpagerAdapter
    }
  }
}
