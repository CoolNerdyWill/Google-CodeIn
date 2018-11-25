package com.codeslaughter.coffeeorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddCoffeeAct extends AppCompatActivity {

    EditText[] Edits;
    TextView[] Texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_coffee);
        Texts = new TextView[] {findViewById(R.id.textView2),findViewById(R.id.textView7),findViewById(R.id.textView8),findViewById(R.id.textView9),findViewById(R.id.textView10)};
        Edits = new EditText[] {findViewById(R.id.editText2),findViewById(R.id.editText7),findViewById(R.id.editText8),findViewById(R.id.editText9),findViewById(R.id.editText10)};
        for (int i=0;i<5;i++) {
            coffee current = User.coffees[i];
            Texts[i].setText(current.Name + " costs £" + (current.Cost).toString());
            Edits[i].setHint("amount of " + current.Name + "s");
        }
    }

    public void buttonSubmitOrder(View v){
        for(int i = 0;i<5;i++){
            coffee current = User.coffees[i];
            current.Amount = Integer.parseInt(Edits[i].getText().toString());
            current.TCost = current.Amount * current.Cost;
        }
        Intent intent = new Intent(this,OrderCoffeeAct.class);
        startActivity(intent);
    }
}
