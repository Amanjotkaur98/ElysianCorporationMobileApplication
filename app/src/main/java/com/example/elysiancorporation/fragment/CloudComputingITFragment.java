package com.example.elysiancorporation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.elysiancorporation.R;
public class CloudComputingITFragment extends Fragment {
Button bt1;
CloudComputingSyllabusFragment ccfragment  = new CloudComputingSyllabusFragment();
   @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_cloudcomputingit,container,false);
        bt1 = (Button)view.findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame,ccfragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
  return view;
    }
}
