package com.thenewboston.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    float first_num;
    float second_num;

    EditText returnVal;

    boolean addition = false;
    boolean subtraction = false;
    boolean division = false;
    boolean multiplication = false;

    Button addButton, subButton, divButton, mulButton, eq;

    Button nine, eight, seven, six, five, four, three, two, one, zero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button inputButton = (Button) findViewById(R.id.input);
        // Button backspace = (Button) findViewById(R.id.backspace);

        Button buttonClear = (Button) findViewById(R.id.clear);
        Button buttonDot = (Button) findViewById(R.id.dot);
        Button eq = (Button) findViewById(R.id.eq);

        Button addButton = (Button) findViewById(R.id.add);
        Button subButton = (Button) findViewById(R.id.sub);
        Button divButton = (Button) findViewById(R.id.div);
        Button mulButton = (Button) findViewById(R.id.mul);

        returnVal = (EditText) findViewById(R.id.returnVal);

        nine = (Button) findViewById(R.id.nine);
        eight = (Button) findViewById(R.id.eight);
        seven = (Button) findViewById(R.id.seven);
        six = (Button) findViewById(R.id.six);
        five = (Button) findViewById(R.id.five);
        four = (Button) findViewById(R.id.four);
        three = (Button) findViewById(R.id.three);
        two = (Button) findViewById(R.id.two);
        one = (Button) findViewById(R.id.one);
        zero = (Button) findViewById(R.id.zero);

        nine.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"9");
                    }
                }
        );

        eight.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"8");
                    }
                }
        );
        seven.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"7");
                    }
                }
        );
        six.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"6");
                    }
                }
        );
        five.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"5");
                    }
                }
        );
        four.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"4");
                    }
                }
        );

        three.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"3");
                    }
                }
        );
        two.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"2");
                    }
                }
        );
        one.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"1");
                    }
                }
        );
        zero.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        returnVal.setText(returnVal.getText()+"0");
                    }
                }
        );


        addButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (returnVal == null){
                            returnVal.setText("");
                        }else {
                            first_num = Float.parseFloat(returnVal.getText() + "");
                            addition = true;
                            returnVal.setText(null);
                        }
                    }
                }
        );

        subButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        first_num = Float.parseFloat(returnVal.getText() + "");
                        subtraction = true;
                        returnVal.setText(null);
                    }
                }
        );
        divButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        first_num = Float.parseFloat(returnVal.getText() + "");
                        division = true;
                        returnVal.setText(null);

                    }
                }
        );
        mulButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        first_num = Float.parseFloat(returnVal.getText() + "");
                        multiplication = true;
                        returnVal.setText(null);
                    }
                }
        );

        eq.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        second_num = Float.parseFloat(returnVal.getText() + "");

                        if(addition = true){
                            addition = false;
                            returnVal.setText(first_num + second_num + "");
                        }
                        if (subtraction = true){
                            subtraction = false;
                            returnVal.setText(first_num - second_num + "");
                        }
                        if (division = true){
                            division = false;
                            returnVal.setText(first_num / second_num + "");
                        }
                        if (multiplication = true){
                            multiplication = false;
                            returnVal.setText(first_num * second_num + "");
                        }

                    }
                }

        );
        buttonClear.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnVal.setText("");
            }
        });

        buttonDot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnVal.setText(returnVal.getText()+".");
            }
        });


    }
}
