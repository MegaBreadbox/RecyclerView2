package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

//We are gonna slap a bunch of models into an arrayList.
public class MainActivity extends AppCompatActivity {

    private ArrayList<PigModel> pigList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupPig(){

    }
}