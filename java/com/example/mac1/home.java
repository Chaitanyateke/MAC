package com.example.mac1;

import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;



public class home extends AppCompatActivity {
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    CardView cardView6;

    CardView cardView7;

    CardView cardView8;
    CardView cardView9;
    CardView cardView10;
    CardView cardView11;
    CardView cardView12;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardView1=findViewById(R.id.robot);
        cardView2=findViewById(R.id.photo);
        cardView3=findViewById(R.id.high);
        cardView4=findViewById(R.id.prab);
        cardView5=findViewById(R.id.gdsc);
        cardView6=findViewById(R.id.code);
        cardView7=findViewById(R.id.nss);
        cardView8=findViewById(R.id.tp);
        cardView9=findViewById(R.id.health);
        cardView10=findViewById(R.id.adven);
        cardView11=findViewById(R.id.ecell);
        cardView12=findViewById(R.id.art);
        textView=findViewById(R.id.textView3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, robotics.class);
                startActivity(o);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, photography.class);
                startActivity(o);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, higher.class);
                startActivity(o);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, prarambha.class);
                startActivity(o);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, gdsc.class);
                startActivity(o);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, code.class);
                startActivity(o);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, nss.class);
                startActivity(o);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, tp.class);
                startActivity(o);
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, health.class);
                startActivity(o);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, adven.class);
                startActivity(o);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, ecell.class);
                startActivity(o);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, art.class);
                startActivity(o);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(home.this, profile.class);
                startActivity(o);
            }
        });

    }

}