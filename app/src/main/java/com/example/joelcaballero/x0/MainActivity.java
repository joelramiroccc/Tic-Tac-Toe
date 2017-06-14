package com.example.joelcaballero.x0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView pl1,pl2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pl1=(ImageView)findViewById(R.id.p1);
        pl2=(ImageView)findViewById(R.id.p2);

        pl1.setOnClickListener(this);
        pl2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int seleccion= v.getId();
        switch (seleccion) {
            case R.id.p1: {
                Intent i = new Intent(this, SelectionPvsPc.class);
                startActivity(i);
            }
            break;
            case R.id.p2: {
                Intent i = new Intent(this, Selection.class);
                startActivity(i);
            }
            break;
        }
    }
}
