package com.example.joelcaballero.x0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerVsComputer extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,rest,again;
    int cont=0,draw=0,pl1=0,pl2=0;
    TextView winP1,winP2,draws;
    String player ="X", computer ="O";
    ImageView ximg,oimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_vs_computer);

        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();

        if (bundle!=null){
            player=getIntent().getStringExtra("pl1");
            computer=getIntent().getStringExtra("pl2");
        }

        //ASIGNACION DE VALORES A CADA VARIABLE
        b1=(Button)findViewById(R.id.buttonc1);
        b2=(Button)findViewById(R.id.buttonc2);
        b3=(Button)findViewById(R.id.buttonc3);
        b4=(Button)findViewById(R.id.buttonc4);
        b5=(Button)findViewById(R.id.buttonc5);
        b6=(Button)findViewById(R.id.buttonc6);
        b7=(Button)findViewById(R.id.buttonc7);
        b8=(Button)findViewById(R.id.buttonc8);
        b9=(Button)findViewById(R.id.buttonc9);
        rest=(Button)findViewById(R.id.reinici);
        again=(Button)findViewById(R.id.againc);
        winP1=(TextView)findViewById(R.id.wincpl1);
        winP2=(TextView)findViewById(R.id.wincpl2);
        draws=(TextView)findViewById(R.id.cdraw);
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
        ximg=(ImageView)findViewById(R.id.player1imgpc);
        oimg=(ImageView)findViewById(R.id.player2imgpc);
        if(player.equals("0")){
            ximg.setImageResource(R.drawable.o);
            oimg.setImageResource(R.drawable.x);
        }



    }

    @Override
    public void onClick(View v) {
        try {
            int seleccion = v.getId();
            switch (seleccion) {
                case R.id.buttonc1:
                    if (b1.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b1.setText(player);
                        } else {
                            b1.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc2:
                    if (b2.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b2.setText(player);
                        } else {
                            b2.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc3:
                    if (b3.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b3.setText(player);
                        } else {
                            b3.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc4:
                    if (b4.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b4.setText(player);
                        } else {
                            b4.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc5:
                    if (b5.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b5.setText(player);
                        } else {
                            b5.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc6:
                    if (b6.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b6.setText(player);
                        } else {
                            b6.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc7:
                    if (b7.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b7.setText(player);
                        } else {
                            b7.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc8:
                    if (b8.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b8.setText(player);
                        } else {
                            b8.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.buttonc9:
                    if (b9.length() == 0) {
                        if (cont == 0 || cont % 2 == 0) {
                            b9.setText(player);
                        } else {
                            b9.setText(computer);
                        }
                        comparation();
                        comp();
                    }
                    break;
                case R.id.reinici:
                    rest();
                    break;
                case R.id.againc:
                    rest();
                    break;
            }
        }catch (Exception e){
            Toast t = Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT);
            t.show();
        }

    }


public void comparation(){
    int n=0;
    comparation(n);
}

    //FUNCION DE COMPARACION DE LOS CASOS
    public  void comparation(int n){
        if(n<2){
        if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) &&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
            return;
        }else if(b7.getText().equals(b5.getText()) && b7.getText().equals(b3.getText())&&(b7.getText().equals(player)|| b7.getText().equals(computer))){
            String valor=b7.getText().toString();
            win(valor);
            return;
        }else if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())&&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
            return;
        }else if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())&&(b4.getText().equals(player)|| b4.getText().equals(computer))){
            String valor=b4.getText().toString();
            win(valor);
            return;
        }else if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())&&(b7.getText().equals(player)|| b7.getText().equals(computer))){
            String valor=b7.getText().toString();
            win(valor);
            return;
        }else if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())&&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
            return;
        }else if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())&&(b2.getText().equals(player)|| b2.getText().equals(computer))){
            String valor=b2.getText().toString();
            win(valor);
            return;
        }else if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())&&(b3.getText().equals(player)|| b3.getText().equals(computer))){
            String valor=b3.getText().toString();
            win(valor);
            return;
        }else {
            if(n==0){
            turnOfComputer();
            cont++;
            }
            comparation(n+1);
            }
        }
    }

    public void win(String v){
        String win="";
        if(v.equals(player)){
            pl1++;
            win="PLAYER 1";
            String n=String.valueOf(pl1);
            winP1.setText(n);
        }else if(v.equals(computer)){
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
        if(cont>=9){
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






    public void turnOfComputer(){
        ////////////////////////GANADOR??????//////////////////////
        if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) &&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b7.getText().equals(b5.getText()) && b7.getText().equals(b3.getText())&&(b7.getText().equals(player)|| b7.getText().equals(computer))){
            String valor=b7.getText().toString();
            win(valor);
        }else if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())&&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())&&(b4.getText().equals(player)|| b4.getText().equals(computer))){
            String valor=b4.getText().toString();
            win(valor);
        }else if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())&&(b7.getText().equals(player)|| b7.getText().equals(computer))){
            String valor=b7.getText().toString();
            win(valor);
        }else if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())&&(b1.getText().equals(player)|| b1.getText().equals(computer))){
            String valor=b1.getText().toString();
            win(valor);
        }else if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())&&(b2.getText().equals(player)|| b2.getText().equals(computer))){
            String valor=b2.getText().toString();
            win(valor);
        }else if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())&&(b3.getText().equals(player)|| b3.getText().equals(computer))){
            String valor=b3.getText().toString();
            win(valor);
        }else {
            cont++;
        }

//PRIMER SELECCION

        if(b1.getText().equals(player) && cont==1){
            b7.setText(computer);
            return;
        }else if(b2.getText().equals(player) && cont==1){
            b8.setText(computer);
            return;
        } else if(b3.getText().equals(player) && cont==1){
            b9.setText(computer);
            return;
        }else if(b4.getText().equals(player) && cont==1){
            b1.setText(computer);
            return;
        }else if(b5.getText().equals(player) && cont==1){
            b2.setText(computer);
            return;
        }else if(b6.getText().equals(player) && cont==1){
            b3.setText(computer);
            return;
        }else if(b7.getText().equals(player) && cont==1){
            b4.setText(computer);
            return;
        } else if(b8.getText().equals(player) && cont==1){
            b5.setText(computer);
            return;
        }else if(b9.getText().equals(player) && cont==1){
            b6.setText(computer);
            return;
        }

///////////////////////HORIZONTALMENTE/////////////////////////////


//LINEA HORIZONTAL #1(1,2,3)


        else if(b1.getText().equals(player) && b2.getText().equals(player) && (!b3.getText().equals(computer)&& !b3.getText().equals(player))){
            b3.setText(computer);
            return;
        }else if(b1.getText().equals(player) && b3.getText().equals(player) && (!b2.getText().equals(computer)&& !b2.getText().equals(player))){
            b2.setText(computer);
            return;
        }else if(b2.getText().equals(player) && b3.getText().equals(player) && (!b1.getText().equals(computer)&& !b1.getText().equals(player))){
            b1.setText(computer);
            return;
        }

//LINEA HORIZONTAL #2(4,5,6)


        else if(b4.getText().equals(player) && b5.getText().equals(player) && (!b6.getText().equals(computer)&& !b6.getText().equals(player))){
            b6.setText(computer);
            return;
        }else if(b4.getText().equals(player) && b6.getText().equals(player) && (!b5.getText().equals(computer)&& !b5.getText().equals(player))){
            b5.setText(computer);
            return;
        }else if(b5.getText().equals(player) && b6.getText().equals(player) && (!b4.getText().equals(computer)&& !b4.getText().equals(player))){
            b4.setText(computer);
            return;
        }

//LINEA HORIZONTAL #3(7,8,9)

        else if(b7.getText().equals(player) && b8.getText().equals(player) && (!b9.getText().equals(computer)&& !b9.getText().equals(player))){
            b9.setText(computer);
            return;
        }else if(b7.getText().equals(player) && b9.getText().equals(player) && (!b8.getText().equals(computer)&& !b8.getText().equals(player))){
            b8.setText(computer);
            return;
        }else if(b8.getText().equals(player) && b9.getText().equals(player) && (!b7.getText().equals(computer)&& !b7.getText().equals(player))){
            b7.setText(computer);
            return;
        }

///////////////////////VERTICALMENTE/////////////////////////////


//LINEA VERTICAL #1(1,4,7)


        else if(b1.getText().equals(player) && b4.getText().equals(player) && (!b7.getText().equals(computer)&& !b7.getText().equals(player))){
            b7.setText(computer);
            return;
        }else if(b1.getText().equals(player) && b7.getText().equals(player) && (!b4.getText().equals(computer)&& !b4.getText().equals(player))){
            b4.setText(computer);
            return;
        }else if(b4.getText().equals(player) && b7.getText().equals(player) && (!b1.getText().equals(computer)&& !b1.getText().equals(player))){
            b1.setText(computer);
            return;
        }

//LINEA VERTICAL #2(2,5,8)

        else if(b2.getText().equals(player) && b5.getText().equals(player) && (b8.getText().equals(computer) && b8.getText().equals(player))){
            b8.setText(computer);
            return;
        }else if(b2.getText().equals(player) && b8.getText().equals(player) && (!b5.getText().equals(computer)&& !b5.getText().equals(player))){
            b5.setText(computer);
            return;
        }else if(b5.getText().equals(player) && b8.getText().equals(player) && (!b2.getText().equals(computer)&& !b2.getText().equals(player))){
            b2.setText(computer);
            return;
        }

//LINEA HORIZONTAL #3(3,6,9)

        else if(b3.getText().equals(player) && b6.getText().equals(player) && (!b9.getText().equals(computer)&& !b9.getText().equals(player))){
            b9.setText(computer);
            return;
        }else if(b3.getText().equals(player) && b9.getText().equals(player) && (!b6.getText().equals(computer)&& !b6.getText().equals(player))){
            b6.setText(computer);
            return;
        }else if(b6.getText().equals(player) && b9.getText().equals(player) && (!b3.getText().equals(computer)&& !b3.getText().equals(player))){
            b3.setText(computer);
            return;
        }

///////////////////////DIAGONALMENTE/////////////////////////////

/////1-5-9//////////

        else if(b1.getText().equals(player) && b5.getText().equals(player) && (!b9.getText().equals(computer)&& !b9.getText().equals(player))){
            b9.setText(computer);
            return;
        }else if(b1.getText().equals(player) && b9.getText().equals(player) && (!b5.getText().equals(computer)&& !b5.getText().equals(player))){
            b5.setText(computer);
            return;
        }else if(b5.getText().equals(player) && b9.getText().equals(player) && (!b1.getText().equals(computer)&& !b1.getText().equals(player))) {
            b1.setText(computer);
            return;
        }
/////////3-5-7//////////

else if(b3.getText().equals(player) && b5.getText().equals(player) && (!b7.getText().equals(computer)&& !b7.getText().equals(player))){
                b7.setText(computer);
                return;
            }else if(b3.getText().equals(player) && b7.getText().equals(player) && (!b5.getText().equals(computer)&& !b5.getText().equals(player))){
                b5.setText(computer);
                return;
            }else if(b5.getText().equals(player) && b7.getText().equals(player) && (!b3.getText().equals(computer)&& !b3.getText().equals(player))) {
                b3.setText(computer);
                return;
            }



//////////////////////////////////else/////////////////////////////

                else if(!b1.getText().equals(player)&& !b1.getText().equals(computer)){
                    b1.setText(computer);
                    return;
                }else if(!b2.getText().equals(player)&& !b2.getText().equals(computer)){
                    b2.setText(computer);
                    return;
                }else if(!b3.getText().equals(player)&& !b3.getText().equals(computer)){
                    b3.setText(computer);
                    return;
                }else if(!b4.getText().equals(player)&& !b4.getText().equals(computer)){
                    b4.setText(computer);
                    return;
                }else if(!b5.getText().equals(player)&& !b5.getText().equals(computer)){
                    b5.setText(computer);
                    return;
                }else if(!b6.getText().equals(player)&& !b6.getText().equals(computer)){
                    b6.setText(computer);
                    return;
                }else if(!b7.getText().equals(player)&& !b7.getText().equals(computer)){
                    b7.setText(computer);
                    return;
                }else if(!b8.getText().equals(player)&& !b8.getText().equals(computer)){
                    b8.setText(computer);
                    return;
                }else if(!b9.getText().equals(player)&& !b9.getText().equals(computer)){
                    b9.setText(computer);
                    return;
                }
            }
}
