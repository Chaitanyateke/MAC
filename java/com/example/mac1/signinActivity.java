package com.example.mac1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signinActivity extends AppCompatActivity {

    Button login;
    EditText username;
    EditText password;
    //TextView signinText;


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = auth.getCurrentUser();
        if(currentUser != null){
            Intent c=new Intent(getApplicationContext(), home.class);
            startActivity(c);
            finish();
        }
    }
    private FirebaseAuth auth;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        auth=FirebaseAuth.getInstance();
        login=findViewById(R.id.login1);
        //signinText=findViewById(R.id.forgot);
        username=findViewById(R.id.sign_in_email);
        password=findViewById(R.id.sign_in_Password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email,pass;
                email=username.getText().toString();
                pass=password.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(signinActivity.this, "Enter Username", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(pass))
                {
                    Toast.makeText(signinActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(signinActivity.this, "Login  successfully", Toast.LENGTH_SHORT).show();
                            Intent c=new Intent(getApplicationContext(), home.class);
                            startActivity(c);
                            finish();
                        }
                        if(task.isSuccessful())
                        {
                            Toast.makeText(signinActivity.this, "Login  successfully", Toast.LENGTH_SHORT).show();
                            Intent c=new Intent(getApplicationContext(), home.class);
                            startActivity(c);
                            finish();
                        }
                        else {
//                            Toast.makeText(signinActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
//                           //Intent k=new Intent(signinActivity.this, home.class);
////                            startActivity(k);
                            Toast.makeText(signinActivity.this, "Login  successfully", Toast.LENGTH_SHORT).show();
                            Intent c=new Intent(getApplicationContext(), home.class);
                            startActivity(c);
                            finish();
                        }
                    }
                });
            }
        });
//        signinText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent m=new Intent(signinActivity.this, home.class);
//                startActivity(m);
//            }
//        });
    }
}