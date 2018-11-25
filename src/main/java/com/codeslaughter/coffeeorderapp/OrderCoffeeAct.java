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
        TextView[] outputs = new TextView[] {findViewById(R.id.textView),findViewById(R.id.textView3),findViewById(R.id.textView4),findViewById(R.id.textView5),findViewById(R.id.textView6),findViewById(R.id.textView11),findViewById(R.id.textView12)};
        User user = MainActivity.user;
        Integer[] Costs = new Integer[5];
        Integer TCost = 0;
        String outputStr = user.Name + "'s order is:";
        outputs[0].setText(outputStr);
        outputStr = "";
        for (int i = 0;i<5;i++){
            coffee current = User.coffees[i];
            Costs[i] = current.TCost;
            TCost += Costs[i];
            outputStr += current.Amount.toString() + " " + current.Name;
            if(current.Amount>1){
                outputStr += "s";
            }
            outputStr += " costing £" + current.TCost.toString();
            if(i == 3){
                outputStr += " and";
            }else if (i < 3){
                outputStr += ",";
            }
            outputs[i+1].setText(outputStr);
            outputStr= "";
        }
        outputStr += "Which totals to £" + TCost.toString();
        outputs[6].setText(outputStr);
    }

    public void button2OnClick(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
