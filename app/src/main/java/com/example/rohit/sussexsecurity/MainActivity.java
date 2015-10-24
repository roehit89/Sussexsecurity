package com.example.rohit.sussexsecurity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
       final EditText editText = (EditText) findViewById(R.id.editText);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        //EditText editText = (EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = String.valueOf(editText.getText());
                Toast.makeText(MainActivity.this,input , Toast.LENGTH_SHORT).show(); /// works
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);


                if(!input.equals("")) {
                    intent.putExtra("key", input);
                    //Toast.makeText(MainActivity.this,"if madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                    else {
                    intent.putExtra("key", "Fire");
                    //Toast.makeText(MainActivity.this,"else madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                    startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = String.valueOf(editText.getText());
                //Toast.makeText(MainActivity.this,input , Toast.LENGTH_SHORT).show(); /// works
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);

                if(!input.equals("")) {
                    intent.putExtra("key", input);
                    //Toast.makeText(MainActivity.this,"if madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                else {
                    intent.putExtra("key", "Water");
                    //Toast.makeText(MainActivity.this,"else madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = String.valueOf(editText.getText());
                //Toast.makeText(MainActivity.this,input , Toast.LENGTH_SHORT).show(); /// works
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);

                if(!input.equals("")) {
                    intent.putExtra("key", input);
                    //Toast.makeText(MainActivity.this,"if madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                else {
                    intent.putExtra("key", "Crime");
                    //Toast.makeText(MainActivity.this,"else madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = String.valueOf(editText.getText());
                //Toast.makeText(MainActivity.this,input , Toast.LENGTH_SHORT).show(); /// works
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);

                if(!input.equals("")) {
                    intent.putExtra("key", input);
                   // Toast.makeText(MainActivity.this,"if madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                else {
                    intent.putExtra("key", "Extra");
                  //  Toast.makeText(MainActivity.this,"else madhe" , Toast.LENGTH_SHORT).show(); /// works
                }
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
