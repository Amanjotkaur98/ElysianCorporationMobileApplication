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
public class CodeIgniterSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public CodeIgniterSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_codeignitersyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("HTML");
        listDataHeader.add("CSS");
        listDataHeader.add("JAVASCRIPT");
        listDataHeader.add("PHP");

        List<String> a = new ArrayList<>();
        a.add(" Introduction\n" +
                "Elements\n" +
                "Tags\n" +
                "Attributes\n" +
                "Paragraph\n" +
                "Headings\n" +
                "Line Breaks\n" +
                "Horizontal Rule\n" +
                "Lists\n" +
                "Formatting\n" +
                "Color Codes\n" +
                "Font\n" +
                "Text Links\n" +
                "Email\n" +
                "Images\n" +
                "Image Link\n" +
                "Forms\n" +
                "Table\n" +
                "Frames\n" +
                "Comments\n" +
                "Music Codes\n" +
                "Video Codes\n" +
                "Div");
        List<String> b = new ArrayList<>();
        b.add("Introduction\n" +
                "Types Of CSS(Internal, Inline, External)\n" +
                "Selectors(Tags)\n" +
                "Use of Class and Id with the Selectors\n" +
                "CSS Background & Color\n" +
                "CSS Text\n" +
                "CSS Font\n" +
                "CSS Border\n" +
                "CSS Padding");

        List<String> c = new ArrayList<>();
        c.add("Introduction\n" +
                "Formatting and Coding Conventions\n" +
                "Javascript Files\n" +
                "Comments\n" +
                "Embedding Javascript in HTML\n" +
                "Using Script Tag\n" +
                "NoScript Tag\n" +
                "Operators\n" +
                "Control Structures(If else, switch, loops)\n" +
                "Array and For Each Loop\n" +
                "Defining and Invoking Functions\n" +
                "Built in Objects\n" +
                "Date Objects\n" +
                "Interacting With The Browser\n" +
                "Dialog Boxes\n" +
                "Event Handling\n" +
                "Cookies\n" +
                "Client Side Validations");

        List<String> d = new ArrayList<>();
        d.add("What is PHP?\n" +
                "What is PHP File?\n" +
                "What is Mysql?\n" +
                "PHP+MySQL\n" +
                "Basic PHP Syntax\n" +
                "Comments in PHP\n" +
                "Variables\n" +
                "PHP operators\n" +
                "Control Structures(If else,switch, all loops)\n" +
                "Arrays\n" +
                "For Each Loop\n" +
                "Functions\n" +
                "Form Handling\n" +
                "PHP $_GET\n" +
                "PHP $_POST\n" +
                "PHP $_REQUEST\n" +
                "PHP date() Function\n" +
                "PHP include File\n" +
                "File Handling\n" +
                "File Uploading\n" +
                "PHP Sessions\n" +
                "Sending Emails\n" +
                "PHP Cookies\n" +
                "Introduction To MySQL\n" +
                "PHP MySQL Connect To a Database\n" +
                "Closing A Connection\n" +
                "MySQL DataTypes\n" +
                "MySQL Insert\n" +
                "MySQL Select\n" +
                "MySQL where clause\n" +
                "MySQL Delete\n" +
                "MySQL Update\n" +
                "MySQL Aggregate Functions(sum,avg,count etc)\n" +
                "MySQL order by and group by clause\n" +
                "MySQL Subqueries\n" +
                "MySQL Joins\n" +
                "PROJECT");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
    }
}
