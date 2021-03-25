package com.example.smartcarpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartcarpark.databinding.ActivityHomepageBinding;

public class Homepage extends AppCompatActivity {
ActivityHomepageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}