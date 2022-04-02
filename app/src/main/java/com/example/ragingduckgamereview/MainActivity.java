package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton startbtn;


    progressDialog customProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startbtn = (ImageButton) findViewById(R.id.startbtn);
        customProgressDialog =  new progressDialog(this);
        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


        startbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                customProgressDialog.show();

                // 로딩창 보여주기
                //customProgressDialog.show();
                Handler timer = new Handler();
                timer.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        customProgressDialog.dismiss();
                        Intent intent = new Intent(MainActivity.this, menu.class);
                        startActivity(intent);

                    }
                },3000);


            }


        }
        );

    }
}