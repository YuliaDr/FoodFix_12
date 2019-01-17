package com.example.user.foodfix_12.screens.map

import com.example.user.foodfix_12.list.DataViewHolder
import com.example.user.foodfix_12.databinding.ItemAddressBinding

/**
 * Created by bagrusss on 17.01.2019
 */
class AddressHolder(binding: ItemAddressBinding): DataViewHolder<ItemAddressBinding, String>(binding) {

    override fun onData(data: String) {
        binding.addressText.text = data
    }

}