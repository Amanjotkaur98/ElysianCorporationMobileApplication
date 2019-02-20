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
public class HybridSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public HybridSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_hybridsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("JAVASCRIPT");
        listDataHeader.add("ANGULARJS");
        listDataHeader.add("IONIC FRAMEWORK");
        listDataHeader.add("JQUERY");

        List<String> a = new ArrayList<>();
        a.add(" Core Java\n" +
                "Introduction to Javascript\n" +
                "Chrome Debug tools\n" +
                "Datatypes\n" +
                "Control Structures\n" +
                "JavaScript in Web Browsers\n" +
                "The Window Object\n" +
                "Scripting Documents\n" +
                "Scripting CSS\n" +
                "Handling Events");

        List<String> b = new ArrayList<>();
        b.add("Overview of AngularJS\n" +
                "Data Binding\n" +
                "Services\n" +
                "Routing and Animation\n" +
                "Directives");

        List<String> c = new ArrayList<>();
        c.add("Ionic Introduction\n" +
                "Ionic CSS Components\n" +
                "Ionic Javascript Components\n" +
                "Advanced Topics");

        List<String> d = new ArrayList<>();
        d.add("DOM and JQuery Overview\n" +
                "JQuery Selectors\n" +
                "JQuery DOM Traversing\n" +
                "JQuery DOM Manipulations\n" +
                "JQuery Effects\n" +
                "JQuery Events\n" +
                "Third party Plugins\n" +
                "JQuery UI Widgets\n" +
                "JQuery UI Interactions");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
    }
}
