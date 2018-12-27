package com.example.muhammad.customlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muhammad.customlistview.R;
import com.example.muhammad.customlistview.model.RowData;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    Context applicationContext;
    List<RowData> list;
    public MyAdapter(Context applicationContext, List<RowData> list) {
        this.applicationContext=applicationContext;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder

    {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        TextView textView2;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder viewHolder = null;
        if(convertView==null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_row,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView  = convertView.findViewById(R.id.list_images);
            viewHolder.textView  = convertView.findViewById(R.id.title);
            viewHolder.textView1=convertView.findViewById(R.id.description);
            viewHolder.textView2=convertView.findViewById(R.id.rate);

            RowData rowData = list.get(position);
            viewHolder.imageView.setImageResource(rowData.getImages());
            viewHolder.textView.setText(rowData.getTitle());
            viewHolder.textView1.setText(rowData.getDescription());
            viewHolder.textView2.setText(rowData.getVersion());

            convertView.setTag(viewHolder);

        }



        return convertView;



    }
}
