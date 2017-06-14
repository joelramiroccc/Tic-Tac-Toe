package com.example.joelcaballero.x0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SelectionPvsPc extends AppCompatActivity implements View.OnClickListener{
    ImageView x,o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_pvs_pc);
        x=(ImageView)findViewById(R.id.xsxc);
        x.setOnClickListener(this);
        o=(ImageView)findViewById(R.id.osoc);
        o.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int seleccion= v.getId();
        try{
            switch (seleccion) {
                case R.id.xsxc:{
                    String xs = "X";
                    String os = "0";
                    Intent i = new Intent(this, PlayerVsComputer.class);
                    i.putExtra("pl1", xs);
                    i.putExtra("pl2", os);
                    startActivity(i);
                    break;
                }
                case R.id.osoc: {
                    String os = "0";
                    String xs = "X";
                    Intent i = new Intent(this, PlayerVsComputer.class);
                    i.putExtra("pl1", os);
                    i.putExtra("pl2", xs);
                    startActivity(i);
                    break;
                }
            }
        }catch (Exception e){
        }

    }
}
