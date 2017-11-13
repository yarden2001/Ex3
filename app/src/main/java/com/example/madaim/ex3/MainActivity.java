package com.example.madaim.ex3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button plus;
    public Button minus;
    public Button mul;
    public Button div;
    public TextView result;
    public EditText first;
    public EditText seccond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ziki();
    }

    private void ziki() {
        plus=(Button)findViewById(R.id.btPlus);
        minus=(Button)findViewById(R.id.btMinus);
        div=(Button)findViewById(R.id.btDiv1);
        mul=(Button)findViewById(R.id.btMulti);
        first=(EditText)findViewById(R.id.editText);
        seccond=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView3);
        plus.setOnClickListener((View.OnClickListener) this);
        minus.setOnClickListener((View.OnClickListener) this);
        div.setOnClickListener((View.OnClickListener) this);
        mul.setOnClickListener((View.OnClickListener) this);



    }

    public void onClick(View view){
        String num1 = first.getText().toString();
        String num2 = seccond.getText().toString();
        switch (view.getId()) {
            case R.id.btPlus:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btMulti:
                int multiply=Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multiply));
                break;
            case R.id.btMinus:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btDiv1:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("cant devide!");
                }
                break;



        }

    }
}
