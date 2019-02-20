package com.example.elysiancorporation.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.elysiancorporation.fragment.AboutusFragment;
import com.example.elysiancorporation.fragment.CareerFragment;
import com.example.elysiancorporation.fragment.ContactUsFragment;
import com.example.elysiancorporation.fragment.DigitalMarketing;
import com.example.elysiancorporation.fragment.GetInTouchFragment;
import com.example.elysiancorporation.fragment.HomeFragment;
import com.example.elysiancorporation.fragment.MobileDevelopment;
import com.example.elysiancorporation.fragment.SEO;
import com.example.elysiancorporation.fragment.ServicesFragment;
import com.example.elysiancorporation.fragment.TrainingFragment;
import com.example.elysiancorporation.fragment.WebDesigning;
import com.example.elysiancorporation.fragment.WebDevelopment;
import com.example.elysiancorporation.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
TextView toolbartitle;
String frag=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbartitle=(TextView)toolbar.findViewById(R.id.toolbartitle);
        toolbartitle.setText("HOME");
        setSupportActionBar(toolbar);
        frag=getIntent().getStringExtra("Frag");
        if(TextUtils.isEmpty(frag)){
            getFragment(new HomeFragment());
        }
       /* else if(frag.equalsIgnoreCase("ServicesFragment")) {
            getFragment(new WebDesigning());
            toolbartitle.setText("WebDesigning");
        }else if(frag.equalsIgnoreCase("ServiceFragment")){
            getFragment(new WebDevelopment());
            toolbartitle.setText("WebDevelopment");
        }else if(frag.equalsIgnoreCase("ServicessFragment")){
            getFragment(new MobileDevelopment());
            toolbartitle.setText("MobileDevelopment");
        }else if(frag.equalsIgnoreCase("ServicesssFragment")){
            getFragment(new SEO());
            toolbartitle.setText("Search Engine Optimization");
        }else if(frag.equalsIgnoreCase("ServicessssFragment")){
            getFragment(new DigitalMarketing());
            toolbartitle.setText("Digital Marketing");
        }else if(frag.equalsIgnoreCase("TrainingFragment")){
            getFragment(new TrainingFragment());
            toolbartitle.setText("Training");
    }*/
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Contact Here: 0172-5081091", Snackbar.LENGTH_LONG)
                        .setAction("CALL", new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:0172-5081091"));
                                startActivity(callIntent);
                            }
                        }).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
                navigationView.setNavigationItemSelectedListener(this);


            }

            @Override
            public void onBackPressed() {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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


                return super.onOptionsItemSelected(item);
            }

            @SuppressWarnings("StatementWithEmptyBody")
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    // Handle the camera action
                    getFragment(new HomeFragment());
                    toolbartitle.setText("HOME");
                } else if (id == R.id.nav_about_us) {
                    getFragment(new AboutusFragment());
                    toolbartitle.setText("ABOUT US");
                } else if (id == R.id.nav_services) {
                    getFragment(new ServicesFragment());
                    toolbartitle.setText("SERVICES");

                } else if (id == R.id.nav_training) {
                    getFragment(new TrainingFragment());
                    toolbartitle.setText("TRAINING");
                } else if (id == R.id.nav_career) {
                    getFragment(new CareerFragment());
                    toolbartitle.setText("CAREER");
                } else if (id == R.id.nav_contact_us) {
                    getFragment(new ContactUsFragment());
                    toolbartitle.setText("CONTACT US");
                } else if (id == R.id.nav_getintouch) {
                    getFragment(new GetInTouchFragment());
                    toolbartitle.setText("CONTACT US");
                }


                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }

            public void getFragment(Fragment fragment) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame, fragment);
                ft.disallowAddToBackStack();
                ft.commit();

            }

            public void call(View view) {
                Toast.makeText(this, "Call me", Toast.LENGTH_LONG).show();
            }
        }




