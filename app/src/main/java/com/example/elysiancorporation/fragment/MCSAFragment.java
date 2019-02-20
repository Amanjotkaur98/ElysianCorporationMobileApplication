package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.elysiancorporation.R;

public class MCSAFragment extends Fragment {
Button syllabus,syllabusmcse;
MCSASyllabusFragment fragment=new MCSASyllabusFragment();
MCSESyllabusFragment fragment1=new MCSESyllabusFragment();
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View v=inflater.inflate(R.layout.fragment_mcsa, container, false);
      syllabus =(Button)v.findViewById(R.id.syllabus);
      syllabusmcse =(Button)v.findViewById(R.id.syllabusmcse);
      syllabus.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              FragmentManager fm=getFragmentManager();
              FragmentTransaction ft=fm.beginTransaction();
              ft.replace(R.id.frame, fragment);
              ft.addToBackStack(null);
              ft.commit();
          }
      });
      syllabusmcse.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              FragmentManager fm=getFragmentManager();
              FragmentTransaction ft=fm.beginTransaction();
              ft.replace(R.id.frame, fragment1);
              ft.addToBackStack(null);
              ft.commit();
          }
      });
        return v;
    }
}
