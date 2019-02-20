package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.elysiancorporation.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class EhSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;


    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_ehsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("MODULE: INTRODUCTION TO INFORMATION SECURITY");
        listDataHeader.add("MODULE: DESKTOP AND SERVER SECURITY");
        listDataHeader.add("MODULE: WINDOWS8 INTRODUCTION AND SECURITY");
        listDataHeader.add("MODULE: LINUX SECURITY");

        List<String> a=new ArrayList<>();
        a.add("> INFORMATION SECURITY");
        a.add("> ESSENTIAL TERMINOLOGIES");
        a.add("> SECURITY AND ITS NEED");
        a.add("> WHY IS IT SECURITY NECESSARY?");
        a.add("> IT SECURITY SERVICES LIFE CYCLE");
        a.add("> OPERATING SYSTEM BASICS");
        a.add("> DATA COMMUNICATION BASICS");
        a.add("> BASICS OF COMPUTER NETWORKING");
        a.add("> OSI AND TCP/IP MODEL");
        a.add("> TCP VS UDP");
        a.add("> TCP FRAME STRUCTURE");
        a.add("> UDP FRAME STRUCTURE");
        a.add("> TCP COMMUNICATION FLAGS");
        a.add("> CYBER THREATS AND ISSUES");
        a.add("> PROTECTING YOUR COMPUTER AND NETWORK");
        a.add("> SOFTWARE SECURITY FOR PORTABLE COMPUTERS");
        a.add("> PROTECTING YOUR PASSWORD AND LOGGING ON SECURELY");
        a.add("> HOW PASSWORDS GET CRACKED");
        a.add("> TOP 4 METHODS TO HACK FACEBOOK PASSWORD WITHIN 5 MIN");
        a.add("> SELECTING TOOLS");
        a.add("> INFORMATION SECURITY POLICIES AND IMPLEMENTATION");

        List<String> b=new ArrayList<>();
        b.add("> INTRODUCTION");
        b.add("> SECURING YOUR MIGRATED WINDOWS 7 DESKTOP");
        b.add("> DESKTOPS: LOCAL RIGHTS AND PRIVILEGES");
        b.add("> OVERALL DESKTOP SECURITY");
        b.add("> WHAT IS REGISTRY?");
        b.add("> REGISTRY EDITING");
        b.add("> BACKUPS AND RECOVERY");
        b.add("> POLICY");
        b.add("> STEPS TO CREATE REGISTRY VALUES");
        b.add("> SOME OF THE EXAMPLES TO CHANGE THE REGISTRY DEFAULT SETTINGS NT SECURITY");
        b.add("> THE LOGON PROCESS");
        b.add("> SECURITY ARCHITECTURE COMPONENTS");
        b.add("> INTRODUCTION TO SECURING IN NT BOX");
        b.add("> BACKUPS");
        b.add("> WINDOWS VULNERABILITIES AND THREATS");
        b.add("> DETERMINING IF YOU ARE ACTIVELY BEING COMPROMISED");
        b.add("> CLIENT –SERVER ARCHITECTURE");
        b.add("> SERVER SECURITY PRINCIPLES");
        b.add("> SECURING THE SERVER OPERATING SYSTEM");
        b.add("> APPLICATIONS AND NETWORK PROTOCOLS");
        b.add("> CONFIGURE OS USER AUTHENTICATION");

        List<String> c=new ArrayList<>();
        c.add("> SIMILARITIES BETWEEN WINDOWS7 AND WINDOWS8");
        c.add("> NEW FEATURES OF WINDOWS 8");
        c.add("> HARDWARE RECOMMENDATIONS");
        c.add("> HARDWARE INNOVATIONS");
        c.add("> WINDOWS 8 EDITIONS");
        c.add("> GETTING STARTED WITH WINDOWS 8");
        c.add("> PROTECTING THE CLIENT AGAINST THREATS");
        c.add("> BOOT OPTIONS FOR SECURITY");
        c.add("> PROTECTING SENSITIVE DATA: BITLOCKER");
        c.add("> SECURE ACCESS TO RESOURCES");

        List<String> d=new ArrayList<>();
        d.add("> INTRODUCTION");
        d.add("> BENEFITS OF LINUX");
        d.add("> HOW SECURE SHOULD MY LINUX BE?");
        d.add("> WINDOWS VS. LINUX DESIGN");
        d.add("> LAYERS OF LINUX/UNIX");
        d.add("> LINUX DIRECTORY STRUCTURE (FILE SYSTEM STRUCTURE) EXPLAINED WITH EXAMPLES");
        d.add("> SHADOW AND PASSWORD FILES");
        d.add("> HOW TO SET UP A FIREWALL UNDER LINUX?");
        d.add("> SECURING AND HARDENING TIPS LINUX SYSTEMS");
        d.add("> REALISTIC SECURITY AND SEVERITY METRICS");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
        listDataChild.put(listDataHeader.get(3),d);
    }

}
