package com.thanhviet.bottomnavigationapps.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thanhviet.bottomnavigationapps.R

/**
 * Created by FRAMGIA\bui.dinh.viet on 28/05/2018.
 */
class NotificationdFragment : Fragment() {
  companion object {

    fun newInstance(): NotificationdFragment {
      return NotificationdFragment()
    }
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return inflater?.inflate(R.layout.fragment_notification, container, false)
  }
}