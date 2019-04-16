package com.example.pitch_in;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;

public class newActivity extends AppCompatActivity {

    String[] type = { "Traditional","Auctional"};
    String[] member = { "Customize","Random"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        EditText saveAmount = findViewById(R.id.saveAmount);
        EditText payment = findViewById(R.id.payment);
        EditText period = findViewById(R.id.period);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, type);
        //Find TextView control
        AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.type1);
        //Set the number of characters the user must type before the drop down list is shown
        acTextView.setThreshold(1);
        //Set the adapter
        acTextView.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, member);
        //Find TextView control
        AutoCompleteTextView acTextView1 = (AutoCompleteTextView) findViewById(R.id.members1);
        //Set the number of characters the user must type before the drop down list is shown
        acTextView1.setThreshold(1);
        //Set the adapter
        acTextView1.setAdapter(adapter1);

    }
}
