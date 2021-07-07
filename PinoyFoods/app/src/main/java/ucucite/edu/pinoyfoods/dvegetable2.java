package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class dvegetable2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvegetable2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Crispy Air Fried Liempo Pinakbet with Ube");
    }
}