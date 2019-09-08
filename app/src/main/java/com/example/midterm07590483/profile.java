package com.example.midterm07590483;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toast t = Toast.makeText(profile.this,"Welcom",Toast.LENGTH_SHORT);
        t.show();
    }
}
