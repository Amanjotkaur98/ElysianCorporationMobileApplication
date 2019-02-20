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
public class WordPressSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public WordPressSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_wordpresssyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("INTRODUCTION TO WORDPRESS");
        listDataHeader.add("SETTING UP AND INSTALLING WORDPRESS");
        listDataHeader.add("HTML,CSS AND JAVASCRIPT");
        listDataHeader.add("DESIGNING");
        listDataHeader.add("THEME DEVELOPMENT");
        listDataHeader.add("WEBSITE DEVELOPMENT");
        listDataHeader.add("MY SQL");
        listDataHeader.add("AJAX(ASYNCHRONOUS JAVASCRIPT AND XML)");
        listDataHeader.add("SENDING EMAILS");
        listDataHeader.add("DEPLOYMENT");

        List<String> a = new ArrayList<>();
        a.add("Introduction\n" +
                "• Introduction of different Web Technology\n" +
                "• What is WordPress\n" +
                "• How WordPress Works\n" +
                "• Summary");
        List<String> b = new ArrayList<>();
        b.add("INSTALLING WORDPRESS\n" +
                "• Installation of server\n" +
                "• Installation of WordPress\n" +
                "• Installation of MY SQL\n" +
                "• Summary");

        List<String> c = new ArrayList<>();
        c.add("HTML, CSS and JavaScriptts\n" +
                "• Basic of HTML, CSS and JavaScript\n" +
                "• Summary");

        List<String> d = new ArrayList<>();
        d.add("Designing layouts\n" +
                "• Developing a Colour Scheme\n" +
                "• Designing Headers\n" +
                "• CSS Horizontal Menus\n" +
                "• Dynamic Menu Highlighting\n" +
                "• Good Navigation Links\n" +
                "• Next and Previous Links\n" +
                "• Styling for Print\n" +
                "• Designing Your Post Meta Data Section\n" +
                "• Separating Categories in your Post Meta Data Section\n" +
                "• Customizing the Read More\n" +
                "• Formatting Date and Time\n" +
                "• Styling Lists with CSS\n" +
                "• Designing Headings\n" +
                "• Playing With Fonts\n" +
                "• Using Images\n" +
                "• Fun Character Entities\n" +
                "• Comprehensive list of design articles\n" +
                "• Adding a Favicon");

        List<String> e = new ArrayList<>();
        e.add("Theme\n" +
                "• WordPress CSS Information and Techniques\n" +
                "• Finding Your CSS Styles\n" +
                "• Creating Individual Pages\n" +
                "• Uploading Files\n" +
                "• I Make Changes and Nothing Happens\n" +
                "• WordPress Blog Design and Layout\n" +
                "• Using WordPress Themes\n" +
                "• HTML to XHTML\n" +
                "• Custom Post Types\n" +
                "• Stepping Into Templates\n" +
                "• Stepping Into Template Tags\n" +
                "• Template Hierarchy\n" +
                "• The WordPress Loop\n" +
                "• The Loop in Action\n" +
                "• Anatomy of a Template Tag\n" +
                "• Theme Functions File Explained");

        List<String> f = new ArrayList<>();
        f.add("Website\n" +
                "• Validating a Website\n" +
                "• Know Your Sources\n" +
                "• WordPress Housekeeping\n" +
                "• WordPress Site Maintenance\n" +
                "• Finding Server Info\n" +
                "• HTML to XHTML\n" +
                "• Migrating Multiple Blogs into WordPress 3.0 Multisite\n" +
                "• Meta Tags in WordPress\n" +
                "• Search Engine Optimization for WordPress\n" +
                "• Accessibility");

        List<String> g = new ArrayList<>();
        g.add("MYSQL\n" +
                "• Introduction about Database, Data Types, DML, DDL, Aggregate functions, Data Time • functions, Stored Procedure, Sub query and join\n" +
                "• MySQL Introduction\n" +
                "• MySQL Connect\n" +
                "• MySQL Create\n" +
                "• MySQL Insert\n" +
                "• MySQL Select\n" +
                "• MySQL Where\n" +
                "• MySQL Order By\n" +
                "• MySQL Update\n" +
                "• MySQL Delete");

        List<String> h = new ArrayList<>();
        h.add("AJAX \n" +
                "• About Ajax\n" +
                "• Setting up and implementing Ajax\n" +
                "• PHP and AJAX\n" +
                "• AJAX Intro\n" +
                "• AJAX PHP\n" +
                "• AJAX Database\n" +
                "• AJAX XML\n" +
                "• AJAX Live Search\n" +
                "• AJAX RSS Reader\n" +
                "• AJAX Poll\n" +
                "• Summary");

        List<String> i = new ArrayList<>();
        i.add("EMAILS\n" +
                "• Designing email panel\n" +
                "• How to send an email to various users\n" +
                "• Sending auto emails\n" +
                "• Summary");

        List<String> j = new ArrayList<>();
        j.add("DEPLOYMENT\n" +
                "• Deploying application on Web Server\n" +
                "• Implement Word Press Site\n" +
                "• Troubleshooting the project application after implementation\n" +
                "• Summary");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
        listDataChild.put(listDataHeader.get(4), e);
        listDataChild.put(listDataHeader.get(5), f);
        listDataChild.put(listDataHeader.get(6), g);
        listDataChild.put(listDataHeader.get(7), h);
        listDataChild.put(listDataHeader.get(8), i);
        listDataChild.put(listDataHeader.get(9), j);
    }
}
