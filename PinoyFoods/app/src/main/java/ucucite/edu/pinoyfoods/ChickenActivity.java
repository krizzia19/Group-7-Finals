package ucucite.edu.pinoyfoods;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ChickenActivity extends AppCompatActivity {
    ListView listView;
    ChickenListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<ChickenModel> arrayList = new ArrayList<ChickenModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Chicken Recipes");

        title = new String[]{"Chicken Sotanghon Soup", "Chicken Potato Salad", "Adobong Manok Sa Gata","Chicken Caldereta", "Chicken Adobong Puti","Spicy Sotanghon Chicken Recipe","Chicken Asparagus Soup Recipe","Chicken Liver and Gizzard Stew","Chicken Barbecue","Chicken Pasta with creamy bassil sauce"};
        description = new String[]{"Chicken Sotanghon detail...","Chicken Potato Salad detail...", "Adobong Manok Sa Gata detail...", "Chicken Caldereta detail...", "Chicken Adobong Puti detail...", "Spicy Sotanghon Chicken Recipe detail...", "Chicken Asparagus Soup Recipe detail...", "Chicken Liver and Gizzard Stew detail...", "Chicken Barbecue detail...", "Chicken Pasta with creamy bassil sauce detail..."};
        icon = new int[]{R.drawable.chicken1, R.drawable.chicken2, R.drawable.chicken3, R.drawable.chicken4, R.drawable.chicken5, R.drawable.chicken6, R.drawable.chicken7, R.drawable.chicken8, R.drawable.chicken9, R.drawable.chicken10};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            ChickenModel chickenModel = new ChickenModel(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(chickenModel);
        }

        //pass results to listViewAdapter class
        adapter = new ChickenListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    //Search Code
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setQueryHint("Search Recipe...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()

        {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
}
