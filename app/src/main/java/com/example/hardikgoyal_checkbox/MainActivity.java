package com.example.hardikgoyal_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        c7 = findViewById(R.id.checkBox7);
        c8 = findViewById(R.id.checkBox8);
        c9 = findViewById(R.id.checkBox9);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);

        c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    c1.setChecked(true);
                    c2.setChecked(true);
                    c3.setChecked(true);
                    c4.setChecked(true);
                    c5.setChecked(true);
                    c6.setChecked(true);
                    c7.setChecked(true);
                    c8.setChecked(true);
                }
            else {
                    c1.setChecked(false);
                    c2.setChecked(false);
                    c3.setChecked(false);
                    c4.setChecked(false);
                    c5.setChecked(false);
                    c6.setChecked(false);
                    c7.setChecked(false);
                    c8.setChecked(false);
            }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1="";
                if(c1.isChecked())
                    s1 = s1+ "" +c1.getText();

                if(c2.isChecked())
                    s1 = s1+ " ," +c2.getText();

                if(c3.isChecked())
                    s1 = s1+ " ," +c3.getText();

                if(c4.isChecked())
                    s1 = s1+ " ," +c4.getText();

                if(c5.isChecked())
                    s1 = s1+ " ," +c5.getText();

                if(c6.isChecked())
                    s1 = s1+ " ," +c6.getText();

                if(c7.isChecked())
                    s1 = s1+ " ," +c7.getText();

                if(c8.isChecked())
                    s1 = s1+ " ," +c8.getText();

                t1.setText(s1 + " you know.");
            }
        });
    }
}