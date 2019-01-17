package com.example.user.foodfix_12.ui.page.map

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.user.foodfix_12.databinding.ItemAddressBinding
import com.example.user.foodfix_12.list.SingleTypeAdapter

/**
 * Created by bagrusss on 17.01.2019
 */
class AddressesAdapter: SingleTypeAdapter<String, AddressHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): AddressHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemAddressBinding.inflate(inflater, parent, false)
        return AddressHolder(binding)
    }

}