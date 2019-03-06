package com.vamsi.malneedi.mycalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

/**
 * Created by 971808 on 11/11/2015.
 */
public class Home extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homelayout);


            startActivity(new Intent("com.vamsi.malneedi.mycalc.MainActivity1"));

           }
}
