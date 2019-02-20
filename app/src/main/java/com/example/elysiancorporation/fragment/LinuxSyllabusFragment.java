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

public class LinuxSyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;


    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_linuxsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("RED HAT SYSTEM ADMINISTRATION 1");
        listDataHeader.add("RED HAT SYSTEM ADMINISTRATION 2");
        listDataHeader.add("RED HAT SYSTEM ADMINISTRATION 3");

        List<String> a=new ArrayList<>();
        a.add("> Unit 1: Accessing the Command Line\n" +
                "\n" +
                "Recognize the BASH shell based on the default prompt.\n" +
                "\n" +
                "Use Linux efficiently by switching between virtual consoles.\n" +
                "\n" +
                "Display usage messages and be able to interpret a command’s syntax.");
        a.add("> Unit 2: Managing Files from the Command Line\n" +
                "\n" +
                "Recognize and Find Familiarity in a File-system Tree,\n" +
                "\n" +
                "Learn Terms Like “root” Directory and Subdirectory.\n" +
                "\n" +
                "Introduction to Different types of Data in Separate System Directories");
        a.add("> Unit 3: Getting Help in Red Hat Enterprise Linux\n" +
                "\n" +
                "Learn “man” Terminology, Including Topics and Sections.\n" +
                "\n" +
                "Become Aware of The importance of less-noticed man sections.");
        a.add("Unit 4: Creating, Viewing and Editing Text Files\n" +
                "\n" +
                "Control Output to Files.\n" +
                "\n" +
                "Use Pipe to Control Output to Other Programs.");
        a.add("> Unit 5: Manage Local Linux Users and Groups\n" +
                "\n" +
                "Explain the Role of Users and Groups on a Linux System and How They are understood by the Computer.");
        a.add("> Unit 6: Controlling Access to Files with Linux File-system Permissions Explain How the Linux File Permissions Model Works.");
        a.add("> Unit 7: Monitoring and Managing Linux Processes\n" +
                "\n" +
                "Learn the Processes Lifecycle, in Order to better Comprehend Process States.");
        a.add("> Unit 8: Controlling Services and Daemons\n" +
                "\n" +
                "List System Daemons and Network Services Started by System services and Socket units.");
        a.add("> Unit 9: Configuring And Securing Open-ssh Service\n" +
                "\n" +
                "Log into a Remote System Using ssh to Run Commands From a Shell Prompt.");
        a.add("> Unit 10: Analyzing and Storing Logs\n" +
                "\n" +
                "Describe the Basic “syslog” Architecture in RHEL7");
        a.add("> Unit 11: Managing RHEL Networking\n" +
                "\n" +
                "Explain Fundamental Concepts of Computer Networking.");
        a.add("> Unit 12: Archiving and Copying Files between Systems To Create Backups and Transfer Files Over The Network.");
        a.add("> Unit 13: Installing and Updating Software Packages.");
        a.add("> Unit 14: Accessing Linux File-systems\n" +
                "\n" +
                "Determine which Directories in the File-system Hierarchy are Stored on Which Storage Devices.");
        a.add("> Unit 15: Using Virtualized Systems\n" +
                "\n" +
                "Recognize the Consistent Use of KVM Architecture Throughout of Red Hat Product Line.");

        List<String> b=new ArrayList<>();
        b.add("> Unit 1: Automating Installation with Kickstart\n" +
                "\n" +
                "Explain Kickstart Concepts and Architecture\n" +
                "\n" +
                "Install and configure Linux using Kickstart");
        b.add("> Unit 2: Using Regular Expressions with “grep”\n" +
                "\n" +
                "Create a Regular Expressions that match desired data.");
        b.add("> Unit 3: Creating and Editing Text files with vim\n" +
                "\n" +
                "Explain the three main modes of “vim”");
        b.add("> Unit 4: Scheduling Future Linux Tasks\n" +
                "\n" +
                "Scheduling tasks using at and cron");
        b.add("> Unit 5: Managing Priority of Linux Processes\n" +
                "\n" +
                "Explain about Linux Processes and nice values");
        b.add("> Unit 6: Controlling Access to Files with Access Control Lists (ACL)\n" +
                "\n" +
                "Describe ACL’s and file system mount options");
        b.add("> Unit 7:Managing SELinux Security\n" +
                "\n" +
                "Explain the Basics of Se-Linux permissions and Context Transitions.\n" +
                "\n" +
                "Display Current Se-Linux Modes.\n" +
                "\n" +
                "Correctly Interpret the Se-Linux Context of a File.\n" +
                "\n" +
                "Identify Current Se-Linux Boolean Settings.");
        b.add("> Unit 8: Connecting to Network-Defined Users and Groups\n" +
                "\n" +
                "User authentication using centralized Identity Management Services.");
        b.add("> Unit 9: Adding Disks, Partitions, and File Systems to a Linux System\n" +
                "\n" +
                "Create and Delete disk Partitions on disks with an MBR Partitioning Scheme Using “fdisk”.\n" +
                "\n" +
                "Create and Delete disk Partitions on disks with an GPT Partitioning Scheme Using “gdisk”.\n" +
                "\n" +
                "Format Devices Using “mkfs”\n" +
                "\n" +
                "Mount File System into the Directory Tree");
        b.add("> Unit 10: Managing Logical Volume Management (LVM) Storage How to manage high performance LVM storage.");
        b.add("> Unit 11: Accessing Network Attached Storage with Network File System (NFS) Access , Mount and unmount NFS Shares .");
        b.add("> Unit 12: Accessing Network Storage with SMB\n" +
                "\n" +
                "How to mount and unmount smb file-system using the command line.");
        b.add("> Unit 13: Controlling and Troubleshooting the Red Hat Enterprise Linux Boot Process Describe and Influence the RHEL Boot Process");
        b.add("> Unit 14: Limiting Network Communication with Firewalled\n" +
                "\n" +
                "Configure the Basic Firewall Using “firewalld”, “firewalld-config”and “firewalld-cmd”. Unit 15: Comprehensive Review\n" +
                "\n" +
                "Comprehensive Review of System Administration 2");

        List<String> c=new ArrayList<>();
        c.add("> Unit 1: Controlling Services and Daemons\n" +
                "\n" +
                "Control System Daemons and Services Using System ctl.");
        c.add("> Unit 2: Managing IPV6 Networking\n" +
                "\n" +
                "Configure and troubleshoot IPv6 address on Red Hat Enterprise Linux systems");
        c.add("> Unit 3: Configuring Link Aggregation and Bridging\n" +
                "\n" +
                "Configure and Troubleshoot Network Bonding and Teaming on RHEL");
        c.add("> Unit 4: Network Port Security Implement a Secure Network Using Firewall");
        c.add("> Unit 5: Managing DNS for Servers\n" +
                "\n" +
                "A Brief Study about DNS Records and how to Configure a Secure Caching DNS.");
        c.add("> Unit 6: Configuring Email Transmission\n" +
                "\n" +
                "Configure RHEL Server to Transmit all E-mail through an Unauthenticated SMTP Gateway");
        c.add("> Unit 7: Providing Remote Block Storage\n" +
                "\n" +
                "How to Access Remote Storage Space Using ISCSI.");
        c.add("> Unit 8: Providing File Based Storage\n" +
                "\n" +
                "Export File System to Client Systems Using NFS and Providing");
        c.add("> Unit 9: Configuring MariaDB Databases\n" +
                "\n" +
                "Install and Configure Mariadb Database");
        c.add("> Unit 10: Providing Apache HTTPD Web Service\n" +
                "\n" +
                "Configure a Secure Apache HTTPD Web service");
        c.add("> Unit 11: Writing Bash Scripts\n" +
                "\n" +
                "Write simple shell scripts using Bash");
        c.add("> Unit 12: Bash Conditionals and Control Structures\n" +
                "\n" +
                "Bash Conditionals and Other Control Structure");
        c.add("> Unit 13: Configuring the Shell Environment\n" +
                "\n" +
                "Use Bash Startup Scripts to Define Environment Variables, Aliases and Functions.");

        listDataChild.put(listDataHeader.get(0),a);
        listDataChild.put(listDataHeader.get(1),b);
        listDataChild.put(listDataHeader.get(2),c);
    }
}
