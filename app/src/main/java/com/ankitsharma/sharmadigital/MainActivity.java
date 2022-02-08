package com.ankitsharma.sharmadigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardHome;
    CardView cardChat;
    CardView cardSetting;
    CardView cardLogout;
    CardView cardProfile;
    CardView cardWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        getSupportActionBar ().hide ();

        cardHome = findViewById (R.id.cardHome);
        cardChat = findViewById (R.id.cardChat);
        cardSetting = findViewById (R.id.cardSetting);
        cardLogout = findViewById (R.id.card);
        cardProfile = findViewById (R.id.cardProfile);
        cardWidget = findViewById (R.id.cardWidget);

        cardHome.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
             ShowToast ("Home Button Clicked");
             Intent intent = new Intent (MainActivity.this,HomeActivity.class);
             startActivity (intent);
            }
        });

        cardChat.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                ShowToast ("Chat Button Clicked");
                Intent intent = new Intent (MainActivity.this,ChatDetailActivity.class);
                startActivity (intent);
            }
        });

        cardSetting.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                ShowToast ("Settings Button Clicked");
                Intent intent2 = new Intent (MainActivity.this,SettingsActivity.class);
                startActivity (intent2);
            }
        });

        cardWidget.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                ShowToast ("Widget Button Clicked");
            }
        });

        cardProfile.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                ShowToast ("Profile Button Clicked");

                Intent intent1 = new Intent (MainActivity.this,ProfileActivity.class);
                startActivity (intent1);

            }


        });

        cardLogout.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,LoginActivity.class);
                startActivity (intent);
            }
        });

    }

    private  void ShowToast(String message){
        Toast.makeText (this, message, Toast.LENGTH_SHORT).show ();
    }

}