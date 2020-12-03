package com.quintus.labs.smarthome.courses;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.quintus.labs.smarthome.R;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
