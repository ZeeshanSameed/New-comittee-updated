package com.example.pitch_in;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout reallay2,reallay1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            reallay1.setVisibility(View.VISIBLE);
            reallay2.setVisibility(View.VISIBLE);
        }
    };

    Button log_in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reallay1 = (RelativeLayout) findViewById(R.id.reallay1);
        reallay2 = (RelativeLayout) findViewById(R.id.reallay2);
        handler.postDelayed(runnable,2000);

        log_in = findViewById(R.id.login);
        log_in.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.login:
                Intent home = new Intent(getApplicationContext(), HomePage.class);
                startActivity(home);
        }
    }
}
