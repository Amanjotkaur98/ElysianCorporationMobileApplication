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
public class STSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;


    public STSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_stsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("OVERVIEW OF THE SOFTWARE");

        List<String> a=new ArrayList<>();
        a.add(" Overview of the Software\n" +
                "\n" +
                "What is Software?\n" +
                "Software Technologies\n" +
                "What is Web Application\n" +
                "Web Application Technologies\n" +
                "Softwre Testing Life Cycle – (STLC)\n" +
                "\n" +
                "Understand Requirement\n" +
                "Create Test Cases\n" +
                "Manual Testing\n" +
                "Automation Testing\n" +
                "Test Report\n" +
                "Software requirements specification – (SRS)\n" +
                "\n" +
                "What is SRS\n" +
                "Finding gap in SRS\n" +
                "How to Write a Test Plan from SRS Document\n" +
                "How to test software requirements specification (SRS)?\n" +
                "Review SRS Document and Create Test Scenarios\n" +
                "Bug Tracking Tool\n" +
                "\n" +
                "Use of bug tracking tool\n" +
                "Bug Gennie\n" +
                "Bug Zilla\n" +
                "Jira\n" +
                "Manual Testing\n" +
                "\n" +
                "Writing test scenarios\n" +
                "Test planning\n" +
                "Test case design\n" +
                "Test data identification\n" +
                "Reviewing and Execution of Test cases/scripts\n" +
                "Automation Testing\n" +
                "\n" +
                "Selenium\n" +
                "QTP\n" +
                "Functional Testing\n" +
                "\n" +
                "Unit Testing\n" +
                "Integration Testing\n" +
                "System Testing\n" +
                "Regression Testing\n" +
                "Acceptance Testing\n" +
                "Non-Functional Testing\n" +
                "\n" +
                "Performance Testing\n" +
                "Load Testing\n" +
                "Usability Testing\n" +
                "Security Testing\n" +
                "Portability Testing\n" +
                "Live Project\n" +
                "\n" +
                "Getting customer’s requirements\n" +
                "Creating SRS\n" +
                "Creating Test Plan\n" +
                "Test Plan Execution\n" +
                "Reports");

        listDataChild.put(listDataHeader.get(0),a);

    }
}
