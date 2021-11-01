package com.example.tracker_parcel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void profilebtn(View view) {
        Toast.makeText(this, "Profile Button Click", Toast.LENGTH_SHORT).show();
    }
}