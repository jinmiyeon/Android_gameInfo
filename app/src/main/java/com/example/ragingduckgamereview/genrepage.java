package com.example.ragingduckgamereview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class genrepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genrepage);
        Intent intent = getIntent();

        Button allRPGbtn = findViewById(R.id.allRPGbtn);
        Button allShootingbtn = findViewById(R.id.allShootingbtn);
        Button allAdvanturebtn = findViewById(R.id.allAdvanturebtn);
        ImageButton rpg1 = findViewById(R.id.rpg1);

        allRPGbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(genrepage.this,genre1RPG.class);
                startActivity(intent21);
            }
        });

        allShootingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(genrepage.this,genre2Shooting.class);
                startActivity(intent22);
            }
        });

        allAdvanturebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(genrepage.this,genre3Advanture.class);
                startActivity(intent23);
            }
        });

        rpg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24 = new Intent(genrepage.this,detailGame1.class);
                startActivity(intent24);
            }
        });

    }


    @Override
     public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_rpg:
                Intent intent1 = new Intent(getApplicationContext(), genre1RPG.class);
                startActivity(intent1);
                return true;
            case R.id.action_shooting:
                Intent intent2 = new Intent(getApplicationContext(), genre2Shooting.class);
                startActivity(intent2);
                return true;
            case R.id.action_advanture:
                Intent intent3 = new Intent(getApplicationContext(), genre3Advanture.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
     }



}