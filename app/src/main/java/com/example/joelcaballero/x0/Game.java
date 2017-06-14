package com.example.joelcaballero.x0;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity implements OnClickListener{
//btnPress.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_mostrado));
     //imagen_Appbar.setImageResource(R.drawable.koala);

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,rest,again;
    int cont=0,draw=0,pl1=0,pl2=0;
    TextView winP1,winP2,draws;
    String p1="X",p2="O";
    ImageView ximg,oimg;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();

        if (bundle!=null){
            p1=getIntent().getStringExtra("pl1");
            p2=getIntent().getStringExtra("pl2");
        }


        //ASIGNACION DE VALORES A CADA VARIABLE

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        rest=(Button)findViewById(R.id.rein);
        again=(Button)findViewById(R.id.again);
        winP1=(TextView)findViewById(R.id.winpl1);
        winP2=(TextView)findViewById(R.id.winpl2);
        draws=(TextView)findViewById(R.id.draw);
        // HACER LAS VARIABLES CLIQUEABLES
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        rest.setOnClickListener(this);
        again.setOnClickListener(this);
        ximg=(ImageView)findViewById(R.id.player1img);
        oimg=(ImageView)findViewById(R.id.player2img);

        if(p1.equals("0")){
            ximg.setImageResource(R.drawable.o);
            oimg.setImageResource(R.drawable.x);
        }
    }


    @Override
    public void onClick(View v) {
        try {
            int seleccion = v.getId();
            switch (seleccion) {
                case R.id.button1:
                    if (b1.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b1.setText(p1);
                        } else {
                            b1.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button2:
                    if (b2.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b2.setText(p1);
                        } else {
                            b2.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button3:
                    if (b3.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b3.setText(p1);
                        } else {
                            b3.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button4:
                    if (b4.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b4.setText(p1);
                        } else {
                            b4.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button5:
                    if (b5.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b5.setText(p1);
                        } else {
                            b5.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button6:
                    if (b6.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b6.setText(p1);
                        } else {
                            b6.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button7:
                    if (b7.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b7.setText(p1);
                        } else {
                            b7.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button8:
                    if (b8.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b8.setText(p1);
                        } else {
                            b8.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.button9:
                    if (b9.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b9.setText(p1);
                        } else {
                            b9.setText(p2);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.rein:
                    rest();
                    break;
                case R.id.again:
                    rest();
                    break;
            }
        }catch (Exception e){
            Toast t = Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT);
            t.show();
        }
    }

    //FUNCION DE COMPARACION DE LOS CASOS
    public void comparation(){
        if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) &&(b1.getText().equals(p1)|| b1.getText().equals(p2))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b7.getText().equals(b5.getText()) && b7.getText().equals(b3.getText())&&(b7.getText().equals(p1)|| b7.getText().equals(p2))){
            String valor=b7.getText().toString();
            win(valor);
        }else if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())&&(b1.getText().equals(p1)|| b1.getText().equals(p2))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())&&(b4.getText().equals(p1)|| b4.getText().equals(p2))){
            String valor=b4.getText().toString();
            win(valor);
        }else if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())&&(b7.getText().equals(p1)|| b7.getText().equals(p2))){
            String valor=b7.getText().toString();
            win(valor);
        }else if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())&&(b1.getText().equals(p1)|| b1.getText().equals(p2))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())&&(b2.getText().equals(p1)|| b2.getText().equals(p2))){
            String valor=b2.getText().toString();
            win(valor);
        }else if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())&&(b3.getText().equals(p1)|| b3.getText().equals(p2))){
            String valor=b3.getText().toString();
            win(valor);
        }else {
            cont++;
        }
    }

    public void win(String v){
        String win="";
        if(v.equals(p1)){
            pl1++;
            win="PLAYER 1";
            String n=String.valueOf(pl1);
            winP1.setText(n);
        }else if(v.equals(p2)){
            pl2++;
            win="PLAYER 2";
            String n=String.valueOf(pl2);
            winP2.setText(n);
        }
        String msg="Gano " + win;
        Toast t = Toast.makeText(this,msg, Toast.LENGTH_SHORT);
        t.show();
        set();

    }

    public boolean comp(){
        if(cont==9){
            draw++;
            String emp="Empate";
            Toast t = Toast.makeText(this,emp, Toast.LENGTH_SHORT);
            t.show();
            String s= String.valueOf(draw);
            draws.setText(s);
            set();
            return true;
        }
        return false;
    }

    public void set(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        cont=0;

    }
    public void rest(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        winP1.setText("0");
        winP2.setText("0");
        draws.setText("0");
        cont=0;
        draw=0;
        pl1=0;
        pl2=0;
    }




}


