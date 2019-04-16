package com.example.pitch_in;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = findViewById(R.id.tool1);
        setSupportActionBar(toolbar);
        ImageButton newCommittee= findViewById(R.id.newCommittee);
        newCommittee.setOnClickListener(this);
        ImageButton current= findViewById(R.id.current);
        current.setOnClickListener(this);
        ImageButton history= findViewById(R.id.history);
        history.setOnClickListener(this);
        ImageButton about= findViewById(R.id.about);
        about.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawer_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.user:
                Intent a= new Intent(this,userActivity.class);
                startActivity(a);
                Toast.makeText(this, "User", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.complain:
                Intent b= new Intent(this,complainActivity.class);
                startActivity(b);
                Toast.makeText(this, "Complain", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.people:
                Intent c= new Intent(this,peopleActivity.class);
                startActivity(c);
                Toast.makeText(this, "People", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Intent d= new Intent(this,helpActivity.class);
                startActivity(d);
                Toast.makeText(this, "help", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Intent e= new Intent(this,settingActivity.class);
                startActivity(e);
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.notification:
                Intent f= new Intent(this,noificationActivity.class);
                startActivity(f);
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.newCommittee:
                Intent i= new Intent(this,newActivity.class);
                startActivity(i);
                Toast.makeText(this, "New Committee", Toast.LENGTH_LONG).show();
                break;

            case R.id.history:
                Intent j= new Intent(this,historyActivity.class);
                startActivity(j);
                Toast.makeText(this, "History", Toast.LENGTH_LONG).show();
                break;
            case R.id.about:
                Intent k= new Intent(this,aboutActivity.class);
                startActivity(k);
                Toast.makeText(this, "New About", Toast.LENGTH_LONG).show();
                break;
            case R.id.current:
                Intent l= new Intent(this,currentActivity.class);
                startActivity(l);
                Toast.makeText(this, "Current", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
