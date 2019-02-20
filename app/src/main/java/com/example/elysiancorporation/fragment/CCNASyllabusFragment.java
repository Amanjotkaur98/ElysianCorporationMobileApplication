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

public class CCNASyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;


    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_ccnasyllabus, container, false);

        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("SYLLABUS OF CCNA");
        listDataHeader.add("ENHANCING ROUTING SECURITY");
        listDataHeader.add("STATIC ROUTING");
        listDataHeader.add("RIP ROUTING");
        listDataHeader.add("EIGRP ROUTING");
        listDataHeader.add("OSPF ROUTING");
        listDataHeader.add("STANDARD ACCESS CONTROL LIST");
        listDataHeader.add("INITIALIZATION CONFIGURATION OF SWITCH");
        listDataHeader.add("VLAN AND TRUNK");
        listDataHeader.add("SYLLABUS OF CCNP");
        listDataHeader.add("OSPF");
        listDataHeader.add("DEFAULT ROUTING");
        listDataHeader.add("REDISTRIBUTION");
        listDataHeader.add("BGP");
        listDataHeader.add("SWITCH");

        List<String> a=new ArrayList<>();
        a.add("> Establish console connectivity\n" +
                "> Access router via console with an emulation software\n" +
                "> CISCO IOS modes and show commands\n" +
                "> Configuring host name and IP address\n" +
                "> Configure privilege mode and enable mode");

        List<String> b=new ArrayList<>();
        b.add("> Configure warning banner on router\n" +
                "> Configure enhanced username password security");

        List<String> c=new ArrayList<>();
        c.add("> Enable IPV4 routing\n" +
                "> Verifying routing table\n" +
                "> Configure static routing\n" +
                "> Verify static routing");

        List<String> d=new ArrayList<>();
        d.add("> Configure RIP routing\n" +
                "> Verify RIP routing\n" +
                "> Verify communication between the routers");

        List<String> e=new ArrayList<>();
        e.add("> Configure EIGRP routing\n" +
                "> Verify EIGRP routing\n" +
                "> Verify communication between the routers\n" +
                "> Verify EIGRP neighbor and topology table");

        List<String> f=new ArrayList<>();
        f.add("> Configure OSPF routing for single area and multi area\n" +
                "> Verify OSPF routing\n" +
                "> Verify communication between the routers\n" +
                "> Verify OSPF neighbor and topology table\n" +
                "> Understand OSPF’s DR and BDR\n" +
                "> Verifying neighbor relationship table");

        List<String> g=new ArrayList<>();
        g.add("> Configure and implement ACL\n" +
                "> Verify blocked communication between computers in ACL");

        List<String> h=new ArrayList<>();
        h.add("> Establish console connectivity\n" +
                "> Access switch via console with an emulation software\n" +
                "> CISCO IOS modes and show commands\n" +
                "> Configure privilege mode and enable mode");

        List<String> i=new ArrayList<>();
        i.add("> Configure VTP\n" +
                "> Verify VTP for server, client and transparent\n" +
                "> Router on a Stick\n" +
                "> Verify communication between computers connected to different VLAN\n" +
                "> Multilayer switching\n" +
                "> Spanning tree protocol(STP)\n" +
                "> Verify STP\n" +
                "> PVST\n" +
                "> Etherchannel\n" +
                "> Configure Etherchannel\n" +
                "> Verify Etherchannel\n" +
                "> Port security\n" +
                "> Configure port security\n" +
                "> Verify port security violation\n" +
                "> Static NAT & Dynamic NAT\n" +
                "> Configure static NAT & Dynamic NAT\n" +
                "> Verify static NAT & Dynamic NAT\n" +
                "> Port address translation (PAT)\n" +
                "> Configure PAT\n" +
                "> Verify PAT\n" +
                "> Generic routing Encapsulation(GRE)\n" +
                "> Configure GRE tunnel interface\n" +
                "> Verify GRE tunnel configuration\n" +
                "> Hot standby router protocol (HSRP)\n" +
                "> Configure HSRP\n" +
                "> Verify HSRP\n" +
                "> Frame-relay\n" +
                "> Configure ,verify and troubleshoot frame-relay configuration\n" +
                "> DLCI in frame-relay\n" +
                "> IPV6 address\n" +
                "> Configure IPV6 address on router interface\n" +
                "> CISCO discovery protocol(CDP)\n" +
                "> Enabling CDP\n" +
                "> Verify CDP\n" +
                "> DHCP server\n" +
                "> Configure DHCP server\n" +
                "> Password recovery and Backup\n" +
                "> Enter ROM monitor mode and change configuration\n" +
                "> IOS licensing\n" +
                "> Verifying CISCO IOS license\n" +
                "> PPP authentication\n" +
                "> Configure PPP authentication (CHAP)\n" +
                "> Wireless networks\n" +
                "> Standards associated with wireless media\n" +
                "> Compare and contrast wireless security features\n" +
                "> WPA, WPA-1/2\n" +
                "> Mac Filtering");

        List<String> j=new ArrayList<>();
        j.add("> Configuring EIGRP\n" +
                "> EIGRP summarization\n" +
                "> EIGRP authentication\n" +
                "> Load balancing in EIGRP\n" +
                "> EIGRP filtering");

        List<String> k=new ArrayList<>();
        k.add("> Configuring OSPF\n" +
                "> OSPF DR & BDR election\n" +
                "> OSPF md5 authentication\n" +
                "> Multi area OSPF\n" +
                "> OSPF summarization\n" +
                "> OSPF filtering");

        List<String> l=new ArrayList<>();
        l.add("> Default routing in RIP\n" +
                "> Default routing in EIGRP\n" +
                "> Default routing in OSPF");

        List<String> m=new ArrayList<>();
        m.add("> Redistribution between RIP & OSPF\n" +
                "> Redistribution between EIGRP & OSPF\n" +
                "> Redistribution between RIP &EIGRP\n" +
                "> Advanced redistribution\n" +
                "> Distribution list\n" +
                "> Passive interface");

        List<String> n=new ArrayList<>();
        n.add("> BGP configuration internal and external\n" +
                "> BGP split horizon\n" +
                "> IPV6:\n" +
                "       Introduction to IPV6 addressing\n" +
                "> VPN:\n" +
                "       Virtual private network configuration");

        List<String> o=new ArrayList<>();
        o.add("> Layer 2 & layer 3 switch\n" +
                "> Table used in switching\n" +
                "> Switch port configuration\n" +
                "> VLAN and VTP configuration\n" +
                "> Router as a stick\n" +
                "> Spanning tree\n" +
                "> PVST\n" +
                "> Advance STP(RSTP& MST)\n" +
                "> Multi layer switching\n" +
                "> Ether channel\n" +
                "> PAGP(port aggregation)\n" +
                "> LACP(link aggregation)\n" +
                "> HSRP(hot standby routing protocol)\n" +
                "> VRRP(virtual router redundancy protocol)\n" +
                "> GLBP(gateway load balancing protocol)\n" +
                "> VLAN access list\n" +
                "> Port security\n" +
                "> Private VLAN\n" +
                "> Protective ports");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
        listDataChild.put(listDataHeader.get(3),d);
        listDataChild.put(listDataHeader.get(4),e);
        listDataChild.put(listDataHeader.get(5),f);
        listDataChild.put(listDataHeader.get(6),g);
        listDataChild.put(listDataHeader.get(7),h);
        listDataChild.put(listDataHeader.get(8),i);
        listDataChild.put(listDataHeader.get(9),j);
        listDataChild.put(listDataHeader.get(10),k);
        listDataChild.put(listDataHeader.get(11),l);
        listDataChild.put(listDataHeader.get(12),m);
        listDataChild.put(listDataHeader.get(13),n);
        listDataChild.put(listDataHeader.get(14),o);

    }


}
