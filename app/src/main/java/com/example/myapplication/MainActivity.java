package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String ="kuwait,jahra"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weathertask().execute()

    }

    inner

    class weathertask():Asynctask<String, void, String>()

    {

        override fun onePreExecute(){
        super.onePreExecute()
        findViewById<ProgressBar>(R.id.loader).visibility =View.VISIBLE
        findViewById<RelativeLayout>(R.id.maincontainer).visibility=View.Gone
        findViewById<textview>(R.id.errortext).visibility=View.Gone

        }


    }

