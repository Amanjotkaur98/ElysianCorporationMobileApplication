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
public class DotNetSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;


    public DotNetSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_dotnetsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("INTRODUCTION");

        List<String> a=new ArrayList<>();
        a.add(" Introduction of different Web Technology\n" +
                "What is Asp.Net\n" +
                "How Asp.Net Works\n" +
                "Use of visual studio\n" +
                "Different Languages used in Asp.Net.\n" +
                "Framework \n" +
                "\n" +
                "Common Language Runtime (CLR)\n" +
                ".NET Framework Class Library\n" +
                "Setting up and Installing ASP.NET\n" +
                "\n" +
                "Installing Internet Information Server\n" +
                "Installation of Asp.Net\n" +
                "virtual directory\n" +
                "Application Setting in IIS.\n" +
                "Microsoft SQL Server 2008\n" +
                "\n" +
                "Overview of SQL Server 2008\n" +
                "Installation of SQL Server 2008\n" +
                "Features of SQL Server Express\n" +
                "SQL Server 2008 Express management tools\n" +
                "Coding Standards\n" +
                "\n" +
                "Overview of coding standards follows during programming\n" +
                "HTML, CSS & JavaScript\n" +
                "\n" +
                "Basic of HTML, CSS and JavaScript\n" +
                "Asp.Net Standard Controls \n" +
                "\n" +
                "Displaying information\n" +
                "Label Controls\n" +
                "Literal Controls\n" +
                "Bulleted List\n" +
                "Accepting User Input\n" +
                "Textbox controls\n" +
                "RadioButton and RadioButtonList Controls\n" +
                "CheckBox and CheckBoxList Controls\n" +
                "Button controls\n" +
                "LinkButton Control\n" +
                "ImageButton Control\n" +
                "Using Hyperlink Control\n" +
                "DropDownList\n" +
                "ListBox\n" +
                "Displaying Images\n" +
                "Image Control\n" +
                "Image Map Control\n" +
                "Using Panel Control\n" +
                "Using Hyperlink Control\n" +
                "Asp.Net Validation Controls + Javascript Validation \n" +
                "\n" +
                "Required Field Validator Control\n" +
                "Regular Expression Validator Control\n" +
                "Compare Field Validator Control\n" +
                "Range Validator Control\n" +
                "Validation Summary Control\n" +
                "Custom Validator Control\n" +
                "Designing Websites with master pages \n" +
                "\n" +
                "Creating master pages\n" +
                "Creating default contents\n" +
                "Nesting master pages\n" +
                "Registering master pages in web configuration\n" +
                "Using the Rich Controls \n" +
                "\n" +
                "Accepting File Uploads\n" +
                "Saving files to file system\n" +
                "Calendar Control\n" +
                "Displaying advertisements\n" +
                "Different Page view\n" +
                "Displaying a Tabbed Page View\n" +
                "Wizard Control\n" +
                "SQL Server Basic \n" +
                "\n" +
                "Database Architecture\n" +
                "Data Manipulation Language (DML)\n" +
                "Data Definition Language (DDL)\n" +
                "Manipulation of Data (SQL Command)\n" +
                "Stored Procedure\n" +
                "Function\n" +
                "Trigger\n" +
                "Views\n" +
                "Cursor\n" +
                "Overview of Data Access \n" +
                "\n" +
                "Creating database connections\n" +
                "Connecting to MSSQL Server and MS Access\n" +
                "DataSet & DataTable Features\n" +
                "Using inline SQL Statements\n" +
                "Using Stored Procedures\n" +
                "Executing select commands\n" +
                "Sql Transaction\n" +
                "C# \n" +
                "\n" +
                "Data Type and syntax Language Fundamentals\n" +
                "Classes\n" +
                "Namespaces\n" +
                "Object Oriented Programming concepts\n" +
                "Overview of Asp.Net inbuilt Classes and method\n" +
                "File Handling\n" +
                "Using the Grid View Control \n" +
                "\n" +
                "Grid View Control fundamentals\n" +
                "Displaying Data\n" +
                "Using Data Keys\n" +
                "Sorting Data\n" +
                "Paging through Data\n" +
                "Using the Details View and Form View Controls \n" +
                "\n" +
                "Using the Details View control\n" +
                "Displaying data with the DetailsView control\n" +
                "Using Fields with the DetailsView control\n" +
                "Displaying Empty data with the DetailsView control\n" +
                "Using Repeater and Data List Controls \n" +
                "\n" +
                "Using Repeater Control\n" +
                "Displaying data with the Repeater Control\n" +
                "Displaying Data with the Data List Control\n" +
                "Using Navigation Controls \n" +
                "\n" +
                "Understanding Site Maps\n" +
                "Using the Sitemap Path Control\n" +
                "Formatting the Sitemap Path Control\n" +
                "Using the Menu Control\n" +
                "Using Tree View Control\n" +
                "Working with XML and Web Services \n" +
                "\n" +
                "Overview of XML\n" +
                "Creating /Reading/Deleting XML Files\n" +
                "Web Services\n" +
                "AJAX (Asynchronous JavaScript and XML) \n" +
                "\n" +
                "About Ajax\n" +
                "Setting up and implementing Ajax\n" +
                "FTP Management \n" +
                "\n" +
                "Understanding FTP\n" +
                "Setting up FTP Server (Live)\n" +
                "Uploading and downloading FTP contents\n" +
                "Sending Emails \n" +
                "\n" +
                "Designing email panel\n" +
                "How to send an email to various users\n" +
                "Sending auto emails");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
