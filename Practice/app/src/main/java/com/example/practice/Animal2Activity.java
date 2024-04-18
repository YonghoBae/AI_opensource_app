package com.example.practice;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class Animal2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal2);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabDog.setContent(R.id.tabDog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabCat.setContent(R.id.tabCat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabRabbit);

        TabHost.TabSpec tabSnake = tabHost.newTabSpec("Snake").setIndicator("뱀");
        tabSnake.setContent(R.id.tabSnake);
        tabHost.addTab(tabSnake);

        tabHost.setCurrentTab(0);
    }
}