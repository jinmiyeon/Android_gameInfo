package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class detailGame1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game1);
        Intent intent = getIntent();







    }
    public void onButton2Click (View view){
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://elderscrolls.bethesda.net/ko/skyrim/"));
        startActivity(intent);

    }
}