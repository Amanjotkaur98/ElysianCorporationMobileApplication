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

public class NetSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_netsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("NETWORKING");

        List<String> a=new ArrayList<>();
        a.add(" Network Basics(CISCO)\n" +
                "Network concepts\n" +
                "Network architectures\n" +
                "The OSI model\n" +
                "Wired Computer-to-Computer Connections\n" +
                "Wired network connections\n" +
                "Network interface cards and modems\n" +
                "Wireless Networking\n" +
                "Wireless network devices\n" +
                "Wireless networking standards\n" +
                "Wireless configuration\n" +
                "Security Threats and Mitigation\n" +
                "Security threats\n" +
                "Threat mitigation\n" +
                "Security Practices\n" +
                "Operating systems\n" +
                "Devices\n" +
                "Network Access Control (NAC)\n" +
                "Authentication\n" +
                "Public key cryptography\n" +
                "Remote access\n" +
                "Wireless security\n" +
                "Monitoring\n" +
                "Monitoring resources\n" +
                "Event Viewer\n" +
                "Troubleshooting\n" +
                "Troubleshooting basics\n" +
                "Troubleshooting the network\n" +
                "Troubleshooting scenarios\n" +
                "Certification Exam Objectives Map\n" +
                "Comprehensive exam objectives\n" +
                "CompTIA Network+ Acronyms\n" +
                "Acronym list");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
