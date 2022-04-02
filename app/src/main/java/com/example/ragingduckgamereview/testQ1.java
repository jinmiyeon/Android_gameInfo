package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class testQ1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_q1);
        Intent intent = getIntent();
        ImageButton gototestQ2 = findViewById(R.id.gototestQ2);

        gototestQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(testQ1.this,testQ2.class);
                startActivity(intent11);
            }
        });
    }
}