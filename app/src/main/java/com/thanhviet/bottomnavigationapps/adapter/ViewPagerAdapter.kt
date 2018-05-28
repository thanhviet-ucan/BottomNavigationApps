package com.thanhviet.bottomnavigationapps.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by FRAMGIA\bui.dinh.viet on 28/05/2018.
 */
class ViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
  var mFragmentList: MutableList<Fragment> = arrayListOf()

  override fun getItem(position: Int): Fragment {
    return mFragmentList.get(position)
  }

  override fun getCount(): Int {
    return mFragmentList.size
  }

  fun addFragment(fragment: Fragment) {
    mFragmentList.add(fragment)
  }

}