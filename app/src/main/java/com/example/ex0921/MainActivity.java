package com.example.ex0921;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adb = new AlertDialog.Builder(this);
    }

    public void popMsg(View view) {
        adb.setTitle("Text Alert");
        adb.setMessage("This is text is an alert text");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void popImg(View view) {
        adb.setTitle("Text and Image Alert");
        adb.setMessage("This is text is an alert text");
        adb.setIcon(R.drawable.minion);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void popImgAdv(View view) {
    }

    public void popBackground(View view) {
    }

    public void popBackgroundAdv(View view) {
    }
}