package com.example.mac1;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signupActivity extends AppCompatActivity {
    EditText sign_up_Name,sign_up_email,sign_up_dept,sign_up_year,sign_up_unique,sign_up_Password,sign_up_con_Password;
    FirebaseAuth auth;
    Button b;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sign_up_Name=findViewById(R.id.sign_up_Name);
        sign_up_email=findViewById(R.id.sign_up_email);
        sign_up_dept=findViewById(R.id.sign_up_dept);
        sign_up_year=findViewById(R.id.sign_up_year);
        sign_up_unique=findViewById(R.id.sign_up_unique);
        sign_up_Password=findViewById(R.id.sign_up_Password);
        sign_up_con_Password=findViewById(R.id.sign_up_con_Password);
        auth=FirebaseAuth.getInstance();
        b=findViewById(R.id.register);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =sign_up_Name.getText().toString();
                String email=sign_up_email.getText().toString();
                String depart=sign_up_dept.getText().toString();
                String year=sign_up_year.getText().toString();
                String  unique= sign_up_unique.getText().toString();
                String pass=sign_up_Password.getText().toString();
                String confirmPass=sign_up_con_Password.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(signupActivity.this, "Enter Email", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(signupActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                } else if (pass.length() < 6) {
                    Toast.makeText(signupActivity.this, "Password too Short", Toast.LENGTH_SHORT).show();
                } else {
                    auth.createUserWithEmailAndPassword(email, pass)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        Toast.makeText(signupActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                        Intent z = new Intent(getApplicationContext(), home.class);
                                        startActivity(z);
                                        finish();
                                    } else {
                                        Toast.makeText(signupActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                        Intent z = new Intent(getApplicationContext(), home.class);
                                        startActivity(z);
                                        finish();
                                        // If sign in fails, display a message to the user.
                                        //Log.w(TAG, "createUserWithEmail:failure", task.getException());
//                                        Toast.makeText(signupActivity.this, "Authentication failed.",
//                                                Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                }
            }
        });



    }

}


