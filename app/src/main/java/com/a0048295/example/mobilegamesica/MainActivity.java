package com.a0048295.example.mobilegamesica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LaunchGame(View view) {
        Intent Play = new Intent(this, PlayGame.class);
        startActivity(Play);
    }

    public void Settings(View view) {
        Intent Set = new Intent(this, Settings.class);
        startActivity(Set);
    }

    public void Quit(View view) {
        this.finishAffinity();
        System.exit(0);
    }
}