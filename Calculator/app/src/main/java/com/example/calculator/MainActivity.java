package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView Result;
    Button one,number2,number3,number4,number5,number6,number7,number8,number9,point,add,sub,mul,div,equal,clearbutton,equalbutton;
    String num1="",num2="", oprator="";
    double res;
    boolean condition=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView) findViewById(R.id.result);
        one=  (Button) findViewById(R.id.One);
        number2=(Button) findViewById(R.id.Two);
        clearbutton= (Button) findViewById(R.id.Clear);
        number3=(Button) findViewById(R.id.Three);
        number4=(Button) findViewById(R.id.Four);
        number5=(Button) findViewById(R.id.Five);
        number6=(Button) findViewById(R.id.Siz);
        number7=(Button) findViewById(R.id.Seven);
        number8=(Button) findViewById(R.id.Eight);
        number9=(Button) findViewById(R.id.Nine);
        point=(Button) findViewById(R.id.Point);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mult);
        div=(Button) findViewById(R.id.Dev);
        equalbutton=(Button) findViewById(R.id.Equal);


        Result.setText("0");

    }

    public void inputcollection(View view) {

        Button b = (Button)view;

        if(condition)
        {
            num1+=b.getText();
            Result.setText(num1);
        }
        else
        {
            num2+=b.getText();
            Result.setText(num2);
        }

    }
    public void oprator(View view)
    {
        Button b = (Button)view;
        if(clearbutton.isPressed())
        {
            num1=" ";
            num2=" ";
            res=0;
            Result.setText(Double.toString(res).toString());
        }
        if(add.isPressed())
        {
            oprator="add";
            condition=false;
        }
        if(mul.isPressed())
        {
            oprator="mul";
            condition=false;
        }
        if(div.isPressed())
        {
            oprator="div";
            condition=false;
        }
        if(sub.isPressed())
        {
            oprator="sub";
            condition=false;
        }
        if(equalbutton.isPressed())
        {
            resultgenrate();
        }

    }

    private void resultgenrate() {
        if(oprator=="add"){
            res=Double.parseDouble((num1))+Double.parseDouble(num2);
            Result.setText(Double.toString(res).toString());
        }
        if(oprator=="mul")
        {
            res=Double.parseDouble((num1))*Double.parseDouble(num2);
            Result.setText(Double.toString(res).toString());
        }
        if(oprator=="sub")
        {
            res=Double.parseDouble(num1)-Double.parseDouble(num2);
            Result.setText(Double.toString(res).toString());
        }
        if(oprator=="div"){
            if(Integer.parseInt(num1)>0)
            {
                res=Double.parseDouble(num1)/Double.parseDouble(num2);
                Result.setText(Double.toString(res).toString());
            }
            else{
                Result.setText("Infinity ");
            }
        }

    }
}