package com.example.elysiancorporation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elysiancorporation.R;
import com.example.elysiancorporation.adapter.CardAdapter;
import com.example.elysiancorporation.adapter.CardAdapter1;
import com.example.elysiancorporation.adapter.CardAdapter2;
import com.example.elysiancorporation.model.CardModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView,recyclerView1,recyclerView2;
    ArrayList<CardModel> arrayList=new ArrayList<>();
    ArrayList<CardModel> arrayList1=new ArrayList<>();
    ArrayList<CardModel> arrayList2=new ArrayList<>();
    CardAdapter adapter;
    CardAdapter1 adapter1;
    CardAdapter2 adapter2;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=(RecyclerView)v.findViewById(R.id.recv);
        recyclerView1=(RecyclerView)v.findViewById(R.id.recv1);
        recyclerView2=(RecyclerView)v.findViewById(R.id.recv2);
        arrayList.add(new CardModel(R.drawable.ic_web,"WEB & GRAPHIC DESIGN","We fabricate a pragmatic identity to give life to your ideas. We have vast expertise professionals, who will aid you in moulding groovy designs. Also, We deliver quality and effectual designs for our potential clients at affordable prices."));
        arrayList.add(new CardModel(R.drawable.ic_dev,"WEB DEVELOPMENT","Fresh and virtuous designs are enough to get admiration from your clients. Furthermore, we have professional’s expertise in developing websites for you from simpler to modest, our team is a proven."));
        arrayList1.add(new CardModel(R.drawable.ic_mob,"MOBILE DEVELOPMENT","No matter what device you are using, our foremost aim is to fabricate high quality quotidian mobile developments for our clients. Also, We are linked with highly diversed brands and individuals to deliver you the record-breaking."));
        arrayList1.add(new CardModel(R.drawable.ic_seo,"SEO / SMO / SEM","You can’t just open a site and anticipate that individuals will urge in, you need to create traffic if you want to be in the best rankings. We are helping our clients by providing them the uttermost challenging and cost effective SEO."));
        arrayList2.add(new CardModel(R.drawable.ic_dm,"DIGITAL MARKETING TECHNIQUES","When the going gets rugged, the ads get going. We have a ton of gimmicks simply to assist you in providing latest marketing tools to make your online life a little bit plain-sailing. Deal with us so that we can help you to skyrocket."));
        arrayList2.add(new CardModel(R.drawable.ic_tr,"INDUSTRIAL TRAINING","Execution is the close-packed part of learning, and training is the core of transformation. Also, We are the team of Elysian Corporation are the sun of our client’s dark sky. We have professionals who are expertise in proffering educational and industrial training in all domains."));

        adapter=new CardAdapter(getActivity(),arrayList);
        recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        recyclerView.setFocusable(false);


        adapter1=new CardAdapter1(getActivity(),arrayList1);
        recyclerView1.setAdapter(adapter1);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView1.setFocusable(false);
        adapter2=new CardAdapter2(getActivity(),arrayList2);
        recyclerView2.setAdapter(adapter2);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2 .setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView2.setFocusable(false);
        GetInTouchFragment frag=new GetInTouchFragment();
        FragmentManager fm=getActivity().getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fl,frag);
        ft.addToBackStack(null);
        ft.commit();
        return v;
    }

}
