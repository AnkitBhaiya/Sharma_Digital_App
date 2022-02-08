package com.ankitsharma.sharmadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile);
        ImageView imageView;
        imageView = findViewById (R.id.back_arrow);
        imageView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ProfileActivity.this,MainActivity.class);
                startActivity (intent);
            }
        });
    }
}