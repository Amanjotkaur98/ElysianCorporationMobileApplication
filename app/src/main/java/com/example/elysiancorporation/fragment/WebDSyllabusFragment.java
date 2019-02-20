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
public class WebDSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public WebDSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_webdsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("WHAT IS WEB DESIGN?");

        List<String> a=new ArrayList<>();
        a.add(" WHAT IS WEB DESIGN?\n" +
                "\n" +
                "Introduction to Web Design\n" +
                "Domain Names & DNS\n" +
                "Client and Server Software.\n" +
                "Static& Dynamic\n" +
                "Careers in Web Technologies\n" +
                "DESIGNING TOOLS\n" +
                "\n" +
                "Introduction of Stock Photography\n" +
                "Types of Images and Image Editing Tools\n" +
                "Using Photoshop Tools\n" +
                "Layers, Actions and Filters\n" +
                "Creating Custom Effects\n" +
                "Design Banners, Basic Website Layout\n" +
                "Design Complex website Layout\n" +
                "Conversation of Design to XHTML\n" +
                "CASCADING STYLE SHEETS\n" +
                "\n" +
                "Introduction to CSS\n" +
                "Types of style sheets\n" +
                "Types of CSS Selectors\n" +
                "Complete CSS properties\n" +
                "Converting Table layout to CSS\n" +
                "Custom CSS Layout Design\n" +
                "Creating simple and dropdown menus\n" +
                "Creating Appealing forms using CSS\n" +
                "CSS Tips and Tricks with Hacks\n" +
                "JAVA SCRIPT\n" +
                "\n" +
                "Client and Server side scripting\n" +
                "Introduction to Java Scripting\n" +
                "Types of Java Scripts\n" +
                "Variables, operators, loops\n" +
                "Objects, Events and DOM\n" +
                "Common java script functions\n" +
                "Using Java script\n" +
                "Java Script Validations\n" +
                "Implementing Menus, Galleries etc\n" +
                "Introduction to Ajax\n" +
                "Real time Ajax Examples\n" +
                "TESTING AND IMPLEMENTATION\n" +
                "\n" +
                "Various Browser Versions\n" +
                "W3C Validating the XHTML & CSS\n" +
                "Common Compatibility Issues\n" +
                "ADOBE FLASH\n" +
                "\n" +
                "Introduction to Animation\n" +
                "Introduction to Adobe Flash\n" +
                "Tools in Adobe Flash\n" +
                "Frame Animation\n" +
                "Various Flash Effects\n" +
                "Creating Flash Banners\n" +
                "Creating Flash Intro’s\n" +
                "HTML & XHTML\n" +
                "\n" +
                "Structure of HTML\n" +
                "Basic HTML Tags\n" +
                "Advanced HTML Tags\n" +
                "Difference between HTML & XHTML\n" +
                "XHTML Basic tags\n" +
                "Introduction to Doc Types\n" +
                "HTML Tools\n" +
                "\n" +
                "Introduction to HTML Tools\n" +
                "Learning the interface\n" +
                "Defining a site\n" +
                "Adding Content and Multimedia.\n" +
                "Creating user submission forms.\n" +
                "Importing a website design\n" +
                "Dynamic Features\n" +
                "HOW TO CREATE WEBSITE\n" +
                "\n" +
                "Requirements/Specifications\n" +
                "Creating a concept and layout\n" +
                "Choosing a Color Scheme\n" +
                "Choosing Stock Photography\n" +
                "Texture and Typography\n" +
                "Design a Professional Layout\n" +
                "Conversation of Design to CSS\n" +
                "Implementing JavaScript.\n" +
                "WEB HOSTING(BY FTP)\n" +
                "\n" +
                "Web Hosting Basics\n" +
                "Types of Hosting Packages\n" +
                "Changing Name Servers\n" +
                "Linux and Windows CP\n" +
                "Using FTP Client\n" +
                "Maintaining a Website");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
