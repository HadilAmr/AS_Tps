package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Fragment {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,type,comma,
            add,sous,mult,div,inv,square,sqrt,div_equ,equ,
            CE,C,del,MC,MR,Mplus,Mmoins,MS,M;
    TextView aff1,aff2;
    boolean isResultDisplayed = false;
    boolean operatorPressed = false;
    String pressed= "";
    int equal_pressed=0;
    TextView msg;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b0 = view.findViewById(R.id.button0);
        b1 = view.findViewById(R.id.button1);
        b2 = view.findViewById(R.id.button2);
        b3 = view.findViewById(R.id.button3);
        b4 = view.findViewById(R.id.button4);
        b5 = view.findViewById(R.id.button5);
        b6 = view.findViewById(R.id.button6);
        b7 = view.findViewById(R.id.button7);
        b8 = view.findViewById(R.id.button8);
        b9 = view.findViewById(R.id.button9);
        type = view.findViewById(R.id.type);
        comma = view.findViewById(R.id.comma);
        add = view.findViewById(R.id.add);
        sous = view.findViewById(R.id.sous);
        mult = view.findViewById(R.id.mult);
        div = view. findViewById(R.id.div);
        inv = view.findViewById(R.id.inv);
        square = view.findViewById(R.id.square);
        sqrt = view.findViewById(R.id.Sqrt);
        div_equ = view.findViewById(R.id.div_equ);
        CE = view.findViewById(R.id.CE);
        C = view.findViewById(R.id.C);
        del = view. findViewById(R.id.del);
        MC = view.findViewById(R.id.MC);
        MR = view.findViewById(R.id.MR);
        Mplus = view. findViewById(R.id.Mplus);
        Mmoins = view.findViewById(R.id.Mmoins);
        MS = view.findViewById(R.id.MS);
        M = view.findViewById(R.id.M);
        equ=view. findViewById(R.id.equ);
        aff1 = view. findViewById(R.id.Afficheur1);
        aff2 = view.findViewById(R.id.Afficheur2);
        msg= view.findViewById(R.id.Msg);
        int maxLength = 15;
        InputFilter[] filters = new InputFilter[] { new InputFilter.LengthFilter(maxLength) };
        aff1.setFilters(filters);
        aff2.setFilters(filters);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                Double d = Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "0");
                }
                else{if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                    // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                    if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff2.setText("");
                        aff1.setText("0");}
                    else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff1.setText("0");
                    }
                    else{
                        aff1.setText("0");
                    } // Réinitialisez le statut de l'opérateur
                } else if(!(pressed.equals("del"))) {

                    // Sinon, ajoutez le chiffre à la suite du contenu actuel
                    aff1.setText(contenu1 + "0");
                }
                else{
                    aff1.setText("0");
                }}
                pressed="zero";
                operatorPressed = false;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                isResultDisplayed = true;
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                        aff1.setText(contenu1 + "1");
                }
                else{
                if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                    // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                    if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff2.setText("");
                        aff1.setText("1");
                    }
                    else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff1.setText("1");
                    }
                    else{
                    aff1.setText("1");}// Réinitialisez le statut de l'opérateur
                } else if(!(pressed.equals("del"))) {

                    // Sinon, ajoutez le chiffre à la suite du contenu actuel
                    aff1.setText(contenu1 + "1");
                }
                else{
                    aff1.setText("1");
                }}
                pressed="un";
                operatorPressed = false;
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                isResultDisplayed = true;
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "2");
                }
                else{
                if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                    // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                    if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff2.setText("");
                        aff1.setText("2");
                    }
                    else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                        aff1.setText("2");
                    }
                    else{
                    aff1.setText("2");
                    }
                    // Réinitialisez le statut de l'opérateur
                } else if(!(pressed.equals("del"))) {

                    // Sinon, ajoutez le chiffre à la suite du contenu actuel
                    aff1.setText(contenu1 + "2");
                }
                else{
                    aff1.setText("2");
                }}
                operatorPressed = false;
                pressed="deux";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "3");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("3");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("3");
                        }
                        else{
                            aff1.setText("3");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "3");
                    }
                    else{
                        aff1.setText("3");
                    }}
                operatorPressed = false;
                pressed="trois";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "4");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("4");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("4");
                        }
                        else{
                            aff1.setText("4");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "4");
                    }
                    else{
                        aff1.setText("4");
                    }}
                operatorPressed = false;
                pressed="quatre";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "5");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("5");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("5");
                        }
                        else{
                            aff1.setText("5");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "5");
                    }
                    else{
                        aff1.setText("5");
                    }}
                operatorPressed = false;
                pressed="cinq";
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "6");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("6");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("6");
                        }
                        else{
                            aff1.setText("6");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "6");
                    }
                    else{
                        aff1.setText("6");
                    }}
                operatorPressed = false;
                pressed="six";
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "7");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("7");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("7");
                        }
                        else{
                            aff1.setText("7");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "7");
                    }
                    else{
                        aff1.setText("7");
                    }}
                operatorPressed = false;
                pressed="seven";
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "8");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("8");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("8");
                        }
                        else{
                            aff1.setText("8");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "8");
                    }
                    else{
                        aff1.setText("8");
                    }}
                pressed="eight";
                operatorPressed = false;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                Double d=Double.parseDouble(contenu1);
                if(pressed.equals("comma")){
                    aff1.setText(contenu1 + "9");
                }
                else{
                    if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                        // Si le contenu de l'afficheur est 0, est vide, ou si un opérateur a été pressé, remplacez le contenu
                        if(contenu2.contains("=") && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff2.setText("");
                            aff1.setText("9");
                        }
                        else if(!(contenu2.contains("=")) && !(pressed.equals("CE")) && !(pressed.equals("del"))){
                            aff1.setText("9");
                        }
                        else{
                            aff1.setText("9");
                        }
                        // Réinitialisez le statut de l'opérateur
                    } else if(!(pressed.equals("del"))) {

                        // Sinon, ajoutez le chiffre à la suite du contenu actuel
                        aff1.setText(contenu1 + "9");
                    }
                    else{
                        aff1.setText("9");
                    }}
                pressed="nine";
                operatorPressed = false;
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed = false;
                msg.setText("");
                aff1.setText("0");
                aff2.setText("");
                pressed="C";
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                add.setEnabled(true);
                mult.setEnabled(true);
                div.setEnabled(true);
                sous.setEnabled(true);
                equ.setEnabled(true);
                div_equ.setEnabled(true);
                square.setEnabled(true);
                sqrt.setEnabled(true);
                type.setEnabled(true);
                comma.setEnabled(true);
                inv.setEnabled(true);
                del.setEnabled(true);
            }
        });
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed = false;
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                if(contenu2.contains("=") || contenu2.contains("√(-")){
                    aff2.setText("");
                    aff1.setText("0");
                }
                else{
                    aff1.setText("0");
                }
                msg.setText("");
                pressed="CE";
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                add.setEnabled(true);
                mult.setEnabled(true);
                div.setEnabled(true);
                sous.setEnabled(true);
                equ.setEnabled(true);
                div_equ.setEnabled(true);
                square.setEnabled(true);
                sqrt.setEnabled(true);
                type.setEnabled(true);
                comma.setEnabled(true);
                inv.setEnabled(true);
                del.setEnabled(true);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed = false;
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                msg.setText("");
                if(contenu2.contains("=")){
                    aff2.setText("");
                    aff1.setText(aff1.getText());
                }
                else{
                if(aff1.length()>1){
                aff1.setText( aff1.getText().toString().substring(0,
                        aff1.getText().toString().length()-1));}
                else if(aff1.length()==1){
                    aff1.setText("0");
                }}
                pressed="del";
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result= new Double(0);
                ArrayList<Double> numbers=new ArrayList<Double>();
                ArrayList<Character> operator= new ArrayList<Character>();
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(pressed.equals("add")){
                    aff1.setText(contenu1);
                    aff2.setText(contenu2);
                }
                else{
                    if(contenu2.contains("sqr")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                    if(contenu2.contains("/")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                if(contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷"))
                {
                    if(pressed.equals("add") || pressed.equals("sous") || pressed.equals("mult") || pressed.equals("div")){
                        if(chars2[0]!='-'){
                            operator.set(0,'+');
                            aff2.setText(numbers.get(0).toString()+operator.get(0).toString());
                        }
                        else if(chars2[0]=='-'){
                            operator.set(1,'+');
                            aff2.setText("-"+numbers.get(0).toString()+operator.get(1).toString());
                        }
                    }
                    else{
                    if(chars2[0]!='-'){
                        if(chars1[0]=='-'){
                            switch (operator.get(0)) {
                                case '+':
                                    result= numbers.get(0)-numbers.get(1);
                                    aff2.setText(result.toString()+"+");
                                    aff1.setText(result.toString());
                                    break;
                                case '-':
                                    result=numbers.get(0)+numbers.get(1);
                                    aff2.setText(result.toString()+"+");
                                    aff1.setText(result.toString());
                                    break;
                                case 'x':
                                    result=numbers.get(0)*(-numbers.get(1));
                                    aff2.setText(result.toString()+"+");
                                    aff1.setText(result.toString());
                                    break;
                                case '÷':
                                    result=numbers.get(0)/(-numbers.get(1));
                                    if(numbers.get(1)==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText(numbers.get(0)+"÷");
                                        aff1.setText("");
                                    }
                                    else{
                                    aff2.setText(result.toString()+"+");
                                    aff1.setText(result.toString());}
                                    break;
                                default:
                                    Log.d("Erreur","Opérateur non reconnu");
                            }
                        }
                        else{
                            if(chars1[0]!='-') {
                                switch (operator.get(0)) {
                                    case '+':
                                        result = numbers.get(0) + numbers.get(1);
                                        aff2.setText(result.toString() + "+");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':
                                        result = numbers.get(0) - numbers.get(1);
                                        aff2.setText(result.toString() + "+");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                        result = numbers.get(0) * (numbers.get(1));
                                        aff2.setText(result.toString() + "+");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                        result = numbers.get(0) / (numbers.get(1));
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                            aff1.setText("0");
                                        }
                                        else{
                                        aff2.setText(result.toString() + "+");
                                        aff1.setText(result.toString());}
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            }
                        }
                    }
                    else {
                        if (chars2[0] == '-') {
                            if(chars1[0]=='-'){
                                switch (operator.get(1)) {
                                    case '+':
                                        result= (-numbers.get(0))-numbers.get(1);
                                        aff2.setText(result.toString()+"+");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':
                                        result=(-numbers.get(0))+numbers.get(1);
                                        aff2.setText(result.toString()+"+");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                        result=(-numbers.get(0))*(-numbers.get(1));
                                        aff2.setText(result.toString()+"+");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                        result=(-numbers.get(0))/(-numbers.get(1));
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText("-"+numbers.get(0)+"÷");
                                            aff1.setText("");
                                        }
                                        else{
                                        aff2.setText(result.toString()+"+");
                                        aff1.setText(result.toString());}
                                        break;
                                    default:
                                        Log.d("Erreur","Opérateur non reconnu");
                                }
                            }
                            else {
                                if(chars1[0]!='-') {
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText(result.toString() + "+");
                                            aff1.setText(result.toString());
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText(result.toString() + "+");
                                            aff1.setText(result.toString());
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * numbers.get(1);
                                            aff2.setText(result.toString() + "+");
                                            aff1.setText(result.toString());
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / numbers.get(1);
                                            if(numbers.get(1)==0){
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-"+numbers.get(0)+"÷");
                                                aff1.setText("");
                                            }
                                            else{
                                            aff2.setText(result.toString() + "+");
                                            aff1.setText(result.toString());}
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                }
                            }
                        }
                    }
                    }

                }
                else{
                    aff2.setText(contenu1+"+");
                }
            }
                pressed="add";
                operatorPressed = true;
            }
        });
        sous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result= new Double(0);
                ArrayList<Double> numbers=new ArrayList<Double>();
                ArrayList<Character> operator= new ArrayList<Character>();
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(pressed.equals("sous")){
                    aff1.setText(contenu1);
                    aff2.setText(contenu2);
                }
                else{
                    if(contenu2.contains("sqr")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                    if(contenu2.contains("/")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                if(contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷"))
                {
                    if(pressed.equals("add") || pressed.equals("sous") || pressed.equals("mult") || pressed.equals("div")){
                        if(chars2[0]!='-'){
                            operator.set(0,'-');
                            aff2.setText(numbers.get(0).toString()+operator.get(0).toString());
                        }
                        else if(chars2[0]=='-'){
                            operator.set(1,'-');
                            aff2.setText("-"+numbers.get(0).toString()+operator.get(1).toString());
                        }
                    }
                    else {
                        if (chars2[0] != '-') {
                            if (chars1[0] == '-') {
                                switch (operator.get(0)) {
                                    case '+':
                                        result = numbers.get(0) - numbers.get(1);
                                        aff2.setText(result.toString() + "-");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':
                                        result = numbers.get(0) + numbers.get(1);
                                        aff2.setText(result.toString() + "-");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                        result = numbers.get(0) * (-numbers.get(1));
                                        aff2.setText(result.toString() + "-");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                        result = numbers.get(0) / (-numbers.get(1));
                                        if (numbers.get(1) == 0) {
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0) + "÷");
                                            aff1.setText("");
                                        } else {
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                        }
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            } else {
                                if (chars1[0] != '-') {
                                    switch (operator.get(0)) {
                                        case '+':
                                            if (chars2[0] == '-') {
                                                result = (-numbers.get(0)) + numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            } else {
                                                result = numbers.get(0) + numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        case '-':
                                            if (chars2[0] == '-') {
                                                result = (-numbers.get(0)) - numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            } else {
                                                result = numbers.get(0) - numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        case 'x':
                                            if (chars2[0] == '-') {
                                                result = (-numbers.get(0)) * numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            } else {
                                                result = numbers.get(0) * numbers.get(1);
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        case '÷':
                                            result = numbers.get(0) / numbers.get(1);
                                            if (numbers.get(1) == 0) {
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText(numbers.get(0) + "÷");
                                                aff1.setText("");
                                            } else {
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                }
                            }
                        } else {
                            if (chars2[0] == '-') {
                                if (chars1[0] == '-') {
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * (-numbers.get(1));
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / (-numbers.get(1));
                                            if (numbers.get(1) == 0) {
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-" + numbers.get(0) + "÷");
                                                aff1.setText("");
                                            } else {
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                } else if (chars1[0] != '-') {
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * numbers.get(1);
                                            aff2.setText(result.toString() + "-");
                                            aff1.setText(result.toString());
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / numbers.get(1);
                                            if (numbers.get(1) == 0) {
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-" + numbers.get(0) + "÷");
                                                aff1.setText("");
                                            } else {
                                                aff2.setText(result.toString() + "-");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    aff2.setText(contenu1+"-");
                }
            }
                operatorPressed = true;
                pressed="sous";
        }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result= new Double(0);
                ArrayList<Double> numbers=new ArrayList<Double>(2);
                ArrayList<Character> operator= new ArrayList<Character>(3);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(pressed.equals("div")){
                    aff1.setText(contenu1);
                    aff2.setText(contenu2);
                }
                else{
                    if(contenu2.contains("sqr")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                    if(contenu2.contains("/")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                if(contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷"))
                {
                    if(pressed.equals("add") || pressed.equals("sous") || pressed.equals("mult") || pressed.equals("div")){
                        if(chars2[0]!='-'){
                            operator.set(0,'÷');
                            aff2.setText(numbers.get(0).toString()+operator.get(0).toString());
                        }
                        else if(chars2[0]=='-'){
                            operator.set(1,'÷');
                            aff2.setText("-"+numbers.get(0).toString()+operator.get(1).toString());
                        }
                    }
                    else{
                    if(chars2[0]!='-'){
                        if(chars1[0]=='-'){
                            switch (operator.get(0)) {
                                case '+':
                           result=numbers.get(0)-numbers.get(1);
                                    aff2.setText(result.toString()+"÷");
                                    aff1.setText(result.toString());
                            break;
                            case '-':
                             result=numbers.get(0)+numbers.get(1);
                                aff2.setText(result.toString()+"÷");
                                aff1.setText(result.toString());
                            break;
                        case 'x':
                                result=numbers.get(0)* (-numbers.get(1));
                            aff2.setText(result.toString()+"÷");
                            aff1.setText(result.toString());
                            break;
                        case '÷':
                           result=numbers.get(0)/(-numbers.get(1));
                            if(numbers.get(1)==0){
                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                b0.setEnabled(false);
                                b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                b5.setEnabled(false);
                                b6.setEnabled(false);
                                b7.setEnabled(false);
                                b8.setEnabled(false);
                                b9.setEnabled(false);
                                add.setEnabled(false);
                                mult.setEnabled(false);
                                div.setEnabled(false);
                                sous.setEnabled(false);
                                equ.setEnabled(false);
                                div_equ.setEnabled(false);
                                square.setEnabled(false);
                                sqrt.setEnabled(false);
                                type.setEnabled(false);
                                comma.setEnabled(false);
                                inv.setEnabled(false);
                                del.setEnabled(false);
                                aff2.setText(numbers.get(0)+"÷");
                                aff1.setText("");
                            }
                            else{
                            aff2.setText(result.toString()+"÷");
                            aff1.setText(result.toString());}
                            break;
                        default:
                            Log.d("Erreur","Opérateur non reconnu");
                        }
                        }
                        else{
                            if(chars1[0]!='-') {
                                switch (operator.get(0)) {
                                    case '+':
                                            result = numbers.get(0) + numbers.get(1);
                                        aff2.setText(result.toString()+"÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':

                                            result = numbers.get(0) - numbers.get(1);
                                        aff2.setText(result.toString()+"÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                            result = numbers.get(0) * numbers.get(1);
                                        aff2.setText(result.toString()+"÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                            result = numbers.get(0) / numbers.get(1);
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                            aff1.setText("");
                                        }
                                        else{
                                        aff2.setText(result.toString()+"÷");
                                        aff1.setText(result.toString());}
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            }
                        }
                }
                    else {
                        if (chars2[0] == '-') {
                            if (chars1[0] == '-') {
                                switch (operator.get(1)) {
                                    case '+':
                                        result = (-numbers.get(0)) - numbers.get(1);
                                        aff2.setText(result.toString() + "÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':
                                        result = (-numbers.get(0)) + numbers.get(1);
                                        aff2.setText(result.toString() + "÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                        result = (-numbers.get(0)) * (-numbers.get(1));
                                        aff2.setText(result.toString() + "÷");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                        result = (-numbers.get(0)) / (-numbers.get(1));
                                        if (numbers.get(1) == 0) {
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText("-" + numbers.get(0) + "÷");
                                            aff1.setText("");
                                        } else {
                                            aff2.setText(result.toString() + "÷");
                                            aff1.setText(result.toString());
                                        }
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            } else {
                                if (chars1[0] != '-') {
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText(result.toString() + "÷");
                                            aff1.setText(result.toString());
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText(result.toString() + "÷");
                                            aff1.setText(result.toString());
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * numbers.get(1);
                                            aff2.setText(result.toString() + "÷");
                                            aff1.setText(result.toString());
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / numbers.get(1);
                                            if (numbers.get(1) == 0) {
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-" + numbers.get(0) + "÷");
                                                aff1.setText("");
                                            } else {
                                                aff2.setText(result.toString() + "÷");
                                                aff1.setText(result.toString());
                                            }
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                }
                            }
                        }
                    }
                    }
                }
                else{
                    aff2.setText(contenu1+"÷");
                }
            }
                operatorPressed = true;
            pressed="div";
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1=aff1.getText().toString();
                String contenu2=aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result= new Double(0);
                ArrayList<Double> numbers=new ArrayList<Double>();
                ArrayList<Character> operator= new ArrayList<Character>();
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(pressed.equals("mult")){
                    aff1.setText(contenu1);
                    aff2.setText(contenu2);
                }
                else{
                    if(contenu2.contains("sqr")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                    if(contenu2.contains("/")){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                if(contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷"))
                {
                    if(pressed.equals("add") || pressed.equals("sous") || pressed.equals("mult") || pressed.equals("div")){
                        if(chars2[0]!='-'){
                            operator.set(0,'x');
                            aff2.setText(numbers.get(0).toString()+operator.get(0).toString());
                        }
                        else if(chars2[0]=='-'){
                            operator.set(1,'x');
                            aff2.setText("-"+numbers.get(0).toString()+operator.get(1).toString());
                        }
                    }
                    else{
                    if(chars2[0]!='-'){
                        if(chars1[0]=='-'){
                            switch (operator.get(0)) {
                                case '+':
                                    result=numbers.get(0)-numbers.get(1);
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());
                                    break;
                                case '-':
                                    result=numbers.get(0)+numbers.get(1);
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());
                                    break;
                                case 'x':
                                    result=numbers.get(0)*(-numbers.get(1));
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());
                                    break;
                                case '÷':
                                    result=numbers.get(0)/(-numbers.get(1));
                                    if(numbers.get(1)==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText(numbers.get(0)+"÷");
                                        aff1.setText("");
                                    }
                                    else{
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());}
                                    break;
                                default:
                                    Log.d("Erreur","Opérateur non reconnu");
                            }
                        }
                        else if (chars1[0]!='-'){
                        switch (operator.get(0)) {
                        case '+':
                             result=numbers.get(0)+numbers.get(1);
                            aff2.setText(result.toString()+"x");
                            aff1.setText(result.toString());
                            break;
                        case '-':
                           result=numbers.get(0)-numbers.get(1);
                            aff2.setText(result.toString()+"x");
                            aff1.setText(result.toString());
                            break;
                        case 'x':
                            result=numbers.get(0)*numbers.get(1);
                            aff2.setText(result.toString()+"x");
                            aff1.setText(result.toString());
                            break;
                        case '÷':
                            result=numbers.get(0)/numbers.get(1);
                            if(numbers.get(1)==0){
                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                b0.setEnabled(false);
                                b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                b5.setEnabled(false);
                                b6.setEnabled(false);
                                b7.setEnabled(false);
                                b8.setEnabled(false);
                                b9.setEnabled(false);
                                add.setEnabled(false);
                                mult.setEnabled(false);
                                div.setEnabled(false);
                                sous.setEnabled(false);
                                equ.setEnabled(false);
                                div_equ.setEnabled(false);
                                square.setEnabled(false);
                                sqrt.setEnabled(false);
                                type.setEnabled(false);
                                comma.setEnabled(false);
                                inv.setEnabled(false);
                                del.setEnabled(false);
                                aff2.setText(numbers.get(0)+"÷");
                                aff1.setText("");
                            }
                            else{
                            aff2.setText(result.toString()+"x");
                            aff1.setText(result.toString());}
                            break;
                        default:
                            Log.d("Erreur","Opérateur non reconnu");
                    }
                        }
                    }
                    else{
                        if(chars2[0]=='-'){
                            if(chars1[0]=='-'){
                                switch (operator.get(1)) {
                                    case '+':
                                        result=(-numbers.get(0))-numbers.get(1);
                                        aff2.setText(result.toString()+"x");
                                        aff1.setText(result.toString());
                                        break;
                                    case '-':
                                        result=(-numbers.get(0))+numbers.get(1);
                                        aff2.setText(result.toString()+"x");
                                        aff1.setText(result.toString());
                                        break;
                                    case 'x':
                                        result=(-numbers.get(0))*(-numbers.get(1));
                                        aff2.setText(result.toString()+"x");
                                        aff1.setText(result.toString());
                                        break;
                                    case '÷':
                                        result=(-numbers.get(0))/(-numbers.get(1));
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText("-"+numbers.get(0)+"÷");
                                            aff1.setText("");
                                        }
                                        else{
                                        aff2.setText(result.toString()+"x");
                                        aff1.setText(result.toString());}
                                        break;
                                    default:
                                        Log.d("Erreur","Opérateur non reconnu");
                                }
                            }
                            else if (chars1[0]!='-'){
                            switch (operator.get(1)) {
                                case '+':
                                        result=(-numbers.get(0))+numbers.get(1);
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());
                                    break;
                                case '-':
                                        result=(-numbers.get(0))-numbers.get(1);
                                        aff2.setText(result.toString()+"x");
                                        aff1.setText(result.toString());
                                    break;
                                case 'x':
                                        result=(-numbers.get(0))*numbers.get(1);
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());
                                    break;
                                case '÷':
                                        result=(-numbers.get(0))/numbers.get(1);
                                    if(numbers.get(1)==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText("-"+numbers.get(0)+"÷");
                                        aff1.setText("");
                                    }
                                    else{
                                    aff2.setText(result.toString()+"x");
                                    aff1.setText(result.toString());}
                                    break;
                                default:
                                    Log.d("Erreur","Opérateur non reconnu");
                            }
                        }
                        }
                    }
                    }
                }
                else{
                    aff2.setText(contenu1+"x");
                }
            }
                operatorPressed = true;
                pressed="mult";
            }
        });
        div_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result = new Double(0);
                Double result_tmp = new Double(0);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator = new ArrayList<Character>(4);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(contenu2.contains("sqr")){
                    numbers.add(1,Double.parseDouble(contenu1));
                }
                if(contenu2.contains("/")){
                    numbers.add(1,Double.parseDouble(contenu1));
                }
                if ((contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷"))&& !(contenu2.contains("="))) {
                    if (chars2[0] != '-') {
                        if (chars1[0] == '-') {
                            switch (operator.get(0)) {
                                case '+':
                                    result_tmp = (numbers.get(0) * (-numbers.get(1))) / 100;
                                    result = numbers.get(0) + result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "+ " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = (numbers.get(0) * (-numbers.get(1))) / 100;
                                    result = numbers.get(0) - result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "-" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = (-numbers.get(1)) / 100;
                                    result = numbers.get(0) * result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "x " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = (-numbers.get(1)) / 100;
                                    result = numbers.get(0) / result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "÷" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        } else if (chars1[0] != '-') {
                            switch (operator.get(0)) {
                                case '+':
                                    result_tmp = (numbers.get(0) * numbers.get(1)) / 100;
                                    result = numbers.get(0) + result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "+ " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = (numbers.get(0) * numbers.get(1)) / 100;
                                    result = numbers.get(0) - result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "-" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = (numbers.get(1)) / 100;
                                    result = numbers.get(0) * result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "x " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = (numbers.get(1)) / 100;
                                    result = numbers.get(0) / result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "÷" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                    } else if (chars2[0] == '-') {
                        if (chars1[0] == '-') {
                            switch (operator.get(1)) {
                                case '+':
                                    result_tmp = ((-numbers.get(0)) * (-numbers.get(1))) / 100;
                                    result = (-numbers.get(0)) + result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "+ " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = ((-numbers.get(0)) * (-numbers.get(1))) / 100;
                                    result = (-numbers.get(0)) - result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "-" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = (-numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) * result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "x " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = (-numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) / result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "÷" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        } else if (chars1[0] != '-') {
                            switch (operator.get(1)) {
                                case '+':
                                    result_tmp = ((-numbers.get(0)) * numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) + result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "+ " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = ((-numbers.get(0)) * numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) - result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "-" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = (numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) * result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "x " + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = (numbers.get(1)) / 100;
                                    result = (-numbers.get(0)) / result_tmp;
                                    aff2.setText("-" + numbers.get(0).toString() + "÷" + result_tmp);
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                    }
                }
                else{
                    if(contenu2.isEmpty()){
                        aff1.setText("0");
                        aff2.setText("0");
                    }
                    else{
                            Double val= Double.parseDouble(contenu1);
                            result= Math.pow(val,2)/100;
                            String resultatFormate = String.format("%7f", result);
                            aff2.setText(resultatFormate);
                            aff1.setText(resultatFormate);
                    }

                }
                pressed="div_equ";
                operatorPressed = false;
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result = new Double(0);
                Double result_tmp = new Double(0);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator = new ArrayList<Character>(4);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if ((contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷")) && !(contenu2.contains("="))) {
                    if (chars2[0] != '-') {
                        if (chars1[0] != '-') {
                            switch (operator.get(0)) {
                                case '+':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) + result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "+ sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) - result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "- sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) * result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "x sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) / result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "÷ sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        } else if (chars1[0] == '-') {
                            switch (operator.get(0)) {
                                case '+':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) + result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "+ sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) - result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "- sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) * result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "x sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = numbers.get(0) / result_tmp;
                                    aff2.setText(numbers.get(0).toString() + "÷ sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                    }
                    else if (chars2[0] == '-') {
                        if (chars1[0] != '-') {
                            switch (operator.get(1)) {
                                case '+':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) + result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "+ sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) - result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "- sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) * result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "x sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) / result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "÷ sqr(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        } else if (chars1[0] == '-') {
                            switch (operator.get(1)) {
                                case '+':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) + result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "+ sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) - result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "- sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) * result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "x sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = Math.pow(numbers.get(1), 2);
                                    result = (-numbers.get(0)) / result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "÷ sqr(-" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                    }
                }
                else{
                    if(contenu2.isEmpty()){
                        Double val= Double.parseDouble(contenu1);
                        result= Math.pow(val,2);
                        aff1.setText(result.toString());
                        aff2.setText("sqr("+contenu1+")");
                    }
                    else{
                        Double val= Double.parseDouble(contenu1);
                        result= Math.pow(val,2);
                        aff2.setText(result.toString());
                        aff1.setText(result.toString());
                    }
                }
                pressed="square";
                operatorPressed = false;
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result = new Double(0);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator= new ArrayList<Character>(4);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                    for (char c : chars2) {
                        if (Character.isDigit(c) || c == '.') {
                            // The character is a digit or a decimal point
                            currentNumber1.append(c);
                        } else {
                            // The character is an operator
                            if (currentNumber1.length() > 0) {
                                // If we have collected a number, add it to the numbers ArrayList
                                numbers.add(Double.parseDouble(currentNumber1.toString()));
                                currentNumber1.setLength(0); // Reset the StringBuilder
                            }
                            if (!Character.isWhitespace(c)) {
                                // If the character is not a whitespace, it's an operator
                                operator.add(c);
                            }
                        }
                    }
                    for (char c : chars1) {
                        if (Character.isDigit(c) || c == '.') {
                            currentNumber2.append(c);
                        } else {
                            // The character is not a digit or decimal point, so process the current number
                            if (currentNumber2.length() > 0) {
                                numbers.add(Double.parseDouble(currentNumber2.toString()));
                                currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                            }
                            if (!Character.isWhitespace(c)) {
                                // If the character is not a whitespace, it's an operator
                                operator.add(c);
                            }
                        }
                    }
// Check if there's a number left in currentNumber2 after the loop
                    if (currentNumber2.length() > 0) {
                        numbers.add(Double.parseDouble(currentNumber2.toString()));
                        currentNumber2.setLength(0); // Reset for consistency
                    }
                    if(contenu2.contains("sqr") || contenu2.contains("/") || contenu2.contains("√") ){
                        numbers.add(1,Double.parseDouble(contenu1));
                    }
                if (contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷")) {
                    if(!(pressed.equals("equal"))) {
                        if (chars2[0] != '-') {
                            if (chars1[0] == '-') {
                                switch (operator.get(0)) {
                                    case '+':
                                        result = numbers.get(0) - numbers.get(1);
                                        aff2.setText(numbers.get(0).toString() + "-" + numbers.get(1).toString()+"=");
                                        break;
                                    case '-':
                                        result = numbers.get(0) + numbers.get(1);
                                        aff2.setText(numbers.get(0).toString() + "+" + numbers.get(1).toString()+"=");
                                        break;
                                    case 'x':
                                        result = numbers.get(0) * (-numbers.get(1));
                                        aff2.setText(numbers.get(0).toString() + "x -" + numbers.get(1).toString()+"=");
                                        break;
                                    case '÷':
                                        result = numbers.get(0) / (-numbers.get(1));
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                        }
                                        else{aff2.setText(numbers.get(0).toString() + "÷ -" + numbers.get(1).toString()+"=");}
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            } else if(chars1[0] != '-') {
                                switch (operator.get(0)) {
                                    case '+':
                                        result = numbers.get(0) + numbers.get(1);
                                        aff2.setText(numbers.get(0).toString() + "+" + numbers.get(1).toString()+"=");
                                        break;
                                    case '-':
                                        result = numbers.get(0) - numbers.get(1);
                                        aff2.setText(numbers.get(0).toString() + "-" + numbers.get(1).toString()+"=");
                                        break;
                                    case 'x':
                                        result = numbers.get(0) * numbers.get(1);
                                        aff2.setText(numbers.get(0).toString() + "x" + numbers.get(1).toString()+"=");
                                        break;
                                    case '÷':
                                        result = numbers.get(0) / numbers.get(1);
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                        }else{
                                        aff2.setText(numbers.get(0).toString() + "÷" + numbers.get(1).toString()+"=");}
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            }
                            if(numbers.get(1)==0){
                                aff1.setText("");
                            }
                            else{
                                aff1.setText(result.toString());}
                            if (aff1.getText().toString().endsWith(".0")) {
                                // Si c'est le cas, remplacez la partie décimale par une chaîne vide
                                aff1.setText(aff1.getText().toString().replace(".0", ""));
                            }
                        }
                        else {
                            if (chars2[0] == '-') {
                                if (chars1[0] == '-') {
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText("-" + numbers.get(0).toString() + "-" + numbers.get(1).toString()+"=");
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText("-" + numbers.get(0).toString() + "+" + numbers.get(1).toString()+"=");
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * (-numbers.get(1));
                                            aff2.setText("-" + numbers.get(0).toString() + "x -" + numbers.get(1).toString()+"=");
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / (-numbers.get(1));
                                            if(numbers.get(1)==0){
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-"+numbers.get(0)+"÷");
                                            }
                                            else{
                                            aff2.setText("-" + numbers.get(0).toString() + "÷ -" + numbers.get(1).toString()+"=");}
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                } else if(chars1[0] != '-'){
                                    switch (operator.get(1)) {
                                        case '+':
                                            result = (-numbers.get(0)) + numbers.get(1);
                                            aff2.setText("-" + numbers.get(0).toString() + "+" + numbers.get(1).toString()+"=");
                                            break;
                                        case '-':
                                            result = (-numbers.get(0)) - numbers.get(1);
                                            aff2.setText("-" + numbers.get(0).toString() + "-" + numbers.get(1).toString()+"=");
                                            break;
                                        case 'x':
                                            result = (-numbers.get(0)) * numbers.get(1);
                                            aff2.setText("-" + numbers.get(0).toString() + "x" + numbers.get(1).toString()+"=");
                                            break;
                                        case '÷':
                                            result = (-numbers.get(0)) / numbers.get(1);
                                            if(numbers.get(1)==0){
                                                msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                                b0.setEnabled(false);
                                                b1.setEnabled(false);
                                                b2.setEnabled(false);
                                                b3.setEnabled(false);
                                                b4.setEnabled(false);
                                                b5.setEnabled(false);
                                                b6.setEnabled(false);
                                                b7.setEnabled(false);
                                                b8.setEnabled(false);
                                                b9.setEnabled(false);
                                                add.setEnabled(false);
                                                mult.setEnabled(false);
                                                div.setEnabled(false);
                                                sous.setEnabled(false);
                                                equ.setEnabled(false);
                                                div_equ.setEnabled(false);
                                                square.setEnabled(false);
                                                sqrt.setEnabled(false);
                                                type.setEnabled(false);
                                                comma.setEnabled(false);
                                                inv.setEnabled(false);
                                                del.setEnabled(false);
                                                aff2.setText("-"+numbers.get(0)+"÷");
                                            }
                                            else{
                                            aff2.setText("-" + numbers.get(0).toString() + "÷" + numbers.get(1).toString()+"=");}
                                            break;
                                        default:
                                            Log.d("Erreur", "Opérateur non reconnu");
                                    }
                                }
                            }
                            if(numbers.get(1)==0){
                                aff1.setText("");
                            }
                            else{
                            aff1.setText(result.toString());}
                            if (aff1.getText().toString().endsWith(".0")) {
                                // Si c'est le cas, remplacez la partie décimale par une chaîne vide
                                aff1.setText(aff1.getText().toString().replace(".0", ""));
                            }
                        }
                        pressed="equal";
                        operatorPressed = true;
                    }
                    else if (pressed.equals("equal")){
                            Double number1 = Double.parseDouble(contenu1);
                            switch (operator.get(0)) {
                                case '+':
                                    result = number1 + (numbers.get(1));
                                    aff2.setText(number1.toString()+ "+" + numbers.get(1).toString() + "=");
                                    break;
                                case '-':
                                    result = number1 - (numbers.get(1));
                                    aff2.setText(number1 + "-" + numbers.get(1) + "=");
                                    break;
                                case 'x':
                                    result = number1 * (numbers.get(1));
                                    aff2.setText(number1 + "x" + numbers.get(1) + "=");
                                    break;
                                case '÷':
                                    result = number1 / (numbers.get(1));
                                    if(numbers.get(1)==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText(number1+"÷");
                                    }
                                    else{
                                    aff2.setText(number1 + "÷" + numbers.get(1) + "=");}
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        if(numbers.get(1)==0){
                            aff1.setText("");
                        }
                        else{
                            aff1.setText(result.toString());}
                        if (aff1.getText().toString().endsWith(".0")) {
                            // Si c'est le cas, remplacez la partie décimale par une chaîne vide
                            aff1.setText(aff1.getText().toString().replace(".0", ""));
                        }
                        pressed="equal";
                        operatorPressed = true;
                        }
                    }
                else {
                    aff2.setText(contenu1+"=");
                    aff1.setText(contenu1);
                    if (aff1.getText().toString().endsWith(".0")) {
                        // Si c'est le cas, remplacez la partie décimale par une chaîne vide
                        aff1.setText(aff1.getText().toString().replace(".0", ""));
                    }
                    pressed="equal";
                    operatorPressed = true;
                }
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result = new Double(0);
                Double result_tmp = new Double(0);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator= new ArrayList<Character>(2);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(contenu2.contains("sqrt") || contenu2.contains("/")){
                    numbers.add(1,Double.parseDouble(contenu1));
                }
                if(contenu2.isEmpty() || contenu2.contains("=")){
                    if(chars1[0]!='-'){
                        result = Math.sqrt(Double.parseDouble(contenu1));
                        aff1.setText(result.toString());
                        aff2.setText("√("+contenu1+")");
                    }
                    else{
                        aff1.setText("");
                        aff2.setText("√("+contenu1+")");
                        msg.setText("Entrée invalide!");
                        b0.setEnabled(false);
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        add.setEnabled(false);
                        mult.setEnabled(false);
                        div.setEnabled(false);
                        sous.setEnabled(false);
                        equ.setEnabled(false);
                        div_equ.setEnabled(false);
                        square.setEnabled(false);
                        sqrt.setEnabled(false);
                        type.setEnabled(false);
                        comma.setEnabled(false);
                        inv.setEnabled(false);
                        del.setEnabled(false);
                    }
                }
                else if(contenu2.contains("+") || contenu2.contains("-")
                        || contenu2.contains("x") || contenu2.contains("÷") && !(contenu2.contains("=")))
                {
                    if(chars2[0]=='-'){
                        if(chars1[0]!='-'){
                            switch (operator.get(1)) {
                                case '+':
                                    result_tmp = Math.sqrt(numbers.get(1));
                                    result = (-numbers.get(0)) + result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "+√( " + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '-':
                                    result_tmp = Math.sqrt(numbers.get(1));
                                    result = (-numbers.get(0)) - result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "- √(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case 'x':
                                    result_tmp = Math.sqrt(numbers.get(1));
                                    result = (-numbers.get(0)) * result_tmp;
                                    aff2.setText("-"+numbers.get(0).toString() + "x √("+ numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());
                                    break;
                                case '÷':
                                    result_tmp = Math.sqrt(numbers.get(1));
                                    result = (-numbers.get(0)) / result_tmp;
                                    if(result_tmp==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText("-"+numbers.get(0)+"÷");
                                        aff1.setText("");
                                    }
                                    else{
                                    aff2.setText("-"+numbers.get(0).toString() + "÷ √(" + numbers.get(1) + ")");
                                    aff1.setText(result_tmp.toString());}
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                        else if(chars1[0]=='-'){
                            switch (operator.get(1)) {
                                case '+':
                                    aff2.setText("-"+numbers.get(0).toString() + "+√(- " +numbers.get(1) + ")");
                                    aff1.setText("");
                                    msg.setText("Entrée invalide!");
                                    b0.setEnabled(false);
                                    b1.setEnabled(false);
                                    b2.setEnabled(false);
                                    b3.setEnabled(false);
                                    b4.setEnabled(false);
                                    b5.setEnabled(false);
                                    b6.setEnabled(false);
                                    b7.setEnabled(false);
                                    b8.setEnabled(false);
                                    b9.setEnabled(false);
                                    add.setEnabled(false);
                                    mult.setEnabled(false);
                                    div.setEnabled(false);
                                    sous.setEnabled(false);
                                    equ.setEnabled(false);
                                    div_equ.setEnabled(false);
                                    square.setEnabled(false);
                                    sqrt.setEnabled(false);
                                    type.setEnabled(false);
                                    comma.setEnabled(false);
                                    inv.setEnabled(false);
                                    del.setEnabled(false);
                                    break;
                                case '-':
                                    aff2.setText("-"+numbers.get(0).toString() + "- √(-" + numbers.get(1) + ")");
                                    aff1.setText("");
                                    msg.setText("Entrée invalide!");
                                    b0.setEnabled(false);
                                    b1.setEnabled(false);
                                    b2.setEnabled(false);
                                    b3.setEnabled(false);
                                    b4.setEnabled(false);
                                    b5.setEnabled(false);
                                    b6.setEnabled(false);
                                    b7.setEnabled(false);
                                    b8.setEnabled(false);
                                    b9.setEnabled(false);
                                    add.setEnabled(false);
                                    mult.setEnabled(false);
                                    div.setEnabled(false);
                                    sous.setEnabled(false);
                                    equ.setEnabled(false);
                                    div_equ.setEnabled(false);
                                    square.setEnabled(false);
                                    sqrt.setEnabled(false);
                                    type.setEnabled(false);
                                    comma.setEnabled(false);
                                    inv.setEnabled(false);
                                    del.setEnabled(false);
                                    break;
                                case 'x':
                                    aff2.setText("-"+numbers.get(0).toString() + "x √(-"+ numbers.get(1) + ")");
                                    aff1.setText("");
                                    msg.setText("Entrée invalide!");
                                    b0.setEnabled(false);
                                    b1.setEnabled(false);
                                    b2.setEnabled(false);
                                    b3.setEnabled(false);
                                    b4.setEnabled(false);
                                    b5.setEnabled(false);
                                    b6.setEnabled(false);
                                    b7.setEnabled(false);
                                    b8.setEnabled(false);
                                    b9.setEnabled(false);
                                    add.setEnabled(false);
                                    mult.setEnabled(false);
                                    div.setEnabled(false);
                                    sous.setEnabled(false);
                                    equ.setEnabled(false);
                                    div_equ.setEnabled(false);
                                    square.setEnabled(false);
                                    sqrt.setEnabled(false);
                                    type.setEnabled(false);
                                    comma.setEnabled(false);
                                    inv.setEnabled(false);
                                    del.setEnabled(false);
                                    break;
                                case '÷':
                                    if(numbers.get(1)==0){
                                        msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        aff2.setText("-"+numbers.get(0)+"÷");
                                        aff1.setText("");
                                    }
                                    else{
                                        aff2.setText("-"+numbers.get(0).toString() + "÷ √(-" + numbers.get(1) + ")");
                                        aff1.setText("");
                                        msg.setText("Entrée invalide!");
                                    }
                                    break;
                                default:
                                    Log.d("Erreur", "Opérateur non reconnu");
                            }
                        }
                    }
                        else if(chars2[0]!='-'){
                            if(chars1[0]!='-'){
                                switch (operator.get(0)) {
                                    case '+':
                                        result_tmp = Math.sqrt(numbers.get(1));
                                        result = numbers.get(0) + result_tmp;
                                        aff2.setText(numbers.get(0).toString() + "+√( " + numbers.get(1) + ")");
                                        aff1.setText(result_tmp.toString());
                                        break;
                                    case '-':
                                        result_tmp = Math.sqrt(numbers.get(1));
                                        result = numbers.get(0) - result_tmp;
                                        aff2.setText(numbers.get(0).toString() + "- √(" + numbers.get(1) + ")");
                                        aff1.setText(result_tmp.toString());
                                        break;
                                    case 'x':
                                        result_tmp = Math.sqrt(numbers.get(1));
                                        result = numbers.get(0) * result_tmp;
                                        aff2.setText(numbers.get(0).toString() + "x √("+ numbers.get(1) + ")");
                                        aff1.setText(result_tmp.toString());
                                        break;
                                    case '÷':
                                        result_tmp = Math.sqrt(numbers.get(1));
                                        result = numbers.get(0) / result_tmp;
                                        if(result_tmp==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                            aff1.setText("");
                                        }
                                        else{
                                            aff2.setText(numbers.get(0).toString() + "÷ √(" + numbers.get(1) + ")");
                                            aff1.setText(result_tmp.toString());}
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            }
                            else if(chars1[0]=='-'){
                                switch (operator.get(0)) {
                                    case '+':
                                        aff2.setText(numbers.get(0).toString() + "+√(- " +numbers.get(1) + ")");
                                        aff1.setText("");
                                        msg.setText("Entrée invalide!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        break;
                                    case '-':
                                        aff2.setText(numbers.get(0).toString() + "- √(-" + numbers.get(1) + ")");
                                        aff1.setText("");
                                        msg.setText("Entrée invalide!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        break;
                                    case 'x':
                                        aff2.setText(numbers.get(0).toString() + "x √(-"+ numbers.get(1) + ")");
                                        aff1.setText("");
                                        msg.setText("Entrée invalide!");
                                        b0.setEnabled(false);
                                        b1.setEnabled(false);
                                        b2.setEnabled(false);
                                        b3.setEnabled(false);
                                        b4.setEnabled(false);
                                        b5.setEnabled(false);
                                        b6.setEnabled(false);
                                        b7.setEnabled(false);
                                        b8.setEnabled(false);
                                        b9.setEnabled(false);
                                        add.setEnabled(false);
                                        mult.setEnabled(false);
                                        div.setEnabled(false);
                                        sous.setEnabled(false);
                                        equ.setEnabled(false);
                                        div_equ.setEnabled(false);
                                        square.setEnabled(false);
                                        sqrt.setEnabled(false);
                                        type.setEnabled(false);
                                        comma.setEnabled(false);
                                        inv.setEnabled(false);
                                        del.setEnabled(false);
                                        break;
                                    case '÷':
                                        if(numbers.get(1)==0){
                                            msg.setText("Désolé nous ne pouvons pas effectuer la division pas zéro!");
                                            b0.setEnabled(false);
                                            b1.setEnabled(false);
                                            b2.setEnabled(false);
                                            b3.setEnabled(false);
                                            b4.setEnabled(false);
                                            b5.setEnabled(false);
                                            b6.setEnabled(false);
                                            b7.setEnabled(false);
                                            b8.setEnabled(false);
                                            b9.setEnabled(false);
                                            add.setEnabled(false);
                                            mult.setEnabled(false);
                                            div.setEnabled(false);
                                            sous.setEnabled(false);
                                            equ.setEnabled(false);
                                            div_equ.setEnabled(false);
                                            square.setEnabled(false);
                                            sqrt.setEnabled(false);
                                            type.setEnabled(false);
                                            comma.setEnabled(false);
                                            inv.setEnabled(false);
                                            del.setEnabled(false);
                                            aff2.setText(numbers.get(0)+"÷");
                                            aff1.setText("");
                                        }
                                        else{
                                            aff2.setText(numbers.get(0).toString() + "÷ √(-" + numbers.get(1) + ")");
                                            aff1.setText("");
                                            msg.setText("Entrée invalide!");
                                        }
                                        break;
                                    default:
                                        Log.d("Erreur", "Opérateur non reconnu");
                                }
                            }
                        }
                }
               pressed= "sqrt";
               operatorPressed= false;
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                Double d = Double.parseDouble(contenu1);
                if(!(pressed.equals("comma"))){
                if(operatorPressed && contenu2.isEmpty()){
                    if(!(contenu1.contains("."))){
                    aff1.setText(contenu1+".");
                    aff2.setText(aff2.getText());}
                }
                else if(operatorPressed && (contenu2.contains("+") || contenu2.contains("-")
                            || contenu2.contains("x") || contenu2.contains("÷"))){
                    if(contenu2.contains("=")){
                        aff1.setText("0.");
                        aff2.setText("");
                    }
                    else{
                        aff2.setText(aff2.getText());
                        aff1.setText("0.");
                    }}
                else {
                    if(!(contenu1.contains("."))){
                        aff1.setText(contenu1+".");
                        aff2.setText(aff2.getText());}
                }}
                pressed="comma";
                operatorPressed = false;
            }
        });
        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double result = new Double(0);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator= new ArrayList<Character>(2);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                    for (char c : chars2) {
                        if (Character.isDigit(c) || c == '.') {
                            // The character is a digit or a decimal point
                            currentNumber1.append(c);
                        } else {
                            // The character is an operator
                            if (currentNumber1.length() > 0) {
                                // If we have collected a number, add it to the numbers ArrayList
                                numbers.add(Double.parseDouble(currentNumber1.toString()));
                                currentNumber1.setLength(0); // Reset the StringBuilder
                            }
                            if (!Character.isWhitespace(c)) {
                                // If the character is not a whitespace, it's an operator
                                operator.add(c);
                            }
                        }
                    }
                    for (char c : chars1) {
                        if (Character.isDigit(c) || c == '.') {
                            currentNumber2.append(c);
                        } else {
                            // The character is not a digit or decimal point, so process the current number
                            if (currentNumber2.length() > 0) {
                                numbers.add(Double.parseDouble(currentNumber2.toString()));
                                currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                            }
                            if (!Character.isWhitespace(c)) {
                                // If the character is not a whitespace, it's an operator
                                operator.add(c);
                            }
                        }
                    }
// Check if there's a number left in currentNumber2 after the loop
                    if (currentNumber2.length() > 0) {
                        numbers.add(Double.parseDouble(currentNumber2.toString()));
                        currentNumber2.setLength(0); // Reset for consistency
                    }
                ArrayList<Double> numbers2= new ArrayList<Double>(2);
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers2.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                if (currentNumber2.length() > 0) {
                    numbers2.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(contenu2.contains("=") ){
                    String contenu= "negate("+contenu1.toString()+")";
                    aff2.setText(contenu);
                    if(contenu1.contains("-")){
                        aff1.setText(numbers2.get(0).toString());
                    }
                    else {
                        if(numbers2.get(0)==0){
                            aff1.setText(numbers2.get(0).toString());
                        }
                        else{
                        String cas2="-"+numbers2.get(0).toString();
                        aff1.setText(cas2);
                        }
                    }
                }
                else{
                    if(!operatorPressed){
                        if(contenu1.contains("-")){
                            aff1.setText(numbers2.get(0).toString());
                        }
                        else{
                            if((aff1.getText()).equals("0")){
                                aff2.setText("negate(0)");
                                aff1.setText("0");
                            }
                            else{
                                String cas2="-"+numbers2.get(0).toString();
                            aff1.setText(cas2);}
                        }
                    }
                    else{
                        String contenu= aff2.getText()+"negate("+contenu1.toString()+")";
                        aff2.setText(contenu);
                        if(contenu1.contains("-")){
                            aff1.setText(numbers2.get(0).toString());
                        }
                        else{
                            if((aff1.getText()).equals("0")){
                                aff2.setText("negate(0)");
                                aff1.setText("0");
                            }
                            else{
                            String cas2="-"+numbers2.get(0).toString();
                            aff1.setText(cas2);}
                        }
                    }
                }
                if (aff1.getText().toString().endsWith(".0")) {
                    // Si c'est le cas, remplacez la partie décimale par une chaîne vide
                    aff1.setText(aff1.getText().toString().replace(".0", ""));
                }
                operatorPressed = false;
                pressed="type";
            }
        });
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
                String contenu1 = aff1.getText().toString();
                String contenu2 = aff2.getText().toString();
                char[] chars2 = contenu2.toCharArray();
                char[] chars1 = contenu1.toCharArray();
                Double d = Double.parseDouble(contenu1);
                ArrayList<Double> numbers = new ArrayList<Double>(2);
                ArrayList<Character> operator= new ArrayList<Character>(4);
                StringBuilder currentNumber1 = new StringBuilder();
                StringBuilder currentNumber2 = new StringBuilder();
                for (char c : chars2) {
                    if (Character.isDigit(c) || c == '.') {
                        // The character is a digit or a decimal point
                        currentNumber1.append(c);
                    } else {
                        // The character is an operator
                        if (currentNumber1.length() > 0) {
                            // If we have collected a number, add it to the numbers ArrayList
                            numbers.add(Double.parseDouble(currentNumber1.toString()));
                            currentNumber1.setLength(0); // Reset the StringBuilder
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
                for (char c : chars1) {
                    if (Character.isDigit(c) || c == '.') {
                        currentNumber2.append(c);
                    } else {
                        // The character is not a digit or decimal point, so process the current number
                        if (currentNumber2.length() > 0) {
                            numbers.add(Double.parseDouble(currentNumber2.toString()));
                            currentNumber2.setLength(0); // Reset the StringBuilder for the next number
                        }
                        if (!Character.isWhitespace(c)) {
                            // If the character is not a whitespace, it's an operator
                            operator.add(c);
                        }
                    }
                }
// Check if there's a number left in currentNumber2 after the loop
                if (currentNumber2.length() > 0) {
                    numbers.add(Double.parseDouble(currentNumber2.toString()));
                    currentNumber2.setLength(0); // Reset for consistency
                }
                if(contenu2.contains("sqrt")){
                    numbers.add(1,Double.parseDouble(contenu1));
                }
                if (d == 0 && contenu2.isEmpty() || d == 0 || operatorPressed) {
                    msg.setText("Désolé! Nous ne pouvons pas diviser par 0 !");
                    String result= "1/("+contenu1.toString()+")";
                    aff2.setText(result);
                    aff1.setText("");
                    b0.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    add.setEnabled(false);
                    mult.setEnabled(false);
                    div.setEnabled(false);
                    sous.setEnabled(false);
                    equ.setEnabled(false);
                    div_equ.setEnabled(false);
                    square.setEnabled(false);
                    sqrt.setEnabled(false);
                    type.setEnabled(false);
                    comma.setEnabled(false);
                    inv.setEnabled(false);
                    del.setEnabled(false);
                }
                else  {
                    if(contenu2.contains("+") || contenu2.contains("-")
                            || contenu2.contains("x") || contenu2.contains("÷")){
                        if(!(pressed.equals("inv")))
                        {
                            if(chars2[0]=='-'){
                                if(chars1[0]!='-'){
                                    String result = "-"+numbers.get(0).toString()+operator.get(1)+"1/(" + contenu1.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());}
                                else if (chars1[0]=='-'){
                                    String result = "-"+numbers.get(0).toString()+operator.get(1)+"-1/(" + contenu1.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());
                                }
                            }
                            else if (chars2[0]!='-'){
                                if(chars1[0]!='-'){
                                    String result = numbers.get(0).toString()+ operator.get(0).toString() +"1/(" + contenu1.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());}
                                else if (chars1[0]=='-'){
                                    String result = numbers.get(0).toString()+operator.get(0).toString()+"-1/(" + contenu1.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());
                                }
                            }
                        }
                        else if(pressed.equals("inv")){
                            contenu2=contenu2.replace(numbers.get(0).toString(),"");
                            if(chars2[0]=='-'){
                                contenu2=contenu2.replace(operator.get(0).toString(),"");
                                contenu2=contenu2.replace(operator.get(1).toString(),"");
                                if(chars1[0]!='-'){
                            String result = "-"+numbers.get(0).toString()+operator.get(1).toString()+"1/(" + contenu2.toString() + ")";
                            aff2.setText(result);
                            Double valeur = 1 / (Double.parseDouble(contenu1));
                            aff1.setText(valeur.toString());}
                                else if (chars1[0]=='-'){
                                    String result = "-"+numbers.get(0).toString()+operator.get(1).toString()+"-1/(" + contenu2.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());
                                }
                            }
                            else if (chars2[0]!='-'){
                                contenu2=contenu2.replace(operator.get(0).toString(),"");
                                if(chars1[0]!='-'){
                                    String result = numbers.get(0).toString()+operator.get(0).toString()+"1/(" + contenu2.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());}
                                else if (chars1[0]=='-'){
                                    String result = numbers.get(0).toString()+operator.get(0)+"-1/(" + contenu2.toString() + ")";
                                    aff2.setText(result);
                                    Double valeur = 1 / (Double.parseDouble(contenu1));
                                    aff1.setText(valeur.toString());
                                }
                            }
                        }
                    }
                    else {
                        if(!(pressed.equals("inv")))
                    {
                        String result = "1/(" + contenu1.toString() + ")";
                        aff2.setText(result);
                        Double valeur = 1 / (Double.parseDouble(contenu1));
                        aff1.setText(valeur.toString());
                    }
                    else if(pressed.equals("inv")){
                        String result = "1/(" + contenu2.toString() + ")";
                        aff2.setText(result);
                        Double valeur = 1 / (Double.parseDouble(contenu1));
                        aff1.setText(valeur.toString());
                    }
                    }
                }
                operatorPressed = false;
                pressed="inv";
            }
        });
    }
}