package com.andreakim.practicecode;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<Item> mArrayList = new ArrayList<>();
    private AdapterView.OnItemClickListener mListener;
    private ArrayAdapter<Item> mArrayAdapter;
    private Intent mIntentToGoToList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mListView = (ListView) findViewById(R.id.listView);
        mArrayList = new ArrayList<>();

        Item item1 = new Item("New","New2");
        Item item2 = new Item("Practice","Practice2");
        Item item3 = new Item("Stuff","Stuff2");
        Item item4 = new Item("LOL","LOL2");

        mArrayList.add(item1);
        mArrayList.add(item2);
        mArrayList.add(item3);
        mArrayList.add(item4);

        mListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Just practicing",Toast.LENGTH_LONG).show();
            }
        };

        mListView.setAdapter(mArrayAdapter);
        mListView.setOnItemClickListener(mListener);
        mArrayAdapter = new ArrayAdapter<Item>(this,R.layout.list_row,mArrayList);

        Button goToList = (Button) findViewById(R.id.btn_gotolist);
        mIntentToGoToList = new Intent(MainActivity.this,Main2Activity.class);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Log.i("MAIN", "Click btn_edit_list");
                startActivity(mIntentToGoToList);
            }
        };

        goToList.setOnClickListener(listener);
        mListView.setAdapter(mArrayAdapter);

    }
}
