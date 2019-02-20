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
public class AndroidSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public AndroidSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_androidsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("INTRODUCTION TO ANDROID");
        listDataHeader.add("ANDROID ARCHITECTURE OVERVIEW");
        listDataHeader.add("SETUP OF ANDROID DEVELOPMENT ENVIRONMENT");
        listDataHeader.add("ANDROID APPLICATIONS FUNDAMENTALS");
        listDataHeader.add("USER INTERFACE");
        listDataHeader.add("MAIN BUILDING BLOCK");
        listDataHeader.add("DATA STORAGE");
        listDataHeader.add("LOCATION SERVICES");
        listDataHeader.add("GOOGLE MAPS");
        listDataHeader.add("ANDROID MEDIA APIS");
        listDataHeader.add("TELEPHONE MANAGER");
        listDataHeader.add("WIFI");
        listDataHeader.add("SEARCHING WITH GOOGLE SEARCH MANAGER");
        listDataHeader.add("WEB SERVICES");

        List<String> a = new ArrayList<>();
        a.add("Core Java\n" +
                "• Overview of Android and Android SDK\n" +
                "• History of Android\n" +
                "• Android Features");
        List<String> b = new ArrayList<>();
        b.add("Introduction To OS Layers\n" +
                "• Linux Kernel\n" +
                "• Libraries\n" +
                "• Android Runtime\n" +
                "• Application Framework");

        List<String> c = new ArrayList<>();
        c.add("System Requirements\n" +
                "• Eclipse and SDK installation, AVD creation\n" +
                "• Creating first Android Application\n" +
                "• Project Structure\n" +
                "• Creating, compiling & Executing By Cmd");

        List<String> d = new ArrayList<>();
        d.add("Android Application Building Blocks\n" +
                "• Activating Components\n" +
                "• Shutting Down components\n" +
                "• Lifecycle of Application\n" +
                "• Development tools, Manifest File\n" +
                "• Lifecycle of Activity");

        List<String> e = new ArrayList<>();
        e.add("View Hierarchy and Layouts\n" +
                "• UI Events\n" +
                "• Building Menus\n" +
                "• Creating Dialogs");

        List<String> f = new ArrayList<>();
        f.add("Activity\n" +
                "• Intents\n" +
                "• Pending Intent\n" +
                "• Broadcast Receivers\n" +
                "• Services");

        List<String> g = new ArrayList<>();
        g.add("Shared Preferences\n" +
                "• SQLite Databases\n" +
                "• Creating databases and using SQLite\n" +
                "• Querying Database-Create ,Update ,Delete, Insert\n" +
                "• Using Cursors,SqliteOpenHelper");

        List<String> h = new ArrayList<>();
        h.add("Selecting a Best Location Provider-GPS\n" +
                "• Finding Your Location-latitude & longitude\n" +
                "• Tracking Your Position.");

        List<String> i = new ArrayList<>();
        i.add("Creating Map -Based Activities\n" +
                "• Using the Geocoder.\n" +
                "• Using Itemized Overlay.");

        List<String> j = new ArrayList<>();
        j.add("Playing Audio/Video\n" +
                "• Media Recording\n" +
                "• Controlling Camera Settings\n" +
                "• Taking a Picture");

        List<String> k = new ArrayList<>();
        k.add("Reading the phone, network, data connectivity, and SIM states\n" +
                "• Making Phone Calls\n" +
                "• Controlling the Phone");

        List<String> l = new ArrayList<>();
        l.add("Managing Your Wi-Fi\n" +
                "• Monitoring and Managing Your Internet Connectivity");

        List<String> m = new ArrayList<>();
        m.add("Search Yourself\n" +
                "• Searching for Meaning in Randomness");

        List<String> n = new ArrayList<>();
        n.add("JSON\n" +
                "• XML\n" +
                "• CSS\n" +
                "• Introduction to HTML5\n" +
                "Project work is mandatory after the completion of the training program.");

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
        listDataChild.put(listDataHeader.get(10), k);
        listDataChild.put(listDataHeader.get(11), l);
        listDataChild.put(listDataHeader.get(12), m);
        listDataChild.put(listDataHeader.get(13), n);
    }
}
