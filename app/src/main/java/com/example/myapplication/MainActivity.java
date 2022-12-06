package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText sayi1;
    EditText sayi2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.kontrol);
        sayi1 = findViewById(R.id.sayi1);
        sayi2 = findViewById(R.id.sayi2);
    }
    public  void  kontrol(View view){
        int sayi_1 = Integer.parseInt(sayi1.getText().toString());
        int sayi_2 = Integer.parseInt(sayi2.getText().toString());

        if (sayi_1>sayi_2){
            Toast.makeText(MainActivity.this,"1.sayi daha buyuk.",Toast.LENGTH_LONG).show();
        }
        if (sayi_2>sayi_1){
            Toast.makeText(MainActivity.this,"2.sayi daha buyuk.",Toast.LENGTH_LONG).show();
        }
        if (sayi_2==sayi_1){
            Toast.makeText(MainActivity.this,"iki sayi birbirine esit.",Toast.LENGTH_LONG).show();
        }
    }

}