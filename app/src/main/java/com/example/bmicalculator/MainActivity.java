package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Converter();
    }

    public void Converter(){
        Button btn=findViewById(R.id.calculatebtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText=findViewById(R.id.editText);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);
                TextView textView=findViewById(R.id.result);

                float FtoI=Float.parseFloat(editText2.getText().toString());
                float Feet_To_Inches=FtoI*12;

                int inches= (int) (Feet_To_Inches+Float.parseFloat(editText3.getText().toString()));

                float ItoCM= (float) (inches*2.54);

                float CMtoM=ItoCM/100;

                float weight=Float.parseFloat(editText.getText().toString());
                float result=weight/(CMtoM*CMtoM);

                textView.setText("Your BMI is "+ String.valueOf(result));






            }
        });



}
}