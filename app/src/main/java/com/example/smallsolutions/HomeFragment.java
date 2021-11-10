package com.example.smallsolutions;

import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;


public class HomeFragment extends Fragment implements OnClickListener{

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView hamburger = myView.findViewById(R.id.burger);
        hamburger.setOnClickListener(this);

        toolbar = myView.findViewById(R.id.toolbar);
        mDrawer = myView.findViewById(R.id.drawer_layout);


        return myView;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.burger){
//            Toast.makeText(getActivity(),"hello", Toast.LENGTH_SHORT).show();
             mDrawer.openDrawer(GravityCompat.START);
        }
    }


}