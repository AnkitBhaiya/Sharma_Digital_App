package com.ankitsharma.sharmadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_up);
        getSupportActionBar ().hide ();

        TextView textView = findViewById (R.id.logintext);
        textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SignUpActivity.this,LoginActivity.class);
                startActivity (intent);
            }
        });

    }
}