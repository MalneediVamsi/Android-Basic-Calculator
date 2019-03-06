package com.vamsi.malneedi.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity1 extends Activity implements View.OnClickListener {

    Button aone, atwo, athree, afour, afive, asix, aseven, aeight, anine, azero, aadd, asub, amul, adiv, aclear, aequals;
    EditText disp;
    int op1;
    int op2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        aone = (Button) findViewById(R.id.one);
        atwo = (Button) findViewById(R.id.two);
        athree = (Button) findViewById(R.id.three);
        afour = (Button) findViewById(R.id.four);
        afive = (Button) findViewById(R.id.five);
        asix = (Button) findViewById(R.id.six);
        aseven = (Button) findViewById(R.id.seven);
        aeight = (Button) findViewById(R.id.eight);
        anine = (Button) findViewById(R.id.nine);
        azero = (Button) findViewById(R.id.zero);
        aadd = (Button) findViewById(R.id.add);
        asub = (Button) findViewById(R.id.sub);
        amul = (Button) findViewById(R.id.mul);
        adiv = (Button) findViewById(R.id.div);
        aclear = (Button) findViewById(R.id.clear);
        aequals = (Button) findViewById(R.id.equals);

        disp = (EditText) findViewById(R.id.edittext);

            aone.setOnClickListener(this);

            atwo.setOnClickListener(this);

            athree.setOnClickListener(this);

            afour.setOnClickListener(this);

            afive.setOnClickListener(this);

            asix.setOnClickListener(this);

            aseven.setOnClickListener(this);

            aeight.setOnClickListener(this);

            anine.setOnClickListener(this);

            azero.setOnClickListener(this);

            aclear.setOnClickListener(this);

            aadd.setOnClickListener(this);

            asub.setOnClickListener(this);

            amul.setOnClickListener(this);

            adiv.setOnClickListener(this);

            aequals.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                disp.append("1");
                break;
            case R.id.two:
                disp.append("2");
                break;
            case R.id.three:
                disp.append("3");
                break;
            case R.id.four:
                disp.append("4");
                break;
            case R.id.five:
                disp.append("5");
                break;
            case R.id.six:
                disp.append("6");
                break;
            case R.id.seven:
                disp.append("7");
                break;
            case R.id.eight:
                disp.append("8");
                break;
            case R.id.nine:
                disp.append("9");
                break;
            case R.id.zero:
                disp.append("0");
                break;
            case R.id.add:
                disp.append("+");
                break;
            case R.id.sub:
                disp.append("-");
                break;
            case R.id.mul:
                disp.append("*");
                break;
            case R.id.div:
                disp.append("/");
                break;
            case R.id.equals:
                String str = disp.getText().toString();

//                if (str.contains("[-]")) {
//                    String a[] = str.split("[-]");
//                    for (int i = 0; i < a.length; i++) {
//                        if (a[i].contains("[+]")) {
//                            String a1[] = a[i].split("[+]");
//                            for (int j = 0; j < a1.length; j++) {
//                                if (a1[j].contains("[*]")) {
//                                    String a2[] = a1[j].split("[*]");
//                                    for (int k = 0; k < a2.length; k++) {
//                                        if (a2[k].contains("[/]")) {
//                                            String a3[] = a2[k].split("[/]");
//                                            a2[k] = String.valueOf(Double.parseDouble(a3[0]) / Double.parseDouble(a3[1]));
//
//                                        }
//
//                                    }
//                                    a1[j] = String.valueOf(Double.parseDouble(a2[0]) * Double.parseDouble(a2[1]));
//
//                                }
//                                a[i] = String.valueOf(Double.parseDouble(a1[0]) - Double.parseDouble(a1[1]));
//
//                            }
//                            a[i] = String.valueOf(Double.parseDouble(a1[0]) + Double.parseDouble(a1[1]));
//
//                            for (int g = 0; g < a.length; g++) {
//                                a[0] = a[g + 1] + a[0];
//                            }
//                        }
//
//
//                    }
//                    disp.setText(a[0]);
//                }

                if(str.contains("+")){
                    String a[]=str.split("[+]");
                    disp.setText(String.valueOf(Double.parseDouble(a[0]) + Double.parseDouble(a[1])));
                }
                if (str.contains("-")) {
                    String a[] = str.split("[-]");
                    disp.setText(String.valueOf(Double.parseDouble(a[0]) - Double.parseDouble(a[1])));
                }
                if (str.contains("*")) {
                    String a[] = str.split("[*]");
                    disp.setText(String.valueOf(Double.parseDouble(a[0]) * Double.parseDouble(a[1])));
                }
                if (str.contains("/")) {
                    String a[] = str.split("[/]");
                    disp.setText(String.valueOf(Double.parseDouble(a[0]) / Double.parseDouble(a[1])));
                }
                break;

            case R.id.clear:
                disp.setText(" ");

                break;
        };



    }

    }

