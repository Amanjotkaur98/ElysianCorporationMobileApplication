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

/**
 * A simple {@link Fragment} subclass.
 */
public class CakePHPSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public CakePHPSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_cake_phpsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("INTRODUCTION TO CAKE PHP");

        List<String> a=new ArrayList<>();
        a.add(" CakePHP\n" +
                "• Beginning With CakePHP\n" +
                "• What is CakePHP? Why Use it?\n" +
                "• Where to Get Help\n" +
                "• Understanding Model-View-Controller\n" +
                "• Basic Principles of CakePHP\n" +
                "• CakePHP Structure\n" +
                "• A Typical CakePHP Request\n" +
                "• CakePHP Folder Structure\n" +
                "• CakePHP Conventions\n" +
                "• Developing with CakePHP\n" +
                "• Requirements\n" +
                "• Installation Preparation\n" +
                "• Installation\n" +
                "• Configuration\n" +
                "• Routing\n" +
                "• Generating URLs\n" +
                "• Redirect Routing\n" +
                "• Controllers\n" +
                "• Components\n" +
                "• Models\n" +
                "• Behaviors\n" +
                "• Data Sources\n" +
                "• Views\n" +
                "• Helpers\n" +
                "• Scaffolding\n" +
                "• The CakePHP Console\n" +
                "• Plugins\n" +
                "• Global Constants and Functions\n" +
                "• Vendor packages\n" +
                "• Common Tasks With CakePHP\n" +
                "• Data Validation\n" +
                "• Data Sources\n" +
                "• Data Sanitization\n" +
                "• Error Handling\n" +
                "• Debugging\n" +
                "• Caching\n" +
                "• Logging\n" +
                "• Testing\n" +
                "• Internationalization & Localization\n" +
                "• Pagination\n" +
                "• REST");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
