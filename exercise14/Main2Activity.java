package com.example.ex14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras=getIntent().getExtras();
        String v1=extras.getString("value1");
        t=findViewById(R.id.textview2);
        t.setText(t.getText()+" "+v1);
    }
}
