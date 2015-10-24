package com.example.rohit.sussexsecurity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Rohit on 10/15/2015.
 */
public class FeedActivity extends AppCompatActivity {


    CustomAdapter customAdapter;
    ArrayAdapter arrayAdapter;
    ListView list;
    String TAG = "FeedActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String buttonPressed = intent.getStringExtra("key"); // intent set

        Log.i(TAG+" button kuthla dabla te ", buttonPressed);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedactivity);
        list = (ListView) findViewById(R.id.listView); // xml converted to View.  <listView> </listView>

        ArrayList <ListModel> listModel_arrayList = new ArrayList<>();

        ListModel listModel_Object = new ListModel();  // object of basic data model created
        ListModel listModel_Object1 = new ListModel(); // object 2 of basic data model created.

        listModel_Object.setPost_message("company1"); // object.text set.
        listModel_Object1.setPost_message("chala 2ra ala"); // object1.text set.

        listModel_arrayList.add(listModel_Object); // object added to list
        listModel_arrayList.add(listModel_Object1); // object 2 added to list

      for(ListModel member : listModel_arrayList)
      {
          Log.i(TAG+" array members", member.getPost_message());
      }
        customAdapter = new CustomAdapter(FeedActivity.this, R.layout.eachlistelement, listModel_arrayList, buttonPressed); // custom adapter constructor called...



        list.setAdapter(customAdapter); // set adapter to view.

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) list.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_SHORT)
                        .show();
            }

        });


    }



}
