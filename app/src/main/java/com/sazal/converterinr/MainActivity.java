package com.sazal.converterinr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void button(View view){
        EditText dol= findViewById(R.id.dollar);
        String dollars=dol.getText().toString();
        Double doubdollars=Double.parseDouble(dollars);
        Double dINR=(71.72*doubdollars);
        String toasttxt= "=" + dINR.toString() + "$";
        Toast.makeText(this, toasttxt, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}