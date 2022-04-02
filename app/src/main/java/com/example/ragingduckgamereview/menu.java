package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        ImageButton genre = findViewById(R.id.genre);
        ImageButton test = findViewById(R.id.test);
        ImageButton random = findViewById(R.id.random);

        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(menu.this,genrepage.class);
                startActivity(intent1);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(menu.this,testpage.class);
                startActivity(intent2);
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(menu.this,randompage.class);
                startActivity(intent3);
            }
        });



    }
}