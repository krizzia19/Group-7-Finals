package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class dvegetable10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvegetable10);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ginataang Langka with malunggay at Dilis");
    }
}