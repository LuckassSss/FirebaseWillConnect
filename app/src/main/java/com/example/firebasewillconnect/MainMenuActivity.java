package com.example.firebasewillconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }
    public void onClickFirstTasks (View v){
        Intent intent = new Intent(MainMenuActivity.this, FavoriteDogApp.class);
        startActivity(intent);
    }
}