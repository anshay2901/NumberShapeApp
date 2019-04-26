package com.anshaysingh.numbershapeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class Number {

        int num;

        public boolean sNumTest(){
            double root = Math.sqrt(num);
            if(root == Math.floor(root)) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean tNumTest() {

            int x = 1;
            int tnum = 1;

            while (tnum < num) {

                ++x;
                tnum += x;
            }

            if(tnum == num)
                return true;
            else
                return false;
        }
    }
    public void toasting(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void onClick1(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        int num1 = Integer.parseInt(editText.getText().toString());
        Number n = new Number();
        n.num = num1;

            if (n.tNumTest() == true && (n.sNumTest() == false)) {
                toasting("The number is a Triangular number.");
            } else if (n.sNumTest() == true && (n.tNumTest() == false)) {
                toasting("The number is a Square number.");
            } else if ((n.tNumTest() == true) && (n.sNumTest() == true)) {
                toasting("The number is a Square numer and a Triangular number.");
            } else
                toasting("The number is neither a Square numer nor a Triangular number.");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
