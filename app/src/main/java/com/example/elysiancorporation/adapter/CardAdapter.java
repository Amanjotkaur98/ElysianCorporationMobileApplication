package com.example.elysiancorporation.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elysiancorporation.R;
import com.example.elysiancorporation.model.CardModel;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder>{
    Context c;
    ArrayList<CardModel> al;


    public CardAdapter(Context c, ArrayList<CardModel> al) {
        this.c = c;
        this.al = al;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v= LayoutInflater.from(c).inflate(R.layout.carditems,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(al.get(i).getImage());
        myViewHolder.textView.setText(al.get(i).getText1());
        myViewHolder.textView1.setText(al.get(i).getText2());

        if(i==0)
        {
            myViewHolder.cv.setCardBackgroundColor(Color.parseColor("#5986b5"));
        }
        else
        {
            myViewHolder.cv.setCardBackgroundColor(Color.parseColor("#7f395e"));
        }
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView textView;
    TextView textView1;
    CardView cv;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.imageview);
        textView=(TextView) itemView.findViewById(R.id.textview);
        textView1=(TextView) itemView.findViewById(R.id.textview1);
        cv=(CardView)itemView.findViewById(R.id.cv);

    }
}}
