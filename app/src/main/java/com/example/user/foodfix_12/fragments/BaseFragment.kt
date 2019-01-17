package com.example.user.foodfix_12.fragments

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by bagrusss on 17.01.2019
 */
abstract class BaseFragment<DB : ViewDataBinding> : Fragment() {

    abstract val layout: Int

    protected lateinit var binding: DB

    final override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, layout, container, false)

        return binding.root
    }
}