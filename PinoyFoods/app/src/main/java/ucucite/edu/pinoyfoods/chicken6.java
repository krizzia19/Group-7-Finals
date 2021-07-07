package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class chicken6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken6);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Spicy Sotanghon Chicken");
    }
}