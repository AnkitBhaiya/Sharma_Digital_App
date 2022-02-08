package com.ankitsharma.sharmadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);
        getSupportActionBar ().hide ();
        Button button = findViewById (R.id.signIn);
        button.setOnClickListener (view -> {
            Intent intent = new Intent (LoginActivity.this,MainActivity.class);
            startActivity (intent);
        });
        TextView textView = findViewById (R.id.signuptext);
        textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (LoginActivity.this,SignUpActivity.class);
                startActivity (intent);
            }
        });
    }
}