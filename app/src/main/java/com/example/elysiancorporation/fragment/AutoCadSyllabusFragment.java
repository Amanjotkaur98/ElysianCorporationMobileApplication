package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.elysiancorporation.R;
import com.example.elysiancorporation.adapter.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AutoCadSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expandableListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cloud_computing_syllabus, container, false);
        expandableListView = (ExpandableListView) view.findViewById(R.id.explistview);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
        return view;
    }
private void prepareListData(){
    listDataHeader = new ArrayList<>();
    listDataChild = new HashMap<>();
    listDataHeader.add("Introduction to AutoCad and working with the Windows Environment");
    listDataHeader.add("Creating your first Drawing");
    listDataHeader.add("Viewing and plotting A Drawing");
    listDataHeader.add("Basic CAD Drawing Technique");

    List<String> a = new ArrayList<>();
    a.add("> Starting AutoCAD and Understanding the Display");
    a.add("> Interacting with AutoCAD");
    a.add("> AutoCAD File Operations");

    List<String> b =new ArrayList<>();
    b.add("> Setting up a Drawing");
    b.add("> Using AutoCAD Drafting Tools");
    b.add("> Understanding Objects");

    List<String> c = new ArrayList<>();
    c.add("> Understanding the Display and Virtual Screen");
    c.add("> Using ZOOM and PAN To Control the Display");
    c.add("> Using the Aerial View Window and Creating Views");
    List<String> d = new ArrayList<>();
    d.add("> Setting the Display Format and Units");
    d.add("> Working with Prototype Drawings");
    d.add("> Coordinate System Basics");

    listDataChild.put(listDataHeader.get(0),a);
    listDataChild.put(listDataHeader.get(1),b);
    listDataChild.put(listDataHeader.get(2),c);
    listDataChild.put(listDataHeader.get(3),d);
}
}
