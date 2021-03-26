package com.example.smartcarpark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class History extends AppCompatActivity {
    //Initialize variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        //Open drawer
        Homepage.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        //close
        Homepage.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //Redirect activity to home
        Homepage.redirectActivity(this,Homepage.class);
    }

    public void ClickVehicle(View view){
        //Redirect activity to Vehicle
        Homepage.redirectActivity(this,Vehicle.class);

    }
    public void ClickProfile(View view){
        //Redirect activity to Profile
        Homepage.redirectActivity(this,Homepage.class);
    }

    public void ClickHistory(View view){
        //Recreate activity
        recreate();
    }
    public void ClickLogout(View view){
        //close app
        Homepage.logout(this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        //close drawer
        Homepage.closeDrawer(drawerLayout);
    }
}