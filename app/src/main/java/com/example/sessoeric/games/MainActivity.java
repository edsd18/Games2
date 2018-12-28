package com.example.sessoeric.games;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et_min, et_max;
    Button btnGenerate;
    TextView result;
    Random r;
    Integer  output;
    String TempsMin,TempsMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_max = (EditText) findViewById(R.id.txt_max);
        btnGenerate = (Button) findViewById(R.id.btnGenerate);
        et_min=(EditText)findViewById (R.id.txt_min);

        result= (TextView) findViewById(R.id.result);



        btnGenerate.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                TempsMax = et_max.getText ().toString ();
                TempsMin = et_min.getText ().toString ();
                Log.i ("Debuger", "click me");
                Integer min = Integer.valueOf(TempsMin);
                Integer max =Integer.valueOf (TempsMax);
                if (max > min) {
                    output = min + (int) (Math.random ()*(max-min));
                    Toast.makeText (getApplicationContext (),"the search value is " + output,Toast.LENGTH_LONG)
                            .show ();



                }
            }



            });


        }}