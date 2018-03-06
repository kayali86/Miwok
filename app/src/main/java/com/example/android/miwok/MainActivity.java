package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the  numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Find the view that shows the  family category
        TextView family = (TextView) findViewById(R.id.family);

        //Find the view that shows the  colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        //Find the view that shows the  phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);


        //Set a clickListener on numbers button
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }

        });


        //Set a clickListener on family button
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }

        });


        //Set a clickListener on numbers button
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent ColorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(ColorsIntent);
            }

        });


        //Set a clickListener on numbers button
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhrasesIntent);
            }

        });



    }

}
