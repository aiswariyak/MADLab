package com.example.ex14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_first;
    Intent my_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_first=findViewById(R.id.bt_next);
        bt_first.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                my_intent=new Intent(MainActivity.this,Main2Activity.class);
                my_intent.putExtra("value1","Hello!!!!!!!!!!!");
                startActivity(my_intent);
            }

        });
    }
}
