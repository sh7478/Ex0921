
/**
* @author shaked hazan shaked1246@gmail.com
* @version 1.0
* @since 2024-07-26
*This class demonstrates various AlertDialogs in an Android application.
*/
package com.example.ex0921;

import android.content.DialogInterface;
import android.content.Intent;
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
    /**
    * Called when the activity is first created. This is where you should do all of your normal static set up: create views, bind data to lists, etc.
    * <p>
    *
    * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.main);

    }

    /**
    * Displays a simple AlertDialog with a title and message.
    * <p>
    *
    * @param view The view that was clicked to trigger this method.
    */
    public void popMsg(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text Alert");
        adb.setMessage("This is text is an alert text");
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
    * Displays an AlertDialog with a title, message, and an icon.
    * <p>
    *
    * @param view The view that was clicked to trigger this method.
    */
    public void popImg(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text and Image Alert");
        adb.setMessage("This is text is an alert text");
        adb.setIcon(R.drawable.minion);
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
    * Displays an advanced AlertDialog with a title, message, icon, and a close button. It cannot be cancelled by pressing outside the dialog.
    * <p>
    *
    * @param view The view that was clicked to trigger this method.
    */
    public void popImgAdv(View view) {
        adb = new AlertDialog.Builder(this);
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

    /**
    * Displays an AlertDialog that allows changing the background color of the main layout.
    * <p>
    *
    * @param view The view that was clicked to trigger this method.
    */
    public void popBackground(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text and a button to change the background");
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

    /**
    * Displays an advanced AlertDialog that allows changing or restoring the background color of the main layout.
    * <p>
    *
    * @param view The view that was clicked to trigger this method.
    */
    public void popBackgroundAdv(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text and a button to change the background");
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
        adb.setNeutralButton("Restore Background", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        mainLayout.setBackgroundColor(Color.WHITE);
                    }
                });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void openCredits(View view) {
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }
}
