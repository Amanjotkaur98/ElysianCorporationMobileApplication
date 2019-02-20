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
public class LaravelSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public LaravelSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_laravelsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("LARAVEL TOPICS");

        List<String> a=new ArrayList<>();
        a.add(" Introduction to PHP Framework\n" +
                "Introduction to Laravel\n" +
                "Laravel Installation\n" +
                "Routing in Laravel\n" +
                "MVC in Laravel\n" +
                "Caching in Laravel\n" +
                "Event subscribers in Laravel\n" +
                "Package Development\n" +
                "Templates\n" +
                "Creating an Application\n" +
                "Testing in Laravel\n" +
                "Database Configuration\n" +
                "Helpers in Laravel\n" +
                "Laravel Pagination\n" +
                "Laravel Security\n" +
                "Authentication Facade\n" +
                "Validation in Laravel\n" +
                "Eloquent ORM\n" +
                "Artisan Command Line Interface\n" +
                "Deploy Application using Laravel");

        listDataChild.put(listDataHeader.get(0),a);

    }

}
