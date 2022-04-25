package com.example.sp20_bse_063_assign_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String key = "0063";
    private Button btnone;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneight;
    private Button btnnine;
    private Button btnzero;
    private Button btnback;
    private Button btnopen;
    private TextView pin;
    int counter = 0;
    @Override
    protected void onStart() {
        super.onStart();
        btnzero = findViewById(R.id.btn0);
        btnone = findViewById(R.id.btn1);
        btntwo = findViewById(R.id.btn2);
        btnthree = findViewById(R.id.btn3);
        btnfour = findViewById(R.id.btn4);
        btnfive = findViewById(R.id.btn5);
        btnsix = findViewById(R.id.btn6);
        btnseven = findViewById(R.id.btn7);
        btneight = findViewById(R.id.btn8);
        btnnine = findViewById(R.id.btn9);
        btnback = findViewById(R.id.btnBack);
        btnopen = findViewById(R.id.btnOpen);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "0");
            }
        });
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "1");
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "2");
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "3");
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "4");
            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "5");
            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "6");
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "7");
            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "8");
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pin.getText().toString().length()<4)
                    pin.setText(pin.getText().toString() + "9");
            }
        });
        btnback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txtValue = pin.getText().toString();
                if(txtValue.length() > 0)
                {

                    pin.setText(txtValue.substring(0, txtValue.length() - 1));
                }
            }
        });
        btnopen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String keyTextValue = pin.getText().toString();
                if(keyTextValue.equals(key))
                {
                    Intent intent = new Intent(MainActivity.this, SafeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    counter++;
                    if(counter>=3)
                    {
                        finish();
                    }
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void setupUIViews(){
        btnzero = (Button)findViewById(R.id.btn0);
        btnone = (Button)findViewById(R.id.btn1);
        btntwo = (Button)findViewById(R.id.btn2);
        btnthree = (Button)findViewById(R.id.btn3);
        btnfour = (Button)findViewById(R.id.btn4);
        btnfive = (Button)findViewById(R.id.btn5);
        btnsix = (Button)findViewById(R.id.btn6);
        btnseven = (Button)findViewById(R.id.btn7);
        btneight = (Button)findViewById(R.id.btn8);
        btnnine = (Button)findViewById(R.id.btn9);
        btnopen = (Button)findViewById(R.id.btnOpen);
        btnback = (Button)findViewById(R.id.btnBack);
        pin = (TextView)findViewById(R.id.text1);
    }
}