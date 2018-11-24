package com.codeslaughter.coffeeorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.Menu;

public class OrderCoffeeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_coffee);
        TextView output = findViewById(R.id.textView);
        Integer Cost = Integer.parseInt(MainActivity.Cnum) * 2;
        String outputStr = MainActivity.Unam + "'s order is " + MainActivity.Cnum + " coffees totaling to £" + Cost.toString();
        output.setText(outputStr);
    }

    public void button2OnClick(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
