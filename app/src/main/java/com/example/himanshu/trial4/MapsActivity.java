package com.example.himanshu.trial4;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
//Google Map
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String latitude = PostSignUp.selectedCourt.getLat();
        String longitude = PostSignUp.selectedCourt.getLong();
        LatLng location = new LatLng(Double.parseDouble("15.969003649132292"),Double.parseDouble("108.26292056840309"));
        mMap.addMarker(new MarkerOptions().position(location).title("Marker at Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,18.2f));
    }
}
