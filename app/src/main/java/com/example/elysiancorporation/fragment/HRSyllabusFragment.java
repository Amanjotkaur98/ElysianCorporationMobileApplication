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

public class HRSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public HRSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_hrsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("HR TOPICS");

        List<String> a=new ArrayList<>();
        a.add(" Competitive Strategy\n" +
                "Corporate Finance\n" +
                "Competitive Strategy\n" +
                "Corporate Finance\n" +
                "Decision Models and Uncertainty\n" +
                "Ethics and Responsibility\n" +
                "Financial Accounting\n" +
                "Foundations of Teamwork and Leadership\n" +
                "Fundamentals of Managerial Accounting\n" +
                "Global Strategic Management\n" +
                "Introduction to Financial Management\n" +
                "Macroeconomics and the Global Economic Environment\n" +
                "Management Communication\n" +
                "Management of People at Work\n" +
                "Managerial Economics\n" +
                "Managerial Statistics\n" +
                "Marketing Management: Program Design\n" +
                "Marketing Management: Strategy\n" +
                "Operations Management: Quality and Productivity\n" +
                "Operations Management: Supply Chain Management\n" +
                "Organizational Change\n" +
                "Power and Influence\n" +
                "Statistical Analysis for Management\n" +
                "The Governmental and Legal Environment of Business");

        listDataChild.put(listDataHeader.get(0),a);

    }
}
