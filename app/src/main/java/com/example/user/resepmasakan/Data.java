package com.example.user.resepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Data extends AppCompatActivity {

    ImageView image;
    TextView proses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Intent in = getIntent();

        image =(ImageView)findViewById(R.id.data_image);
        image.setImageResource(in.getIntExtra("image",0));

        proses =(TextView)findViewById(R.id.proses);
        proses.setText(in.getStringExtra("prosesnya"));

        getSupportActionBar().setTitle(in.getStringExtra("judulnya"));
    }
}
