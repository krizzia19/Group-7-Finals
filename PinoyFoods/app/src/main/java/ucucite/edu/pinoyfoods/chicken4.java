package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class chicken4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken4);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Chicken Caldereta");
    }
}