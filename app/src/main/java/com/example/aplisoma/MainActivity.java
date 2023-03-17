package com.example.aplisoma;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
Button btsomar,btdiminuir,btdividir,btmultiplicacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btsomar = findViewById(R.id.btsomar);
        btdiminuir = findViewById(R.id.btdiminuir);
        btdividir = findViewById(R.id.btdividir);
        btmultiplicacao = findViewById(R.id.btmultiplicacao);


        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num3 = Double.parseDouble(num1.getText().toString());
                double num = Double.parseDouble(num2.getText().toString());

                double soma = num3 + num;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("*****Resultado soma");
                dialogo.setMessage("a soma é:" +soma);
                dialogo.setNeutralButton("ok",null);
                dialogo.show();

            }
        });
        btdiminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num3 = Double.parseDouble(num1.getText().toString());
                double num = Double.parseDouble(num2.getText().toString());

                double subtrair = num3 - num;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("*****Resultado da Subtração");
                dialogo.setMessage("a Subtração é:" +subtrair);
                dialogo.setNeutralButton("ok",null);
                dialogo.show();
            }
        });
        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num3 = Double.parseDouble(num1.getText().toString());
                double num = Double.parseDouble(num2.getText().toString());

                double dividir = num3 / num;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("*****Resultado da Divisão");
                dialogo.setMessage("a Divisão é:" +dividir);
                dialogo.setNeutralButton("ok",null);
                dialogo.show();
            }
        });
            btmultiplicacao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double num3 = Double.parseDouble(num1.getText().toString());
                    double num = Double.parseDouble(num2.getText().toString());

                    double multiplicar = num3 * num;

                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("*****Resultado da Multiplicação");
                    dialogo.setMessage("a Multiplicação é:" +multiplicar);
                    dialogo.setNeutralButton("ok",null);
                    dialogo.show();
                }
            });
    }
}