package com.example.rfebrian.class1darendroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Class2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);

        // get intent to asign it to local variable
        Intent intent = getIntent();

        // get extra message variable from Class1
        String message = intent.getStringExtra(Class1.EXTRA_MESSAGE);

        // create the text view
        TextView textView = new TextView(this);

        // giving declare settext()
        textView.setTextSize(40);
        // call back the value of "String message = editText.getText().toString()" in class 1
        textView.setText(message);
        // make full content of frame just message
        setContentView(textView);


    }

    // delete this onCreateOptionsMenu


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
