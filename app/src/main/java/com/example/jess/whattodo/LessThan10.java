package com.example.jess.whattodo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class LessThan10 extends ActionBarActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_less_than10);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView);

        //Create an array of times to print out
        String[] choices = {"Meditate", "Stretch", "Learn 3 Russian words",
                "Go outside and interpret clouds", "Make a cup of tea", "Slow Dance", "Play Double Solitaire",
                "Look at old photos", "Exchange neck massages", "Get Jamba Juice", "Clean the car",
                "Exchange a childhood story", "Do an online questionnaire", "Put all your cash/coins in a piggy bank",
                "Look into eachother's eyes for 5 min", "Send a note of encouragement to one of our friends",
                "Talk about future for 7 minutes", "Play Go Fish", "Take a Relfie", "Synchronize Breathing",
                "Read a childrens book", "De-clutter our bags", "Exercise"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, choices);
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_less_than10, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
