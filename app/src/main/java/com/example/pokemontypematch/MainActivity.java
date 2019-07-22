package com.example.pokemontypematch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String computerType;

    public String randomType(){
        String type [] = {"fire", "water", "grass"};

        Random r=new Random();

        int randomNumber = r.nextInt(3);

        return type[randomNumber];
    }


    public void checkType(View view){
        EditText userType = (EditText)findViewById(R.id.UserTypeEditText);
        String sUserType = userType.getText().toString();

        if(computerType.equals("fire")){
            if(sUserType.equals("fire")){
                Toast.makeText(MainActivity.this, "Not very effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("water")){
                Toast.makeText(MainActivity.this, "Super-effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("grass")){
                Toast.makeText(MainActivity.this, "Not very effective", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        }
        if(computerType.equals("water")){
            if(sUserType.equals("fire")){
                Toast.makeText(MainActivity.this, "Not very effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("water")){
                Toast.makeText(MainActivity.this, "Not very effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("grass")){
                Toast.makeText(MainActivity.this, "Super-effective", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        }
        if(computerType.equals("grass")){
            if(sUserType.equals("fire")){
                Toast.makeText(MainActivity.this, "Super-effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("water")){
                Toast.makeText(MainActivity.this, "Super-effective", Toast.LENGTH_SHORT).show();
            }
            else if(sUserType.equals("grass")){
                Toast.makeText(MainActivity.this, "Not very effective", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        }

        //Toast.makeText(MainActivity.this, sUserType, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView type = (TextView) findViewById(R.id.TypeTextView);
        computerType = randomType();
        type.setText(computerType);
    }
}
