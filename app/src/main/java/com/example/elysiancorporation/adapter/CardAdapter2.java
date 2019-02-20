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

public class CardAdapter2 extends RecyclerView.Adapter<CardAdapter2.MyViewHolder2> {
    Context c;
    ArrayList<CardModel> al;

    public CardAdapter2(Context c, ArrayList<CardModel> al) {
        this.c = c;
        this.al = al;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(c).inflate(R.layout.carditems,viewGroup,false);
        return new CardAdapter2.MyViewHolder2(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 myViewHolder2, int i) {
        myViewHolder2.imageView.setImageResource(al.get(i).getImage());
        myViewHolder2.textView.setText(al.get(i).getText1());
        myViewHolder2.textView1.setText(al.get(i).getText2());
        if(i==0)
        {
            myViewHolder2.cv.setCardBackgroundColor(Color.parseColor("#00b4b8"));
        }
        else
        {
            myViewHolder2.cv.setCardBackgroundColor(Color.parseColor("#39497f"));
        }
    }

    @Override
    public int getItemCount() {
        return al.size();

    }

    public  class MyViewHolder2 extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textView1;
        CardView cv;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageview);
            textView=(TextView) itemView.findViewById(R.id.textview);
            textView1=(TextView) itemView.findViewById(R.id.textview1);
            cv=(CardView)itemView.findViewById(R.id.cv);
        }
    }
}
