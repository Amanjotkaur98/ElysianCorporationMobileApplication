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

public class FinanceSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expandableListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_finance_syllabus, container, false);
        expandableListView = (ExpandableListView) view.findViewById(R.id.explistview);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
        return view;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("Finance Topics");
        List<String> a = new ArrayList<>();
        a.add("\n" +
                "\n" +
                "    Quantitative Analysis of Financial Decisions\n" +
                "    Security Analysis\n" +
                "    Investment Management\n" +
                "    Portfolio Management\n" +
                "    International Financial Management\n" +
                "    Management of Financial Services\n" +
                "    Management Control System\n" +
                "    Corporate Taxation\n" +
                "    Financial Derivatives\n" +
                "    Project Planning, Analysis & Management\n" +
                "    Risk Management\n" +
                "    Fixed Income Securities\n" +
                "    Corporate Governance\n" +
                "    Financial Reporting\n" +
                "\n");
        listDataChild.put(listDataHeader.get(0), a);
    }
}
