package com.example.calculatrice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_map,container,false);
        SupportMapFragment supportMapFragment=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                LatLng ensaf= new LatLng(33.99682152851567, -4.99187934233026);
                LatLng ensaag= new LatLng(30.40651161626139, -9.529529192587948);
                LatLng ensah= new LatLng(35.17355151162657, -3.8621337306891577);
                LatLng ensaj= new LatLng(33.25135830114448, -8.434154515344577);
                LatLng ensaken= new LatLng(34.24934365014928, -6.582633985175896);
                LatLng ensakh= new LatLng(32.897932404967996, -6.913463492587948);
                LatLng ensamar= new LatLng(31.6476718389635, -8.020408415344578);
                LatLng ensao= new LatLng( 34.65132099186352, -1.8963396000000001);
                LatLng ensas= new LatLng(  32.32755127631688, -9.263488838621685);
                LatLng ensatan= new LatLng(  35.73825262669174, -5.894483630689159);
                LatLng ensatet= new LatLng(  35.56325892217321, -5.364804292067473);
                googleMap.addMarker(new MarkerOptions().position(ensaf).title("Ecole Nationale des Sciences Appliquées de Fès"));
                googleMap.addMarker(new MarkerOptions().position(ensaag).title("Ecole Nationale des Sciences Appliquées d'Agadir"));
                googleMap.addMarker(new MarkerOptions().position(ensah).title("Ecole Nationale des Sciences Appliquées d'Al Hoceima"));
                googleMap.addMarker(new MarkerOptions().position(ensaj).title("Ecole Nationale des Sciences Appliquées d'El Jadida"));
                googleMap.addMarker(new MarkerOptions().position(ensaken).title("Ecole Nationale des Sciences Appliquées de Kénitra"));
                googleMap.addMarker(new MarkerOptions().position(ensakh).title("Ecole Nationale des Sciences Appliquées de Khouribga"));
                googleMap.addMarker(new MarkerOptions().position(ensamar).title("Ecole Nationale des Sciences Appliquées de Marrakesh"));
                googleMap.addMarker(new MarkerOptions().position(ensao).title("Ecole Nationale des Sciences Appliquées d'Oujda"));
                googleMap.addMarker(new MarkerOptions().position(ensas).title("Ecole Nationale des Sciences Appliquées de Safi"));
                googleMap.addMarker(new MarkerOptions().position(ensatan).title("Ecole Nationale des Sciences Appliquées de Tanger"));
                googleMap.addMarker(new MarkerOptions().position(ensatet).title("Ecole Nationale des Sciences Appliquées de Tetouan"));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ensaf,1));
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
                        MarkerOptions markerOptions=new MarkerOptions();
                        markerOptions.position(latLng);
                        markerOptions.title(latLng.latitude+":"+latLng.longitude);
                        googleMap.clear();
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });
        return view;
    }
}