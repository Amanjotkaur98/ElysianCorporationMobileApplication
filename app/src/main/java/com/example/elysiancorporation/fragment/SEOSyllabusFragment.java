package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class SEOSyllabusFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public SEOSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_seosyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);
        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("BASICS FOR SEO");

        List<String> a=new ArrayList<>();
        a.add(" Basics for SEOWhat is Domain\n" +
                "\n"+
                "Basic Knowledge of World Wide Web\n" +
                "Difference between Portal and Search Engines\n" +
                "What is SEO\n" +
                "Types of SEO Techniques\n" +
                "Black hat techniques\n" +
                "White Hat techniques\n" +
                "How Search Engine works\n" +
                "SEO Research & AnalysisMarket Research\n" +
                "\n"+
                "Keyword Research and Analysis\n" +
                "Keyword opportunity\n" +
                "Competitors Website Analysis\n" +
                "SWOT Analysis of Website\n" +
                "How to Choose Best Keywords\n" +
                "Tools available for Keyword Research\n" +
                "Website Design SEO Guidelines\n" +
                "\n" +
                "Content Research\n" +
                "Content Guidelines\n" +
                "Content Optimization\n" +
                "Design & Layout\n" +
                "XML Sitemap / URL List Sitemap\n" +
                "\n" +
                "On-page Optimization\n" +
                "\n" +
                "The Page Title\n" +
                "Meta Descriptions & Meta Keywords\n" +
                "Headings\n" +
                "Bold Text\n" +
                "Domain Names & Suggestions\n" +
                "Canonical Tag\n" +
                "Meta Tags\n" +
                "Images and Alt Text\n" +
                "Internal Link Building\n" +
                "The Sitemap\n" +
                "Invisible Text\n" +
                "Server and Hosting Check\n" +
                "Robots Meta Tag\n" +
                "Doorway Pages\n" +
                "301 Redirects\n" +
                "404 Error\n" +
                "Duplicate content\n" +
                "\n" +
                "Off-page Optimization\n" +
                "\n" +
                "Page Rank\n" +
                "Link Popularity\n" +
                "Link Building in Detail\n" +
                "Directory Submission\n" +
                "Social Bookmark Submission\n" +
                "Blog Submission\n" +
                "Articles\n" +
                "Links Exchange\n" +
                "Reciprocal Linking\n" +
                "Posting to Forums\n" +
                "Submission to Search Engine\n" +
                "RSS Feeds Submissions\n" +
                "Press Release Submissions\n" +
                "Forum Link Building\n" +
                "Competitor Link Analysis\n" +
                "\n" +
                "Analytics\n" +
                "\n" +
                "Google Analytics\n" +
                "Installing Google Analytics\n" +
                "How to Study Google Analytics\n" +
                "Interpreting Bars & Figures\n" +
                "How Google Analytics can Help SEO\n" +
                "Advanced Reporting\n" +
                "Webmaster Central & Bing/Yahoo\n" +
                "Open Site Explorer\n" +
                "Website Analysis using various SEO Tools available\n" +
                "\n" +
                "SEO Tools\n" +
                "\n" +
                "Keyword Density Analyzer Tools\n" +
                "Google Tools\n" +
                "Yahoo / Bing Tools\n" +
                "Rich Snippet Text Tools\n" +
                "Comparison Tools\n" +
                "Link Popularity Tools\n" +
                "Search Engines Tools\n" +
                "Site Tools\n" +
                "Miscellaneous Tools");

        listDataChild.put(listDataHeader.get(0),a);

    }
}
