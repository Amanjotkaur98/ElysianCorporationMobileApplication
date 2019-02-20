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


public class CloudComputingSyllabusFragment extends Fragment {
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

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("Part 1: Overview of Cloud Computing");
        listDataHeader.add("Part 2: Dynamic Interaction And Computing Architectures");
        listDataHeader.add("Quiz Part 3: Economics of Cloud Computing");

        List<String> a = new ArrayList<>();
        a.add("> Advantages, History, and Characteristics of Cloud Computing");
        a.add("> Service & Deployment Models, Infrastructure, and Consumer View");
        a.add("> Security and Scenarios");
        a.add("> Assumptions, Terms of Service, & Promises");
        a.add("> Limitations, Obligations, Recommendations, & Implications");
        List<String> c = new ArrayList<>();
        c.add("> Overview Review of Service Models");
        c.add("> SWOT Analysis and Value Proposition");
        c.add("> General Cloud Computing Risks");
        c.add("> Risks 2: Performance, Network Dependence, Reliability, Outages, and Safety Critical Processing");
        c.add("> Risks 3: Compliance and Information Security");
        c.add("> Value and Risk of Open Source Software");
        c.add("> Cloud Computing Cost Analysis");
        c.add("> Selecting an IaaS Provider");
        c.add("> Cloud Standards and Intercloud Interoperability");
        c.add("> Recommendations for Successful Cloud Migration");
        List<String> b =new ArrayList<>();
        b.add("> Overview · Service, Deployment, Scope, and Control");
        b.add("> SaaS Interaction Dynamics and Software Stack Control");
        b.add("> SaaS Benefits, Issues and Concerns, Suitability, and Recommendations");
        b.add("> PaaS Dynamics and Software Stack Control");
        b.add("> PaaS Benefits, Issues and Concerns, Suitability, and Recommendations");
        b.add("> IaaS Abstract Interaction Dynamics and Software Stack Control");
        b.add("> IaaS Operational View");
        b.add("> IaaS Benefits");
        b.add("> IaaS Issues and Concerns, and Recommendations");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
    }
}
