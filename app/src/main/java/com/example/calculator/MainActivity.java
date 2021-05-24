package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text;
        EditText n1,n2;
        Button button1,button3,button4,button5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hey..Good Morning!!!", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.text);
        text.setText ("Choose your operation..");
        //button = findViewById(R.id.button);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        //for Additon
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int sum = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                text.setText("The sum is" +sum);
            }
        });

        //For Multiplication
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int mul = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                text.setText("The multiplication is" +mul);
            }
        });

        //For Subtraction
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int sub = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                text.setText("The multiplication is" +sub);
            }
        });

        //For division
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float div = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
                text.setText("The multiplication is" +div);
            }
        });

    }
}