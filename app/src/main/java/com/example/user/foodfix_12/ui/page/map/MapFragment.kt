package com.example.user.foodfix_12.ui.page.map

import android.os.Bundle
import android.view.View
import com.example.user.foodfix_12.R
import com.example.user.foodfix_12.databinding.FragmentMapBinding
import com.example.user.foodfix_12.fragments.BaseFragment
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback


/**
 * Created by bagrusss on 17.01.2019
 */
class MapFragment : BaseFragment<FragmentMapBinding>(), OnMapReadyCallback, GoogleMap.OnCameraIdleListener {

    private lateinit var googleMap: GoogleMap

    private val adapter = AddressesAdapter()

    override val layout = R.layout.fragment_map

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.mapView.onCreate(null)
        binding.mapView.getMapAsync(this)

        binding.addresses.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        binding.mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    override fun onPause() {
        binding.mapView.onPause()
        super.onPause()
    }

    override fun onStop() {
        binding.mapView.onStop()
        super.onStop()
    }

    override fun onDestroyView() {
        binding.mapView.onDestroy()
        super.onDestroyView()
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        map.setOnCameraIdleListener(this)
    }

    // перемещение камеры, в т.ч. зум
    override fun onCameraIdle() {

    }

}