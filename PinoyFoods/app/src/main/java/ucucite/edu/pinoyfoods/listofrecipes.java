package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listofrecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofrecipes);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pinoy Food Recipes");
    }

    public void chicken(View view) {
        Intent intent = new Intent(this, ChickenActivity.class);
        startActivity(intent);
    }

    public void pork(View view) {
        Intent intent = new Intent(this, PorkStartActivity.class);
        startActivity(intent);
    }

    public void vegetables(View view) {
        Intent intent = new Intent(this, VegeStartActivity.class);
        startActivity(intent);
    }
}