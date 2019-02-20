package com.example.elysiancorporation.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.elysiancorporation.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter{
    private Activity activity;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    public ExpandableListAdapter(Activity activity, List<String> listDataHeader, HashMap<String, List<String>> listHashMap) {
        this.activity = activity;
        this.listDataHeader = listDataHeader;
        this.listHashMap = listHashMap;
    }

    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headertitle=(String)getGroup(groupPosition);
        if(convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)this.activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.header_item,null);
        }
        TextView header=(TextView)convertView.findViewById(R.id.header);
        header.setTypeface(null,Typeface.BOLD);
        header.setText(headertitle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText=(String)getChild(groupPosition,childPosition);
        if(convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)this.activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_item,null);
        }
        TextView childItem=(TextView)convertView.findViewById(R.id.childitem);
        childItem.setTypeface(null,Typeface.BOLD);
        childItem.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

