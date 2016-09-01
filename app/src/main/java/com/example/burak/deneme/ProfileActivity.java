package com.example.burak.deneme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

/**
 * Created by burak on 31.08.2016.
 */
public class ProfileActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hastaneler);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.four_button_act);

        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.four_buttons_menu, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(int itemId) {
                switch (itemId) {
                    case R.id.kizilay_item:
                        Intent i2=new Intent(ProfileActivity.this, KizilayActivity.class);
                        startActivity(i2);

                        break;
                    case R.id.hastaneler_item:
                        Intent i=new Intent(ProfileActivity.this, HastanelerActivity.class);
                        startActivity(i);
                        break;
                    case R.id.main_item:
                        Intent i3=new Intent(ProfileActivity.this, MainActivity.class);
                        startActivity(i3);

                        break;
                    case R.id.profile_item:
                        Intent i4=new Intent(ProfileActivity.this, ProfileActivity.class);
                        startActivity(i4);

                        break;
                }
            }
        });
        bottomBar.setActiveTabColor("#C2185B");

    }
}