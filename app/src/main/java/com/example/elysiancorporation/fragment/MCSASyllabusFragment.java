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

public class MCSASyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_mcsasyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("MODULE1: IMPLEMENTING ADVANCED SERVICES");
        listDataHeader.add("MODULE2: ADVANCED GROUP POLICY MANAGEMENT");
        listDataHeader.add("MODULE3: IMPLEMENTING ADVANCED FILE SERVICES");
        listDataHeader.add("MODULE4: CONFIGURING AND TROUBLESHOOTING REMOTE ACCESS");
        listDataHeader.add("MODULE5: WEB SERVER MANAGEMENT WITH IIS");
        listDataHeader.add("MODULE6: IMPLEMENTING ACTIVE DIRECTORY DOMAIN SERVICES SITES");
        listDataHeader.add("MODULE7: ACTIVE DIRECTORY MAINTENANCE");
        listDataHeader.add("MODULE8: BACKUP AND RESTORE OPERATIONS");
        listDataHeader.add("MODULE9: IMPLEMENTING DISASTER");

        List<String> a=new ArrayList<>();
        a.add(" Configuring DHCP Failover\n" +
                "Configuring DHCP Backup and Restore\n" +
                "Configuring DHCPv6");
        List<String> b=new ArrayList<>();
        b.add("Software Deployment GPOs\n" +
                "Backup and Restore GPOs\n" +
                "Configuring Import and Copy GPOs\n" +
                "Configuring Folder Redirection\n" +
                "Printer Preferences");

        List<String> c=new ArrayList<>();
        c.add("Configuring iSCSI Storage\n" +
                "Optimizing Storage Usage");

        List<String> d=new ArrayList<>();
        d.add("Configuring Network Address Translation (NAT)\n" +
                "Configuring Virtual Private Network (VPN) Access");

        List<String> e=new ArrayList<>();
        e.add("Configuring Internet Information Services\n" +
                "Hosting Multiple Web Sites\n" +
                "Integrating FTP into IIS");

        List<String> f=new ArrayList<>();
        f.add("Overview of AD DS Replication\n" +
                "Configuring AD DS Sites\n" +
                "Configuring and Monitoring AD DS Replication\n" +
                "Implementing Universal Group Membership Caching (UGMC)");

        List<String> g=new ArrayList<>();
        g.add("Active Directory Snapshot\n" +
                "Active Directory Defragmentation\n" +
                "Managing DSRM Password\n" +
                "Active Directory Metadata cleanup");

        List<String> h=new ArrayList<>();
        h.add("Implementing Windows Server Backup and Recovery\n" +
                "Active Directory Backup and Recovery");

        List<String> i=new ArrayList<>();
        i.add("Overview of Disaster Recovery\n" +
                "Overview of FSMO Roles\n" +
                "Transferring and Seizing AD FSMO Roles");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
        listDataChild.put(listDataHeader.get(3),d);
        listDataChild.put(listDataHeader.get(4),e);
        listDataChild.put(listDataHeader.get(5),f);
        listDataChild.put(listDataHeader.get(6),g);
        listDataChild.put(listDataHeader.get(7),h);
        listDataChild.put(listDataHeader.get(8),i);

    }
}
