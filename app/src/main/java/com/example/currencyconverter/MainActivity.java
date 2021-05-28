package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert( View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        Double rupee=Double.parseDouble(editText.getText().toString());
        Log.i("Enter amount",editText.getText().toString());
        Double dollar=rupee * 70.0;
        Toast.makeText(MainActivity.this,"RS "+ Double.toString(dollar),Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
