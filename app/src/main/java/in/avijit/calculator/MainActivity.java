package in.avijit.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String sign;
    private int first=0;
//    TODO: textview for show or taking result

    private TextView takeinput,answer;

//    TODO: Button for Number
    private Button one,two,three,four,five,six,seven,eight,nine,zero;
//    TODO: All functional button
    private Button clear,plus,minus,multiplication,division,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TODO: All functional button
        clear = findViewById(R.id.clear);
        plus = findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiplication=findViewById(R.id.multiplication);
        division=findViewById(R.id.division);
        equal=findViewById(R.id.equal);
//        TODO:cOLLECT ID FOR TEXT VIEW
        takeinput = findViewById(R.id.takeinput);
        answer = findViewById(R.id.answer);
//        TODO: COLLECTING ID FOR Button of number
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
//        TODO:Code for number button
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("1");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                    takeinput.append("1");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("1");
                    }
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("2");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("2");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("2");
                    }

                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("3");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("3");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("3");
                    }

                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("4");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("4");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("4");
                    }

                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("5");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("5");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("5");
                    }

                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("6");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("6");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("6");
                    }

                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("7");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("7");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("7");
                    }

                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("8");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("8");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("8");
                    }

                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("9");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("9");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("9");
                    }

                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(takeinput.getText().toString().equals("0")){
                    takeinput.setText("0");
                }
                else{
                    if(isNumeric(takeinput.getText().toString()))
                        takeinput.append("0");
                    else{
                        sign=takeinput.getText().toString();
                        takeinput.setText("0");
                    }

                }
            }
        });
//        TODO: CODE FOR FUNCTIONAL BUTTTON
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=0;
                takeinput.setText("0");
                answer.setText("0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first==0){
                    answer.setText(takeinput.getText().toString());
                    takeinput.setText("+");
                    sign="+";
                    first=1;
                }
                else{
                    if(isNumeric(takeinput.getText().toString())){
                        int a = Integer.parseInt(answer.getText().toString());
                        int b = Integer.parseInt(takeinput.getText().toString());
                        if(sign.equals("+")){
                            answer.setText(String.valueOf(a+b));
                            takeinput.setText("+");
                            sign="+";
                        }
                        else if(sign.equals("-")){
                            answer.setText(String.valueOf(a-b));
                            takeinput.setText("+");
                            sign="+";
                        }
                        else if(sign.equals("*")){
                            answer.setText(String.valueOf(a*b));
                            takeinput.setText("+");
                            sign="+";
                        }
                        else if(sign.equals("/")){
                            if(b==0){
                                b=1;
                            }
                            Toast toast=Toast.makeText(getApplicationContext(),"0 is replaced by 1 because denominator 0 is not allowed",Toast.LENGTH_SHORT);
                            toast.show();
                            answer.setText(String.valueOf(a-b));
                            takeinput.setText("+");
                            sign="+";
                        }
                    }
                    else{
                        sign="+";
                        takeinput.setText("+");
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first==0){
                    answer.setText(takeinput.getText().toString());
                    takeinput.setText("-");
                    sign="-";
                    first=1;
                }
                else{
                    if(isNumeric(takeinput.getText().toString())){
                        int a = Integer.parseInt(answer.getText().toString());
                        int b = Integer.parseInt(takeinput.getText().toString());
                        if(sign.equals("+")){
                            answer.setText(String.valueOf(a+b));
                            takeinput.setText("-");
                            sign="-";
                        }
                        else if(sign.equals("-")){
                            answer.setText(String.valueOf(a-b));
                            takeinput.setText("-");
                            sign="-";
                        }
                        else if(sign.equals("*")){
                            answer.setText(String.valueOf(a*b));
                            takeinput.setText("-");
                            sign="-";
                        }
                        else if(sign.equals("/")){
                            if(b==0){
                                b=1;
                            }
                            Toast toast=Toast.makeText(getApplicationContext(),"0 is replaced by 1 because denominator 0 is not allowed",Toast.LENGTH_SHORT);
                            toast.show();
                            answer.setText(String.valueOf(a/b));
                            takeinput.setText("-");
                            sign="-";
                        }
                    }
                    else{
                        sign="-";
                        takeinput.setText("-");
                    }
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first==0){
                    answer.setText(takeinput.getText().toString());
                    takeinput.setText("/");
                    sign="/";
                    first=1;
                }
                else{
                    if(isNumeric(takeinput.getText().toString())){
                        int a = Integer.parseInt(answer.getText().toString());
                        int b = Integer.parseInt(takeinput.getText().toString());
                        if(sign.equals("+")){
                            answer.setText(String.valueOf(a+b));
                            takeinput.setText("/");
                            sign="/";
                        }
                        else if(sign.equals("-")){
                            answer.setText(String.valueOf(a-b));
                            takeinput.setText("/");
                            sign="/";
                        }
                        else if(sign.equals("*")){
                            answer.setText(String.valueOf(a*b));
                            takeinput.setText("/");
                            sign="/";
                        }
                        else if(sign.equals("/")){
                            if(b==0){
                                b=1;
                            }
                            Toast toast=Toast.makeText(getApplicationContext(),"0 is replaced by 1 because denominator 0 is not allowed",Toast.LENGTH_SHORT);
                            toast.show();
                            answer.setText(String.valueOf(a/b));
                            takeinput.setText("/");
                            sign="/";
                        }
                    }
                    else{
                        sign="/";
                        takeinput.setText("/");
                    }
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first==0){
                    answer.setText(takeinput.getText().toString());
                    takeinput.setText("*");
                    sign="*";
                    first=1;
                }
                else{
                    if(isNumeric(takeinput.getText().toString())){
                        int a = Integer.parseInt(answer.getText().toString());
                        int b = Integer.parseInt(takeinput.getText().toString());
                        if(sign.equals("+")){
                            answer.setText(String.valueOf(a+b));
                            takeinput.setText("*");
                            sign="*";
                        }
                        else if(sign.equals("-")){
                            answer.setText(String.valueOf(a-b));
                            takeinput.setText("*");
                            sign="*";
                        }
                        else if(sign.equals("*")){
                            answer.setText(String.valueOf(a*b));
                            takeinput.setText("*");
                            sign="*";
                        }
                        else if(sign.equals("/")){
                            if(b==0){
                                b=1;
                            }
                            Toast toast=Toast.makeText(getApplicationContext(),"0 is replaced by 1 because denominator 0 is not allowed",Toast.LENGTH_SHORT);
                            toast.show();

                            answer.setText(String.valueOf(a/b));
                            takeinput.setText("*");
                            sign="*";
                        }
                    }
                    else{
                        sign="*";
                        takeinput.setText("*");
                    }
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(answer.getText().toString());
                int b = Integer.parseInt(takeinput.getText().toString());
                if(sign.equals("+")){
                    answer.setText(String.valueOf(a+b));
                    takeinput.setText("0");
                }
                else if(sign.equals("-")){
                    answer.setText(String.valueOf(a-b));
                    takeinput.setText("0");
                }
                else if(sign.equals("*")){
                    answer.setText(String.valueOf(a*b));
                    takeinput.setText("0");
                }
                else if (sign.equals("/")){
                    if(b==0){
                        b=1;
                    }
                    answer.setText(String.valueOf(a/b));
                    takeinput.setText("0");
                    Toast toast=Toast.makeText(getApplicationContext(),"0 is replaced by 1 because denominator 0 is not allowed",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });



    }
    public static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}