package com.example.ex0921;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    LinearLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adb = new AlertDialog.Builder(this);
        mainLayout = findViewById(R.id.main);

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
        adb.setTitle("Text and Image with a button to close the Alert");
        adb.setMessage("This is text is an alert text press the Close button to return to the homePage");
        adb.setIcon(R.drawable.minion);
        adb.setCancelable(false);
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void popBackground(View view) {
        adb.setTitle("Text, Image, and a button to change the background");
        adb.setMessage("This is text is an alert text");
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("Change Background", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                mainLayout.setBackgroundColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void popBackgroundAdv(View view) {
    }
}