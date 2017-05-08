package com.example.thedawn.notedemo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private SimpleAdapter simple_adapter;
    private List<Map<String, Object>> dataList;
    private Button addNote;
    private TextView tv_content;
    private NoteDateBaseHelper DbHelper;
    private SQLiteDatabase DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    protected void onStart() {
        super.onStart();
        RefreshNotesList();
    }

    private void RefreshNotesList() {
    }

    private void initView() {





        tv_content = (TextView) findViewById(R.id.tv_content);
        listview = (ListView) findViewById(R.id.listview);
        dataList = new ArrayList<Map<String, Object>>();
        addNote = (Button) findViewById(R.id.btn_addnote);
        DbHelper = new NoteDateBaseHelper();
    }
}
