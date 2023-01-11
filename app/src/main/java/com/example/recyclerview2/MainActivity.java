package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

//We are gonna slap a bunch of models into an arrayList.
public class MainActivity extends AppCompatActivity {

    private ArrayList<PigModel> pigList = new ArrayList<>();

    private int[] pigPicture = {R.drawable.southern_pig, R.drawable.city_pig, R.drawable.resort_pig};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPig();
    }

    private void setupPig(){
        //Gotta get back our string array
        String[] pigName = getResources().getStringArray(R.array.pig_full_text);

        for(int i = 0; i< pigName.length; i++){
            //Array of pig objects must be filled in
            pigList.add(new PigModel(pigName[i], pigPicture[i]));
        }
    }
}