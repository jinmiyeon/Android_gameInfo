package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randompage extends AppCompatActivity {

    List<String> game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randompage);
        Intent intent = getIntent();

        ImageButton testResultbtn = findViewById(R.id.testResultbtn);
        TextView recommandResult = findViewById(R.id.recommandResult);

        game = new ArrayList<>();

        game.add("RPG");
        game.add("Shooting");
        game.add("Fighting");
        game.add("Advanture");
        game.add("Shooting");
        game.add("Action");
        game.add("Sprots");
        game.add("Rhythm");
        game.add("Horror");

        testResultbtn.setOnClickListener((View v)-> {
            Random r = new Random();
            String randomgame = game.get(r.nextInt(game.size()));
            recommandResult.setText(randomgame);
        });

    }
}