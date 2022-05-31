package com.example.sm_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_mainpage,new HomeFragment()).commit();

        bottomNavigationView.setSelectedItemId(R.id.Nav_Home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment =null;
                switch (item.getItemId()){
                    case R.id.Nav_Home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.Nav_Game:
                        fragment = new GameFragment();
                        break;
                    case R.id.Nav_profile:
                        fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.home_mainpage,fragment).commit();

                return true;

            }
        });
//
//        {
//            getSupportFragmentManager().beginTransaction().replace(R.id.Game_fragment_cont,new )
//        }
    }
}