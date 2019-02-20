package com.example.elysiancorporation.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.elysiancorporation.R;
import com.example.elysiancorporation.activity.MainActivity;

public class ServicesFragment extends Fragment {
    Button webbutton,webdevelopment,mobiledevelopment,seo,digitalmarketing,trainingbutton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_services,container,false);
        webbutton = (Button)view.findViewById(R.id.webbutton);
        webdevelopment = (Button)view.findViewById(R.id.webdevelopment);
        mobiledevelopment = (Button)view.findViewById(R.id.mobiledevelopment);
        digitalmarketing = (Button)view.findViewById(R.id.digitalmarketing);
        trainingbutton = (Button)view.findViewById(R.id.trainingbutton);
        seo = (Button)view.findViewById(R.id.seo);
        webbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              getFragment(new WebDesigning());
            }
        });
        webdevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new WebDevelopment());
            }
        });
        mobiledevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new MobileDevelopment());
            }
        });
        seo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new SEO());
            }
        });
        digitalmarketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new DigitalMarketing());
            }
        });
        trainingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new TrainingFragment());
            }
        });
        return view;
    }
    public void getFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.addToBackStack(null);
        ft.commit();

    }
}
