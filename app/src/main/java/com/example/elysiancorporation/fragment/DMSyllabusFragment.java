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
public class DMSyllabusFragment extends Fragment {


    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public DMSyllabusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_dmsyllabus, container, false);
        expListView=(ExpandableListView) v.findViewById(R.id.explistview);
        prepareListData();
        listAdapter=new com.example.elysiancorporation.adapter.ExpandableListAdapter(this.getActivity(),listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        return v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();
        listDataHeader.add("SEO(ON-PAGE)");
        listDataHeader.add("SEO(OFF-PAGE)");
        listDataHeader.add("SEARCH ENGINE ALGORITHMS");
        listDataHeader.add("SOCIAL MEDIA MARKETING(SMM)");
        listDataHeader.add("FACEBOOK");
        listDataHeader.add("TWITTER");
        listDataHeader.add("LINKED IN");

        List<String> a = new ArrayList<>();
        a.add("Research of keywords with google planner\n" +
                "How subdomain should be selected\n" +
                "How to Name pages & folder.\n" +
                "Naming image, image title, creation.\n" +
                "What are Meta tags? What is Meta description? How to insert keywords in Meta tags?\n" +
                "Author, country & robots.\n" +
                "Redirection tags\n" +
                "What are heading tags? (h1-h6)\n" +
                "What is content writing?\n" +
                "Natural Seo based content writing\n" +
                "Anchor link & link title.\n" +
                "txt file creation & its use.\n" +
                "Sitemap creation (html).\n" +
                "Xml sitemap creation.\n" +
                "Tracking tools for site ( how to use google analytics & webmasters)\n" +
                "What is Alexa? What is Alexa rank? Why Alexa rank is useful?\n" +
                "Alexa integration");
        List<String> b = new ArrayList<>();
        b.add("What are backlinks? Why backlinks are important? How to get backlinks? What difference is between do follow & no follow backlinks?\n" +
                "What is page rank? What is google page rank? How to increase page rank?\n" +
                "Search engines submissions.\n" +
                "Directory submissions.\n" +
                "How to write article? & article submissions.\n" +
                "How to write blogs? & comment writing.\n" +
                "Classifieds postings, forum postings.\n" +
                "Business listings.\n" +
                "Social bookmarking’s & social networking.\n" +
                "Rss feeds");

        List<String> c = new ArrayList<>();
        c.add("Overview\n" +
                "Understanding search engine algorithms.\n" +
                "How do search engine algorithms work.\n" +
                "Why a search engines needs to be updated?\n" +
                "Penalties and recoveries of search engine.\n" +
                "Reasons to get your website penalized.\n" +
                "How to get your site optimized of Google’s hummingbird algorithm?\n" +
                "What is panda and penguin algorithms?\n" +
                "What is Google’s emd updates?\n" +
                "Recovery of your site from panda, penguin and emd?");

        List<String> d = new ArrayList<>();
        d.add("What is social media? use of social media in digital marketing\n" +
                "Trends about social media\n" +
                "Social media success stories\n" +
                "Tools");

        List<String> e = new ArrayList<>();
        e.add("From objectives to roi.\n" +
                "Competitive research & analysis\n" +
                "Strategy presentation by participants\n" +
                "Participants to create fb marketing strategy for their organizations\n" +
                "Types of fb ads\n" +
                "Fb ads vs google adds\n" +
                "Importance of ctr ( click through rate)\n" +
                "Targeting & optimizing copy of your ad\n" +
                "Live fb communities\n" +
                "Community building on fb\n" +
                "Fb brand page orientation\n" +
                "Edge rank algorithm, what is importance of engaging targeted audience on fb?\n" +
                "Creating brand ambassadors on fb\n" +
                "Leveraging fb insights for success\n" +
                "Fb marketing success stories");

        List<String> f = new ArrayList<>();
        f.add("Understanding twitter\n" +
                "Pr on twitter, building brand, engaging customer through leadership.\n" +
                "Leveraging lists, hash tagging & trends.\n" +
                "Influence measuring tools for twitter\n" +
                "Creating twitter marketing strategies\n" +
                "Twitter strategy framework (objectives to roi)\n" +
                "Creation of twitter marketing strategies");

        List<String> g = new ArrayList<>();
        g.add("Linked in leveraging for B2B\n" +
                "Overview of linked in\n" +
                "Lead generation through individual profiles\n" +
                "Lead generation for enterprise, company page , ads , api, groups\n" +
                "Profile makeover, answer , groups , status update recommendation\n" +
                "Discussions over Social media channel\n" +
                "Other sources (slide share , pint rest , g+)\n" +
                "Open discussion on approach to leverage them\n" +
                "Measuring roi of social media\n" +
                "Guidelines\n" +
                "Significance of qualitative feedback\n" +
                "Roi measurement framework\n" +
                "Roi metrics dashboard creation\n" +
                "Roi measuring tools\n" +
                "Planning & creation of multi-channel social media channels\n" +
                "Creating multi social media strategy\n" +
                "Resource planning\n" +
                "In-house vs outsource\n" +
                "Key competence\n" +
                "Tools");

        listDataChild.put(listDataHeader.get(0), a);
        listDataChild.put(listDataHeader.get(1), b);
        listDataChild.put(listDataHeader.get(2), c);
        listDataChild.put(listDataHeader.get(3), d);
        listDataChild.put(listDataHeader.get(4), e);
        listDataChild.put(listDataHeader.get(5), f);
        listDataChild.put(listDataHeader.get(6), g);
    }

}
