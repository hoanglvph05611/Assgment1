package com.lvh.assgment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setTitle("Latest");
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container, new LatestFragment()).commit();
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

//        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_latest:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new LatestFragment()).commit();
                break;
            case R.id.nav_category:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new CategoryFragment()).commit();
                break;
            case R.id.nav_gifs:
//                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
//                        new ThongKeFragment()).commit();

                break;
            case R.id.nav_my_favorites:

//                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
//                        new GioiThieuFragment()).commit();

                break;
            case R.id.nav_rate_app:
                break;
            case R.id.nav_more_App:
                break;
            case R.id.nav_about_us:
                break;
            case R.id.nav_setting:
                break;
            case R.id.nav_privacy_police:
                break;
        }
        int id = item.getItemId();

        if (id == R.id.nav_latest) {
            // Handle the camera action

        } else if (id == R.id.nav_category) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                    new CategoryFragment()).commit();

        } else if (id == R.id.nav_gifs) {

        } else if (id == R.id.nav_my_favorites) {

        } else if (id == R.id.nav_rate_app) {

        } else if (id == R.id.nav_more_App) {

        } else if (id == R.id.nav_about_us) {

        } else if (id == R.id.nav_setting) {

        } else if (id == R.id.nav_privacy_police) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
