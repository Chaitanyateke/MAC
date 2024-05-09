package com.example.mac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class
optionActivity extends AppCompatActivity {
    private com.google.android.material.button.MaterialButton register;
    private com.google.android.material.button.MaterialButton login1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        register = (com.google.android.material.button.MaterialButton) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignupActivity();
            }
        });

        login1 = (com.google.android.material.button.MaterialButton) findViewById(R.id.login);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensigninActivity();
            }
        });
    }

    public void opensignupActivity() {

        Intent intent;
        intent = new Intent(this, signupActivity.class);
        startActivity(intent);

    }

    public void opensigninActivity(){
        Intent intent1;
        intent1 = new Intent(this, signinActivity.class);
        startActivity(intent1);
    }
}