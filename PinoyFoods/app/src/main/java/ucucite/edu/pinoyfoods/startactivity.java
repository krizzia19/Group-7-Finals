package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class startactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pinoy Food Recipes");

    }
    public void gotolist(View view) {
        Intent intent = new Intent(this, listofrecipes.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(this, developers.class);
        startActivity(intent);
    }

    public void exit(View view) {
        new AlertDialog.Builder(startactivity.this)
                .setTitle("Pinoy Food Recipes")
                .setMessage("Are you sure you want to exit?")
                .setIcon(R.drawable.logomo)
                .setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                finishAffinity();
                            }
                        })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(startactivity.this)
                .setTitle("Pinoy Food Recipes")
                .setMessage("Are you sure you want to exit?")
                .setIcon(R.drawable.logomo)
                .setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                finishAffinity();
                            }
                        })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

}