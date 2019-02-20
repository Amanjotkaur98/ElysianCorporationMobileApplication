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

public class CardAdapter1 extends RecyclerView.Adapter<CardAdapter1.MyViewHolder1> {
    Context c;
    ArrayList<CardModel> al;

    public CardAdapter1(Context c, ArrayList<CardModel> al) {
        this.c = c;
        this.al = al;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(c).inflate(R.layout.carditems,viewGroup,false);
        return new CardAdapter1.MyViewHolder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 myViewHolder1, int i) {
        myViewHolder1.imageView.setImageResource(al.get(i).getImage());
        myViewHolder1.textView.setText(al.get(i).getText1());
        myViewHolder1.textView1.setText(al.get(i).getText2());

        if(i==0)
        {
            myViewHolder1.cv.setCardBackgroundColor(Color.parseColor("#703f29"));
        }
        else
        {
            myViewHolder1.cv.setCardBackgroundColor(Color.parseColor("#996a68"));
        }
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public  class MyViewHolder1 extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textView1;
        CardView cv;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageview);
            textView=(TextView) itemView.findViewById(R.id.textview);
            textView1=(TextView) itemView.findViewById(R.id.textview1);
            cv=(CardView)itemView.findViewById(R.id.cv);
        }
    }
}
