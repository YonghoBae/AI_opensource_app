package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalActivity extends AppCompatActivity {
    CheckBox checkBoxStart;
    RadioGroup radioGroupPets;
    Button buttonSelectComplete;
    ImageView imageViewPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        checkBoxStart = findViewById(R.id.checkBoxStart);
        radioGroupPets = findViewById(R.id.radioGroupPets);
        buttonSelectComplete = findViewById(R.id.buttonSelectComplete);
        imageViewPet = findViewById(R.id.imageViewPet);

        checkBoxStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int visibility = isChecked ? View.VISIBLE : View.GONE;
                radioGroupPets.setVisibility(visibility);
                buttonSelectComplete.setVisibility(visibility);
                // ImageView visibility is controlled by button click
            }
        });

        buttonSelectComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = radioGroupPets.getCheckedRadioButtonId();
                View radioButton = radioGroupPets.findViewById(radioButtonID);
                int idx = radioGroupPets.indexOfChild(radioButton);

                switch(idx) {
                    case 0:
                        imageViewPet.setImageResource(R.drawable.dog);
                        break;
                    case 1:
                        imageViewPet.setImageResource(R.drawable.cat);
                        break;
                    case 2:
                        imageViewPet.setImageResource(R.drawable.rabbit);
                        break;
                }
                imageViewPet.setVisibility(View.VISIBLE);
            }
        });
    }
}
