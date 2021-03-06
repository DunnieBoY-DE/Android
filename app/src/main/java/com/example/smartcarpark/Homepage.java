package com.example.smartcarpark;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.smartcarpark.databinding.ActivityHomepageBinding;

public class Homepage extends AppCompatActivity {
//ActivityHomepageBinding binding;

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //Bottom navigation view
        //code 1
        //Assign Variable
        drawerLayout = findViewById(R.id.drawer_layout);
    }
            public void ClickMenu (View view){

                //open drawer
                openDrawer(drawerLayout);
            }

            public static void openDrawer(DrawerLayout drawerLayout){
                //open drawer Layout
                drawerLayout.openDrawer(GravityCompat.START);
            }

            public void ClickLogo (View view){
                //close drawer
                closeDrawer(drawerLayout);
            }

            public static void closeDrawer (DrawerLayout drawerLayout){
                //Close drawer layout
                //check condition
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    // When drawer is open
                    //close drawer
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

            }

            public void ClickHome (View view){
                //Recreate activity
                recreate();
            }

            public void ClickProfile (View view){
                //Redirect activity to vehicle
                redirectActivity(this, Profile.class);
            }

            public void ClickVehicle (View view){
                //Redirect activity to My bookings
                redirectActivity(this, Vehicle.class);
            }
            public void ClickMybookings (View view){
                //Redirect activity to My bookings
                redirectActivity(this, Mybookings.class);
            }
            public void ClickHistory (View view){
                //Redirect activity to My bookings
                redirectActivity(this, History.class);
            }
            public void ClickLogout (View view){
                //Close App
                logout(this);
            }

            public static void logout ( final Activity activity){
                //Initialize alert dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                //Set title
                builder.setTitle("Logout");
                //Set message
                builder.setMessage("Are you sure you want to logout ?");

                //Positive yes button
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Finish activity
                        activity.finishAffinity();
                        //Exit app
                        System.exit(0);
                    }
                });

                //Negative no button
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Dismiss dialog
                        dialog.dismiss();

                    }
                });
                //Show dialog
                builder.show();
            }
            public static void redirectActivity (Activity activity, Class aClass){
                //Initialize Intent
                Intent intent = new Intent(activity, aClass);
                //set flag
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //Start activity
                activity.startActivity(intent);

            }
            @Override
            protected void onPause () {
                super.onPause();
                //close drawer
                closeDrawer(drawerLayout);
            }

//        binding =ActivityHomepageBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container,new FirstFragment())
//                .commit();
//        binding.bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
//            switch (item.getItemId()){
//                case R.id.home:
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragment_container,new SecondFragment())
//                            .commit();
//                    case R.id.vehicle:
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragment_container,new ThirdFragment())
//                            .commit();
//                    case R.id.profile:
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragment_container,new FourthFragment())
//                            .commit();
//                case R.id.setting:
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragment_container, new FifthFragment())
//                            .commit();
//            }
//            return true;
//        });
    }
