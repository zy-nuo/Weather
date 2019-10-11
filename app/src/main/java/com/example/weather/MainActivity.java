package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weather.db.City;
import com.example.weather.db.County;

import org.litepal.crud.DataSupport;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
