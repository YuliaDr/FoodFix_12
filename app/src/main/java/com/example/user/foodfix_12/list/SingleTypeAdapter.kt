package com.example.user.foodfix_12.list

import android.support.v7.widget.RecyclerView

/**
 * Created by bagrusss on 17.01.2019
 */
abstract class SingleTypeAdapter<D, VH : DataViewHolder<*, D>> : RecyclerView.Adapter<VH>() {

    private val data = mutableListOf<D>()

    override fun onBindViewHolder(viewHolder: VH, position: Int) = viewHolder.onData(data[position])

    override fun getItemCount() = data.size

    /**
     * user for change items in the list
     */
    fun swapData(newData: List<D>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

}