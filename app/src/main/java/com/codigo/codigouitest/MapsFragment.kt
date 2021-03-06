package com.codigo.codigouitest

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return MapsFragment()
        }
    }

    private val callback = OnMapReadyCallback { googleMap ->

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        setUpMarkers(googleMap)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }


    private fun setUpMarkers(googleMap: GoogleMap) {
        val markerView =
            LayoutInflater.from(requireContext()).inflate(R.layout.view_map_marker, null, false)
        val sydney = LatLng(-34.0, 151.0)
        val sydney1 = LatLng(-38.0, 154.0)
        val sydney2 = LatLng(-44.2, 158.1)
        googleMap.addMarker(
            MarkerOptions().position(sydney)
                .icon(BitmapDescriptorFactory.fromBitmap(BitMapUtil.drawView(markerView)))
        )
        googleMap.addMarker(
            MarkerOptions().position(sydney1)
                .icon(BitmapDescriptorFactory.fromBitmap(BitMapUtil.drawView(markerView)))
        )
        googleMap.addMarker(
            MarkerOptions().position(sydney2)
                .icon(BitmapDescriptorFactory.fromBitmap(BitMapUtil.drawView(markerView)))
        )
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        googleMap.setMinZoomPreference(4f)
    }
}