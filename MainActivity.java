package com.example.muhammad.customlistview;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.muhammad.customlistview.adapter.MyAdapter;
import com.example.muhammad.customlistview.model.RowData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<RowData> list;

    String title[],description[],version[];
    TypedArray typedArray_images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        list = new ArrayList<RowData>();

        title = getResources().getStringArray(R.array.title);
        description = getResources().getStringArray(R.array.description);
        version = getResources().getStringArray(R.array.versions);
        typedArray_images = getResources().obtainTypedArray(R.array.images);

        for (int i=0;i<title.length;i++)
        {
            RowData rowData = new RowData(title[i],description[i],version[i],typedArray_images.getResourceId(i,-1));
            list.add(rowData);
        }

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),list);
        myAdapter.notifyDataSetChanged();
        listView.setAdapter(myAdapter);

    }
}



