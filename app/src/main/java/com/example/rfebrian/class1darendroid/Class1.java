package com.example.rfebrian.class1darendroid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class Class1 extends Activity {
    // give value and initialize the extra_message object
    public final static String EXTRA_MESSAGE = "smooth by d.android.com by googler";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public void sendMessage (View view){
        //building first intent by calling initiation of module
        //Intent intent = new Intent(name of the current activity (class1)this, (targetactivity.class)Class2.class);
        Intent intent = new Intent(this, Class2.class);
        //import initial content of intent by targeting the category of intent subjek
        EditText editText = (EditText) findViewById(R.id.editMessage);
        //initialize the value of temp place
        String message = editText.getText().toString();
        //give an extra message
        intent.putExtra(EXTRA_MESSAGE, message);
        //don't forget initialize that in front off
        startActivity(intent);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_class1, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_class1, container, false);
            return rootView;
        }
    }
}
