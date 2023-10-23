package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView2);

        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();
        if(Intent.ACTION_SEND.equals(action) && type!=null
        ) {
          imageView.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
        }
        }

    }
