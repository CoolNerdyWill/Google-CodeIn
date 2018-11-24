package com.codeslaughter.coffeeorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String Unam;
    public static String Cnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v){
        Intent intent = new Intent(this,OrderCoffeeAct.class);
        startActivity(intent);
        //gets the text from the name field
        Unam = (((EditText)(findViewById(R.id.editText))).getText()).toString();

        //gets the number from the name field
        Cnum = (((EditText)(findViewById(R.id.editText2))).getText()).toString();
    }
}
