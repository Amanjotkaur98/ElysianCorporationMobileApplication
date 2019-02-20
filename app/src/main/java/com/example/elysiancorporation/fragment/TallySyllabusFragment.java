package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.example.elysiancorporation.R;
import com.example.elysiancorporation.adapter.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TallySyllabusFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expandableListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tally_syllabus, container, false);
        expandableListView = (ExpandableListView) view.findViewById(R.id.explistview);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
        return view;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("Introduction to Tally");
        List<String> a = new ArrayList<>();
        a.add("\n" +
                "\n" +
                "Introduction of Tally.\n" +
                "Create a Company.\n" +
                "Legder Posting.\n" +
                "Balance Sheet.\n" +
                "Stock Summary.\n" +
                "Vat Details.\n" +
                "Purchase Vouchers.\n" +
                "Sales Voucher.\n" +
                "Receipt Vouchers.\n" +
                "Payment Vouchers.\n" +
                "Debit Note.\n" +
                "Credit Note.\n" +
                "Depreciation.\n" +
                "Contra Entry.\n" +
                "Memoradom Vouchers.\n" +
                "Stock Transfer.\n" +
                "Costs Centres.\n" +
                "Vat Adjustment.\n" +
                "Tax Deductable At Sources.\n" +
                "Services Tax.\n");
        listDataChild.put(listDataHeader.get(0), a);

    }
}
