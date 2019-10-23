package com.genzvirus.hexy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean decimal = true;
    private boolean octal = false;
    private boolean binary = false;
    private boolean hexBool = false;

    private int decLimit = 9;
    private int binLimit = 30;
    private int octLimit = 10;
    private int hexLimit = 7;

    private TextView num0;
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    private TextView num6;
    private TextView num7;
    private TextView num8;
    private TextView num9;
    private TextView numA;
    private TextView numB;
    private TextView numC;
    private TextView numD;
    private TextView numE;
    private TextView numF;

    private TextView dec;
    private TextView bin;
    private TextView oct;
    private TextView hex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.num0 = (TextView) findViewById(R.id.textViewNum0);
        this.num1 = (TextView) findViewById(R.id.textViewNum1);
        this.num2 = (TextView) findViewById(R.id.textViewNum2);
        this.num3 = (TextView) findViewById(R.id.textViewNum3);
        this.num4 = (TextView) findViewById(R.id.textViewNum4);
        this.num5 = (TextView) findViewById(R.id.textViewNum5);
        this.num6 = (TextView) findViewById(R.id.textViewNum6);
        this.num7 = (TextView) findViewById(R.id.textViewNum7);
        this.num8 = (TextView) findViewById(R.id.textViewNum8);
        this.num9 = (TextView) findViewById(R.id.textViewNum9);
        this.numA = (TextView) findViewById(R.id.textViewNumA);
        this.numB = (TextView) findViewById(R.id.textViewNumB);
        this.numC = (TextView) findViewById(R.id.textViewNumC);
        this.numD = (TextView) findViewById(R.id.textViewNumD);
        this.numE = (TextView) findViewById(R.id.textViewNumE);
        this.numF = (TextView) findViewById(R.id.textViewNumF);

        this.dec = (TextView) findViewById(R.id.textViewDecOutput);
        this.bin = (TextView) findViewById(R.id.textViewBinOutput);
        this.oct = (TextView) findViewById(R.id.textViewOctOutput);
        this.hex = (TextView) findViewById(R.id.textViewHexOutput);

        if(decimal && !octal && !binary && !hexBool){
            num0.setClickable(true);
            num1.setClickable(true);
            num2.setClickable(true);
            num3.setClickable(true);
            num4.setClickable(true);
            num5.setClickable(true);
            num6.setClickable(true);
            num7.setClickable(true);
            num8.setClickable(true);
            num9.setClickable(true);
            numA.setClickable(false);
            numB.setClickable(false);
            numC.setClickable(false);
            numD.setClickable(false);
            numE.setClickable(false);
            numF.setClickable(false);
        }
    }

    public void onClickDec(View v){
        decimal = true;
        octal = false;
        binary = false;
        hexBool = false;

            num0.setClickable(true);
            num1.setClickable(true);
            num2.setClickable(true);
            num3.setClickable(true);
            num4.setClickable(true);
            num5.setClickable(true);
            num6.setClickable(true);
            num7.setClickable(true);
            num8.setClickable(true);
            num9.setClickable(true);
            numA.setClickable(false);
            numB.setClickable(false);
            numC.setClickable(false);
            numD.setClickable(false);
            numE.setClickable(false);
            numF.setClickable(false);

            dec.setText("");
            bin.setText("");
            oct.setText("");
            hex.setText("");
    }

    public void onClickOct(View v){
        decimal = false;
        octal = true;
        binary = false;
        hexBool = false;

        num0.setClickable(true);
        num1.setClickable(true);
        num2.setClickable(true);
        num3.setClickable(true);
        num4.setClickable(true);
        num5.setClickable(true);
        num6.setClickable(true);
        num7.setClickable(true);
        num8.setClickable(false);
        num9.setClickable(false);
        numA.setClickable(false);
        numB.setClickable(false);
        numC.setClickable(false);
        numD.setClickable(false);
        numE.setClickable(false);
        numF.setClickable(false);

        dec.setText("");
        bin.setText("");
        oct.setText("");
        hex.setText("");
    }

    public void onClickBin(View v){
        decimal = false;
        octal = false;
        binary = true;
        hexBool = false;

        num0.setClickable(true);
        num1.setClickable(true);
        num2.setClickable(false);
        num3.setClickable(false);
        num4.setClickable(false);
        num5.setClickable(false);
        num6.setClickable(false);
        num7.setClickable(false);
        num8.setClickable(false);
        num9.setClickable(false);
        numA.setClickable(false);
        numB.setClickable(false);
        numC.setClickable(false);
        numD.setClickable(false);
        numE.setClickable(false);
        numF.setClickable(false);

        dec.setText("");
        bin.setText("");
        oct.setText("");
        hex.setText("");
    }

    public void onClickHex(View v){
        decimal = false;
        octal = false;
        binary = false;
        hexBool = true;

        num0.setClickable(true);
        num1.setClickable(true);
        num2.setClickable(true);
        num3.setClickable(true);
        num4.setClickable(true);
        num5.setClickable(true);
        num6.setClickable(true);
        num7.setClickable(true);
        num8.setClickable(true);
        num9.setClickable(true);
        numA.setClickable(true);
        numB.setClickable(true);
        numC.setClickable(true);
        numD.setClickable(true);
        numE.setClickable(true);
        numF.setClickable(true);

        dec.setText("");
        bin.setText("");
        oct.setText("");
        hex.setText("");
    }

    public void onClick(View v){
        if(decimal) {
            focusOn(dec,v,decLimit);
            bin.setText(dec.getText().toString().length() > 0 && dec.getText().toString() != null ? Dec.toBin(Integer.valueOf(dec.getText().toString())) : "");
            oct.setText(dec.getText().toString().length() > 0 && dec.getText().toString() != null ? Dec.toOct(Integer.valueOf(dec.getText().toString())) : "");
            hex.setText(dec.getText().toString().length() > 0 && dec.getText().toString() != null ? Dec.toHex(Integer.valueOf(dec.getText().toString())) : "");
        }
        else if(binary){
            focusOn(bin,v,binLimit);
            dec.setText(bin.getText().toString().length() > 0 && bin.getText().toString() != null ? Integer.toString(Bin.toDec(bin.getText().toString())) : "");
            oct.setText(bin.getText().toString().length() > 0 && bin.getText().toString() != null ? Bin.toOct(bin.getText().toString()) : "");
            hex.setText(bin.getText().toString().length() > 0 && bin.getText().toString() != null ? Bin.toHex(bin.getText().toString()).toUpperCase() : "");
        }
        else if(octal){
            focusOn(oct,v,octLimit);
            dec.setText(oct.getText().toString().length() > 0 && oct.getText().toString() != null ? Integer.toString(Oct.toDec(oct.getText().toString())) : "");
            bin.setText(oct.getText().toString().length() > 0 && oct.getText().toString() != null ? Oct.toBin(oct.getText().toString()) : "");
            hex.setText(oct.getText().toString().length() > 0 && oct.getText().toString() != null ? Oct.toHex(oct.getText().toString()).toUpperCase() : "");
        }
        else if(hexBool){
            focusOn(hex,v,hexLimit);
            dec.setText(hex.getText().toString().length() > 0 && hex.getText().toString() != null ? Integer.toString(Hex.toDec(hex.getText().toString())) : "");
            bin.setText(hex.getText().toString().length() > 0 && hex.getText().toString() != null ? Hex.toBin(hex.getText().toString()) : "");
            oct.setText(hex.getText().toString().length() > 0 && hex.getText().toString() != null ? Hex.toOct(hex.getText().toString()) : "");
        }
    }

    private void focusOn(TextView tv, View v,int limit){
        String copy = tv.getText().toString();
        if (((TextView) v) != (TextView) findViewById(R.id.textViewBS)) {
            if (tv.getText().toString().length() < limit)
                tv.append(((TextView) v).getText().toString());
            copy = tv.getText().toString();
        } else {
            if (copy != null && copy.length() > 0) {
                copy = copy.substring(0, copy.length() - 1);
                tv.setText(copy);
            }
        }
    }

}
