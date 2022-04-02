package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class testpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testpage);
        Intent intent = getIntent();
        ImageButton testStartbtn = findViewById(R.id.testStartbtn);

        testStartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(testpage.this,testQ1.class);
                startActivity(intent10);
            }
        });



    }
}