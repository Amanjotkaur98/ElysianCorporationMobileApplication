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


public class PythonSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;


    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public PythonSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_pythonsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("INTRODUCTION TO PYTHON");

        List<String> a=new ArrayList<>();
        a.add(" 1 : Introduction To PythonInstallation and Working with Python Understanding Python variables Python basic OperatorsUnderstanding python blocks2 : Python Data Types\n" +
                "Declaring and using Numeric data types: int, float, complex Using string data type and string operations\n" +
                "\n" +
                "Defining list and list slicing Use of Tuple data type\n" +
                "\n" +
                "3 : Python Program Flow Control\n" +
                "\n" +
                "Conditional blocks using if, else and elif Simple for loops in python\n" +
                "\n" +
                "For loop using ranges, string, list and dictionaries Use of while loops in python\n" +
                "\n" +
                "Loop manipulation using pass, continue, break and else Programming using Python conditional and loops block\n" +
                "\n" +
                "4 : Python Functions, Modules And Packages\n" +
                "\n" +
                "Organizing python codes using functions Organizing python projects into modules Importing own module as well as external modules UnderstandingPackages\n" +
                "\n" +
                " \n" +
                "\n" +
                "5 : Python String, List And Dictionary Manipulations\n" +
                "\n" +
                "Building blocks of python programs Understanding string in build methods List manipulation using in build methods Dictionary manipulation\n" +
                "\n" +
                "Programming using string, list and dictionary in build functions\n" +
                "\n" +
                " \n" +
                "\n" +
                "6 : Python File Operation\n" +
                "\n" +
                "Reading config files in python\n" +
                "\n" +
                "Writing log files in python\n" +
                "\n" +
                "Understanding read functions, read(), readline() and readlines() Understanding write functions, write() and writelines() Manipulating file pointer using seek\n" +
                "\n" +
                "Programming using file operations\n" +
                "\n" +
                "7 : Python Object Oriented Programming – Oops\n" +
                "\n" +
                "Concept of class, object and instances Constructor, class attributes and destructors\n" +
                "\n" +
                "Inheritance , overlapping and overloading operators Adding and retrieving dynamic attributes of classes Programming using Oops support\n" +
                "\n" +
                "8 : Python Exception Handling\n" +
                "\n" +
                "Avoiding code break using exception handling\n" +
                "\n" +
                "Safe guarding file operation using exception handling Handling and helping developer with error code Programming using Exception handling\n" +
                "\n" +
                " \n" +
                "\n" +
                "10 : Python Database Interaction\n" +
                "\n" +
                "SQL Database connection using python Creating and searching tables\n" +
                "\n" +
                "Reading and storing config information on database Programming using database connections\n" +
                "\n" +
                " \n" +
                "\n" +
                "11: Contacting User Through Emails UsingPython\n" +
                "\n" +
                "Installing smtp python module Sending email\n" +
                "\n" +
                "Reading from file and sending emails to all users addressing them directly for marketing\n" +
                "\n" +
                "13 : Python CGI Introduction\n" +
                "\n" +
                "Writing python program for CGI applications Creating menus and accessing files\n" +
                "\n" +
                "Server client program\n" +
                "\n" +
                "14 : TKINTER\n" +
                "\n" +
                "15. TURTLE\n" +
                "\n" +
                "16. DJANGO");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
