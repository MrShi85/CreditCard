package com.shilkin.sergey.creditcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mSumCredit;
    private EditText mSumProc;
    private EditText mSumPay;
    private Button mRaschetButton;

    private double mSum;
    private double mProc;
    private double mPay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSumCredit = (EditText)findViewById(R.id.sumCredit);

        mSumCredit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence c, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                mSum = Double.parseDouble(c.toString());
            }

            @Override
            public void afterTextChanged(Editable c) {

            }
        });

        mRaschetButton = (Button) findViewById(R.id.buttonCalc);
        mRaschetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


    }
}
