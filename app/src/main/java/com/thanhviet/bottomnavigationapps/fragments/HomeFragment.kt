package com.thanhviet.bottomnavigationapps.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thanhviet.bottomnavigationapps.R
import com.thanhviet.bottomnavigationapps.fragments.adapter.ImageAdapter
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by FRAMGIA\bui.dinh.viet on 28/05/2018.
 */
class HomeFragment : Fragment() {
  companion object {

    fun newInstance(): HomeFragment {
      return HomeFragment()
    }
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return inflater?.inflate(R.layout.fragment_home, container, false)
  }

  override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    recyler.apply {
      layoutManager = GridLayoutManager(context, 2)
      adapter = ImageAdapter(getListImage)
    }
  }

  private val getListImage = mutableListOf<Int>(
      R.mipmap.tree,
      R.mipmap.beautiful_mountain,
      R.mipmap.butterfly_beautiful,
      R.mipmap.inland_storms,
      R.mipmap.lake,
      R.mipmap.lie
  )
}