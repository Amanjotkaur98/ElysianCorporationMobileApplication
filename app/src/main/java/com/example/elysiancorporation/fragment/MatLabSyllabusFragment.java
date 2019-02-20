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
public class MatLabSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;


    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    public MatLabSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_matlabsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("VARIABLES,SCRIPTS AND OPERATIONS");

        List<String> a=new ArrayList<>();
        a.add("Variables, Scripts and Operation\n" +
                "\n" +
                "Basic of matrix and functions\n" +
                "Scripts\n" +
                "Making Variables\n" +
                "Manipulating variables\n" +
                "Visualization and Programming\n" +
                "\n" +
                "Functions\n" +
                "Flow Control\n" +
                "Line Plots\n" +
                "Image/ Surface Plot\n" +
                "Vectorization\n" +
                "Solving Equations and Curve Fitting\n" +
                "\n" +
                "Linear Algebra\n" +
                "Polynomials\n" +
                "Optimization\n" +
                "Differentiation/ Integration\n" +
                "Differential Equation\n" +
                "ELECTRONIC AND COMMUNICATION ENGINEERING\n" +
                "\n" +
                "MODULATION\n" +
                "\n" +
                "Modulating a Random Signal\n" +
                "Analog and Digital Modulation\n" +
                "Plotting Signal Constellation\n" +
                "SIGNAL SOURCES\n" +
                "\n" +
                "White Gaussian Noise\n" +
                "Random Symbols\n" +
                "Random Integers\n" +
                "Channels\n" +
                "Equalizers-Adaptive Equalizer\n" +
                "– M2SE Equalizer\n" +
                "\n" +
                "CONTROL SYSTEM DESIGN AND ANALYSIS\n" +
                "\n" +
                "Control system Designer\n" +
                "Control System Tunes\n" +
                "Fuzzy Logic designer\n" +
                "System Identification\n" +
                "INSTRUMENTATION ENGINEERING\n" +
                "\n" +
                "SIGNAL PROCESSING AND COMMUNICATION\n" +
                "\n" +
                "Antenna Designer\n" +
                "Bit Error rate Analysis\n" +
                "Filter Designer\n" +
                "Radar Equation Calculators\n" +
                "Radar Waveform Analyzes\n" +
                "Sensor Array Analyzer\n" +
                "Wavelet Analyzers\n" +
                "Instrument Control\n" +
                "Control System Designer\n" +
                "Control System Tuner\n" +
                "COMPUTER SCIENCE ENGINEER\n" +
                "\n" +
                "IMAGE PROCESSING TOOLBOX\n" +
                "\n" +
                "Image Read and Show\n" +
                "Convert Images format\n" +
                "Image compression\n" +
                "Image segmentation\n" +
                "Image decomposition\n" +
                "Image edge detection\n" +
                "Image filtering\n" +
                "SPEECH PROCESSING\n" +
                "\n" +
                "Record and plot speech signal in matlab\n" +
                "Speech Recognition\n" +
                "Speech Segmentation\n" +
                "COMBINE SYLLABUS\n" +
                "\n" +
                "Optimization Toolbox\n" +
                "Neural Net Clustering\n" +
                "Neural Net fitting\n" +
                "Neural Net pattern Recognition\n" +
                "Neuro Fuzzy Designer\n" +
                "Fuzzy logic Toolbar\n" +
                "Genetic Algorithm Toolbar\n" +
                "Artificial Intelligence");

        listDataChild.put(listDataHeader.get(0),a);

    }
}
