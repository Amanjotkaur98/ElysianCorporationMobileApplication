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
public class IOTSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public IOTSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_iotsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("BASICS OF IOT");
        listDataHeader.add("BASIC HARDWARE OF IOT");
        listDataHeader.add("CONTROLLER USE IN IOT");
        listDataHeader.add("HANDS ON SESSION USING ARDUINO AND ESP8266");
        listDataHeader.add("IOT COMMUNICATION PROTOCOLS");
        listDataHeader.add("IOT COMMUNICATION MODULE");
        listDataHeader.add("DATA STORAGE");

        List<String> a = new ArrayList<>();
        a.add("What is IOT?\n" +
                "Network Architecture.\n" +
                "Device Architecture.\n" +
                "What is Embedded?\n" +
                "Why we used Embedded system in IOT.\n" +
                "Application of IOT");
        List<String> b = new ArrayList<>();
        b.add("Basic Electronics Components of IOT\n" +
                "LED\n" +
                "Resistors\n" +
                "Capacitors\n" +
                "Transistors\n" +
                "Relay\n" +
                "Switch\n" +
                "Diode\n" +
                "Zener Diode\n" +
                "Buzzer\n" +
                "LDR\n" +
                "Potentiometer\n" +
                "Photo Diode\n" +
                "L293D\n" +
                "PIR\n" +
                "Different type of Operational Amplifier\n" +
                "DTMF IC\n" +
                "Decoder HT12D\n" +
                "Encoder HT12E\n" +
                "Crystal oscillator\n" +
                "Different Type of DC motor\n" +
                "Testing on breadboard\n" +
                "How to glow LED without program\n" +
                "LED by switch\n" +
                "LED by two switch\n" +
                "Use of capacitor in circuit\n" +
                "Testing of Relay\n" +
                "How to operate AC with help of DC\n" +
                "Testing of Transistor(PNP and NPN)\n" +
                "How to make Logic Gate with help of Transistor\n" +
                "Testing of LDR\n" +
                "555 timer\n" +
                "Lm324 IC\n" +
                "Make a project with help of LDR\n" +
                "Make a project with help of transistor and capacitor");

        List<String> c = new ArrayList<>();
        c.add("What is Arduino & ESP8266?\n" +
                "History of Arduino & ESP8266\n" +
                "Hardware and Software Description\n" +
                "Comparison between Arduino and ESP8266.\n" +
                "Programming Software");

        List<String> d = new ArrayList<>();
        d.add("Glow the LED\n" +
                "Different pattern of LED\n" +
                "Pull up and pull down condition of switch\n" +
                "LED by switch\n" +
                "LED by two switch\n" +
                "Hello print on LCD\n" +
                "Different name pattern on LCD\n" +
                "Interfacing H bridge(l293D IC)\n" +
                "DC Motor working with Arduino\n" +
                "DC Motor with one switch\n" +
                "Interfacing Two motors with four switch\n" +
                "LCD with Motor\n" +
                "Servo Motor Interfacing\n" +
                "DC motor drive with PIR Sensor\n" +
                "Make a project with help of PIR Sensor\n" +
                "Interfacing Ultrasonic Sensor\n" +
                "DC motor drive with help of Ultrasonic Sensor\n" +
                "Make a ROBO car with help of Ultrasonic Sensor\n" +
                "Interfacing LM35(Temperature Sensor)\n" +
                "Make a project with help of LM35\n" +
                "Interfacing PIR Sensor\n" +
                "Interfacing RFID\n" +
                "Make a project with help of RFID");

        List<String> e = new ArrayList<>();
        e.add("Wireless Protocols (SPI, I2C, USART, UART, Modbus)\n" +
                "Networking Protocols(OSI Reference Model, TCP/IP, Ethernet)");

        List<String> f = new ArrayList<>();
        f.add("RF Module\n" +
                "Bluetooth module\n" +
                "GSM Module\n" +
                "LAN Module\n" +
                "Wifi Module");

        List<String> g = new ArrayList<>();
        g.add("Shared Preferences\n" +
                "• SQLite Databases\n" +
                "• Creating databases and using SQLite\n" +
                "• Querying Database-Create ,Update ,Delete, Insert\n" +
                "• Using Cursors,SqliteOpenHelper");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
        listDataChild.put(listDataHeader.get(4), e);
        listDataChild.put(listDataHeader.get(5), f);
        listDataChild.put(listDataHeader.get(6), g);
    }

}
