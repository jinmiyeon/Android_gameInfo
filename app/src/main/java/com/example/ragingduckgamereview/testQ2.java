package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class testQ2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_q2);
        Intent intent = getIntent();
        ImageButton gototestQ3 = findViewById(R.id.gototestQ3);

        gototestQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(testQ2.this,testQ3.class);
                startActivity(intent12);
            }
        });
    }
}