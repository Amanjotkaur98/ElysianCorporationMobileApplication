package com.example.elysiancorporation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.elysiancorporation.R;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EthicalHackingFragment extends Fragment {

Button syllabuseh;
EhSyllabusFragment fragment=new EhSyllabusFragment();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_ehacking, container, false);
        syllabuseh=(Button)v.findViewById(R.id.syllabuseh);
        syllabuseh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return v;
    }


}
