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

public class PLCScadaSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expandableListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plcscada_syllabus, container, false);
        expandableListView = (ExpandableListView) view.findViewById(R.id.explistview);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
        return view;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("Introduction to PLC");
        listDataHeader.add("SCADA");

        List<String> a = new ArrayList<>();
        a.add("> Industrial automation");
        a.add("> Basic block diagram of PLC");
        a.add("> Electrical Relay logical diagram");
        a.add("> Relay control panel");
        a.add("> Application of relay logic gates");
        a.add(">                                   ");
        a.add("KEYENCE PLC:");
        a.add("                                                ");
        a.add("< Introduction");
        a.add("< Logic Gates");
        a.add("< Power Ladder Diagram");
        a.add("< Creating Real Time Project");
        a.add("< On / Off Delay Timers");
        a.add("< UP / Down Counters");
        a.add("< Working With Industrial Projects");
        a.add("                                    ");
        a.add("ALLEN BRADELY (AB) PLC:");
        a.add("                                                ");
        a.add("< Introduction of Processors Modules");
        a.add("< Reload programs");
        a.add("< Input/output fault finding");
        a.add("< Implement changes to the program.");
        a.add("< Monitor program to determine");
        a.add("< Ethernet Communication");
        a.add("< Working With Industrial Project");
        a.add("                                    ");
        a.add("SIMENS PLC:");
        a.add("                                                ");
        a.add("< Introduction of Processors Modules");
        a.add("< Input/output modules");
        a.add("< Reload program");
        a.add("< Input/output fault finding");
        a.add("< Implement changes to the program.");
        a.add("< Introduction to communication");
        a.add("< Connect online and monitor programs to determine plant problems");
        a.add("< Working With Industrial Projects");
        a.add("                                               ");
        a.add("DRIVES:");
        a.add("                                                ");
        a.add("< Introduction of drives Modules");
        a.add("< DC motor speed control");
        a.add("< Control panel wiring");
        a.add("< Introduction to Communication");
        a.add("< Volts, Amps, Frequency Mode operation");
        a.add("                                              ");
        a.add("TYPES OF DRIVES:");
        a.add("                                                ");
        a.add("< ALLEN BRADELY (AB)");
        a.add("< ASEA BROWN BOVERI (ABB)");
        a.add("< MITSUBISHI");
        List<String> b = new ArrayList<>();
        b.add("> Introduction of scada");
        b.add("> Standard graphics objects");
        b.add("> Buttons, sliders, pipe connections, civil & mechanical parts");
        b.add("> Display and application windows");
        b.add("> Creating and editing tags");
        b.add("> Animation configuration");
        b.add("> Text and text control");
        b.add("> Wizards");
        b.add("> Graphs, bar charts");
        b.add("> Reporting achieved data can be reported to paper");
        b.add("> Working With Industrial Project");
        b.add("                                                 ");
        b.add("> TYPES OF SCADA:");
        b.add("                                                   ");
        b.add("> Intellution FIX 32");
        b.add("> Ev Designer");
        b.add("> Wonder ware intouch");
        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);

    }
}
