package com.example.user.foodfix_12.list

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.example.user.foodfix_12.DataReceiver

/**
 * Created by bagrusss on 17.01.2019
 */
abstract class DataViewHolder<DB : ViewDataBinding, D>(@JvmField protected val binding: DB) : RecyclerView.ViewHolder(binding.root), DataReceiver<D>