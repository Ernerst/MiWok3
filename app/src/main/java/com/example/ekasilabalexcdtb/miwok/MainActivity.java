package com.example.ekasilabalexcdtb.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView) findViewById(R.id.tvNumbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Open list of numbers",Toast.LENGTH_LONG).show();
                Intent intent =  new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.tvPhrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Open list of phrases",Toast.LENGTH_LONG).show();
                Intent intent =  new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });

        TextView familyMembers = (TextView) findViewById(R.id.tvFamilyMembers);
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Open list of family members",Toast.LENGTH_LONG).show();
                Intent intent =  new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(intent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.tvColors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Open list of colors",Toast.LENGTH_LONG).show();
                Intent intent =  new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });
    }
}
