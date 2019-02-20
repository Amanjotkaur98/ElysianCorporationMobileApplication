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
public class CSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public CSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_csyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("C++ OVERVIEW");
        listDataHeader.add("FUNCTIONS AND VARIABLES");
        listDataHeader.add("CLASSES IN C++");
        listDataHeader.add("OPERATOR OVERLOADING");
        listDataHeader.add("EXCEPTIONS/TEMPLATES/POLYMORPHISM");
        listDataHeader.add("INITIALIZATION AND ASSIGNMENT");
        listDataHeader.add("STORAGE AND INHERITANCE");

        List<String> a = new ArrayList<>();
        a.add("C++ Characteristics\n" +
                "Object-Oriented Terminology\n" +
                "Polymorphism\n" +
                "Object-Oriented Paradigm\n" +
                "Abstract Data Types\n" +
                "I/O Services\n" +
                "Standard Template Library\n" +
                "Standards Compliance");
        List<String> b = new ArrayList<>();
        b.add("Functions: Declaration and Definition\n" +
                "Variables: Definition, Declaration, and Scope\n" +
                "Variables: Dynamic Creation and Derived Data\n" +
                "Arrays and Strings in C++\n" +
                "Qualifiers");

        List<String> c = new ArrayList<>();
        c.add("Defining Classes in C++\n" +
                "Classes and Encapsulation\n" +
                "Member Functions\n" +
                "Instantiating and Using Classes\n" +
                "Using Constructors\n" +
                "Multiple Constructors and Initialization Lists\n" +
                "Using Destructors to Destroy Instances\n" +
                "Friendship");

        List<String> d = new ArrayList<>();
        d.add("Operator Overloading\n" +
                "Working with Overloaded Operator Methods");

        List<String> e = new ArrayList<>();
        e.add("Polymorphism\n" +
                "Overview of Polymorphism\n" +
                "Input and Output in C++ Programs\n" +
                "Standard Streams\n" +
                "Manipulators\n" +
                "Unformatted Input and Output\n" +
                "File Input and Output\n" +
                "Exceptions\n" +
                "\n" +
                "Inheritance and Exceptions\n" +
                "Exception Hierarchies\n" +
                "Inside an Exception Handler\n" +
                "Templates\n" +
                "\n" +
                "Template Overview\n" +
                "Customizing a Templated Method\n" +
                "Standard Template Library Containers");

        List<String> f = new ArrayList<>();
        f.add("Initialization vs. Assignment\n" +
                "The Copy Constructor\n" +
                "Assigning Values\n" +
                "Specialized Constructors and Methods\n" +
                "Constant and Static Class Members");

        List<String> g = new ArrayList<>();
        g.add("Storage Management\n" +
                "Memory Allocation\n" +
                "Dynamic Allocation: new and delete\n" +
                "Inheritance\n" +
                "Overview of Inheritance\n" +
                "Defining Base and Derived Classes\n" +
                "Constructor and Destructor Calls");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
        listDataChild.put(listDataHeader.get(4), e);
        listDataChild.put(listDataHeader.get(5), f);
        listDataChild.put(listDataHeader.get(6), g);
    }

}
