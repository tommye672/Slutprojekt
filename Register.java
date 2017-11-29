package com.example.demodatabase;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText e_name, e_password, e_contact, e_country;
    String name, password, contact, country;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("App is starting", "app is starting");

        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


        e_name=(EditText) findViewById(R.id.name);
        e_password=(EditText) findViewById(R.id.password);
        e_contact =(EditText) findViewById(R.id.contact);
        e_country =(EditText) findViewById(R.id.country);

            }
        });
    }

    public void reguser(View view) {

        name = e_name.getText().toString();
        password = e_password.getText().toString();
        contact = e_contact.getText().toString();
        country = e_country.getText().toString();
        String method = "register";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        //backgroundTask.execute(method, name, password, contact, country);
        backgroundTask.doInBackground(method, name, password, contact, country);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
