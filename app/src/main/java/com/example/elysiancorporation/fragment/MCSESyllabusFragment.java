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

public class MCSESyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mcsesyllabus, container, false);
      expListView=(ExpandableListView) v.findViewById(R.id.explistview);
      prepareListData();
      listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
      expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("MODULE1: DESIGNING AND IMPLEMENTING IP ADDRESS MANAGEMENT");
        listDataHeader.add("MODULE2: IMPLEMENTING ADDITIONAL DOMAINS AND FORESTS");
        listDataHeader.add("MODULE3: DESIGNING AND IMPLEMENTING AN ADDS FOREST AND DOMAIN STRUCTURE");
        listDataHeader.add("MODULE4: IMPLEMENTING SERVER VIRTUALIZATION WITH HYPER-V");
        listDataHeader.add("MODULE5: IMPLEMENTING ACTIVE DIRECTORY CERTIFICATE SERVICES");
        listDataHeader.add("MODULE6: PLANNING AND IMPLEMENTING A HIGH AVAILABILITY INFRASTRUCTURE USING FAIL OVER CLUSTERING");

        List<String> a=new ArrayList<>();
        a.add(" Overview of IP Address Management (IPAM)\n" +
                "Planning and Implementing an IPAM");
        List<String> b=new ArrayList<>();
        b.add("Creating Child Domains\n" +
                "Creating Domain Trees");

        List<String> c=new ArrayList<>();
        c.add("Designing an AD DS Forest\n" +
                "Designing AD DS Domain Trusts\n" +
                "Designing and Implementing AD DS Forest Trusts\n" +
                "Designing and Implementing AD DS Domains");

        List<String> d=new ArrayList<>();
        d.add("Overview of Virtualization Technologies\n" +
                "Implementing Hyper-V\n" +
                "Managing Virtual Machine Storage\n" +
                "Managing Virtual Networks\n" +
                "System Center Configuration Manager 2012");

        List<String> e=new ArrayList<>();
        e.add("PKI Overview\n" +
                "Deploying CAs");

        List<String> f=new ArrayList<>();
        f.add("Planning an Infrastructure for Failover Clustering\n" +
                "Implementing Failover Clustering");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
        listDataChild.put(listDataHeader.get(3),d);
        listDataChild.put(listDataHeader.get(4),e);
        listDataChild.put(listDataHeader.get(5),f);
    }
}
