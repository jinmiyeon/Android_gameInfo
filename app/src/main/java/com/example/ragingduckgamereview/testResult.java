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

public class testResult extends AppCompatActivity {

    List<String> game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        Intent intent = getIntent();

        ImageButton testResultbtn = findViewById(R.id.testResultbtn);
        ImageButton restartTestbtn = findViewById(R.id.restartTestbtn);
        TextView  recommandResult = findViewById(R.id.recommandResult);

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

        restartTestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(testResult.this,testpage.class);
                startActivity(intent14);
            }
        });
    }

}