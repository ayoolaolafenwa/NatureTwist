package com.ayoolaolafenwa.naturetwist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn = (Button)findViewById(R.id.btn_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent click = new Intent(MainActivity.this, Chapter1.class);
                startActivity(click);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Nature's Twist is an exciting and interesting story about nature, get it from Google\n" +
                    "    Playstore https://play.google.com/store/apps/details?id=com.ayoolaolafenwa.naturetwist");
            sendIntent.setType("text/plain");
            startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send)));



            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.chap1) {
            Intent intent1 = new Intent(MainActivity.this, Chapter1.class);
            startActivity(intent1);

        } else if (id == R.id.chap2) {
            Intent intent2 = new Intent(MainActivity.this, Chapter2.class);
            startActivity(intent2);

        } else if (id == R.id.chap3) {
            Intent intent3 = new Intent(MainActivity.this, Chapter3.class);
            startActivity(intent3);

        } else if (id == R.id.chap4) {
            Intent intent4 = new Intent(MainActivity.this, Chapter4.class);
            startActivity(intent4);

        } else if (id == R.id.chap5) {
            Intent intent5 = new Intent(MainActivity.this, Chapter5.class);
            startActivity(intent5);

        }
        else if (id == R.id.chap6) {
            Intent intent6 = new Intent(MainActivity.this, Chapter6.class);
            startActivity(intent6);

        }
        else if (id == R.id.chap7) {
            Intent intent7 = new Intent(MainActivity.this, Chapter7.class);
            startActivity(intent7);

        }
        else if (id == R.id.chap8) {
            Intent intent8 = new Intent(MainActivity.this, Chapter8.class);
            startActivity(intent8);

        }
        else if (id == R.id.chap9) {
            Intent intent9 = new Intent(MainActivity.this, Chapter9.class);
            startActivity(intent9);

        }
        else if (id == R.id.chap10) {
            Intent intent10 = new Intent(MainActivity.this, Chapter10.class);
            startActivity(intent10);

        }
        else if (id == R.id.abt) {
            Intent intent_abt = new Intent(MainActivity.this, About.class);
            startActivity(intent_abt);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
