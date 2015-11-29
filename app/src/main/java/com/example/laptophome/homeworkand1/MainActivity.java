package com.example.laptophome.homeworkand1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
private int n=r.nextInt(1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e=(EditText)findViewById(R.id.editText);
        TextView t=(TextView)findViewById(R.id.textView);
        TextView b=(TextView)findViewById(R.id.button);
    }
    public void press(View view){
        TextView b1=(TextView)findViewById(R.id.button2);
        n=r.nextInt(1000);
    }

    public void click(View view)
    {
        EditText e=(EditText)findViewById(R.id.editText);
        TextView t=(TextView)findViewById(R.id.textView);
        int n1=Integer.parseInt(e.getText().toString());

        if(n==n1) {
            t.setText("correct answer");


        }
       else if (n-n1<5&&n-n1>-5)
        {
            t.setText("closer answer");
        }

        else if (n1>n+5) {
            t.setText("greater answer");
        }
        else if (n1<n-5)
        {
            t.setText("smaller answer");
        }


    }
}
