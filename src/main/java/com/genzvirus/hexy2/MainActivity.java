package com.genzvirus.hexy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
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

    private ImageView num0;
    private ImageView num1;
    private ImageView num2;
    private ImageView num3;
    private ImageView num4;
    private ImageView num5;
    private ImageView num6;
    private ImageView num7;
    private ImageView num8;
    private ImageView num9;
    private ImageView numA;
    private ImageView numB;
    private ImageView numC;
    private ImageView numD;
    private ImageView numE;
    private ImageView numF;

    private ImageView decBtn;
    private ImageView binBtn;
    private ImageView octBtn;
    private ImageView hexBtn;

    private ImageView BS;
    private int resID;
    private ImageView image;

    private TextView dec;
    private TextView bin;
    private TextView oct;
    private TextView hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.num0 = (ImageView) findViewById(R.id.imageViewNum0);
        this.num1 = (ImageView) findViewById(R.id.imageViewNum1);
        this.num2 = (ImageView) findViewById(R.id.imageViewNum2);
        this.num3 = (ImageView) findViewById(R.id.imageViewNum3);
        this.num4 = (ImageView) findViewById(R.id.imageViewNum4);
        this.num5 = (ImageView) findViewById(R.id.imageViewNum5);
        this.num6 = (ImageView) findViewById(R.id.imageViewNum6);
        this.num7 = (ImageView) findViewById(R.id.imageViewNum7);
        this.num8 = (ImageView) findViewById(R.id.imageViewNum8);
        this.num9 = (ImageView) findViewById(R.id.imageViewNum9);
        this.numA = (ImageView) findViewById(R.id.imageViewNumA);
        this.numB = (ImageView) findViewById(R.id.imageViewNumB);
        this.numC = (ImageView) findViewById(R.id.imageViewNumC);
        this.numD = (ImageView) findViewById(R.id.imageViewNumD);
        this.numE = (ImageView) findViewById(R.id.imageViewNumE);
        this.numF = (ImageView) findViewById(R.id.imageViewNumF);

        this.decBtn = (ImageView) findViewById(R.id.imageViewDecBtn);
        this.octBtn = (ImageView) findViewById(R.id.imageViewOctBtn);
        this.hexBtn = (ImageView) findViewById(R.id.imageViewHexBtn);
        this.binBtn = (ImageView) findViewById(R.id.imageViewBinBtn);

        this.BS = (ImageView) findViewById(R.id.imageViewBS);

        this.dec = (TextView) findViewById(R.id.textViewDecOutput);
        this.bin = (TextView) findViewById(R.id.textViewBinOutput);
        this.oct = (TextView) findViewById(R.id.textViewOctOutput);
        this.hex = (TextView) findViewById(R.id.textViewHexOutput);

        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        decBtn.getLayoutParams().height=displayMetrics.widthPixels/8;
        decBtn.getLayoutParams().width=displayMetrics.widthPixels/8*2;
        decBtn.requestLayout();
        octBtn.getLayoutParams().height=displayMetrics.widthPixels/8;
        octBtn.getLayoutParams().width=displayMetrics.widthPixels/8*2;
        octBtn.requestLayout();
        hexBtn.getLayoutParams().height= displayMetrics.widthPixels/8;
        hexBtn.getLayoutParams().width=displayMetrics.widthPixels/8*2;
        hexBtn.requestLayout();
        binBtn.getLayoutParams().height=displayMetrics.widthPixels/8;
        binBtn.getLayoutParams().width=displayMetrics.widthPixels/8*2;
        binBtn.requestLayout();

        num1.getLayoutParams().height=num1.getLayoutParams().width=displayMetrics.widthPixels/5;
        num1.requestLayout();
        num2.getLayoutParams().height=num2.getLayoutParams().width=displayMetrics.widthPixels/5;
        num2.requestLayout();
        num3.getLayoutParams().height=num3.getLayoutParams().width=displayMetrics.widthPixels/5;
        num3.requestLayout();
        numA.getLayoutParams().height=numA.getLayoutParams().width=displayMetrics.widthPixels/5;
        numA.requestLayout();
        numB.getLayoutParams().height=numB.getLayoutParams().width=displayMetrics.widthPixels/5;
        numB.requestLayout();

        num4.getLayoutParams().height=num4.getLayoutParams().width=displayMetrics.widthPixels/5;
        num4.requestLayout();
        num5.getLayoutParams().height=num5.getLayoutParams().width=displayMetrics.widthPixels/5;
        num5.requestLayout();
        num6.getLayoutParams().height=num6.getLayoutParams().width=displayMetrics.widthPixels/5;
        num6.requestLayout();
        numC.getLayoutParams().height=numC.getLayoutParams().width=displayMetrics.widthPixels/5;
        numC.requestLayout();
        numD.getLayoutParams().height=numD.getLayoutParams().width=displayMetrics.widthPixels/5;
        numD.requestLayout();

        num7.getLayoutParams().height=num7.getLayoutParams().width=displayMetrics.widthPixels/5;
        num7.requestLayout();
        num8.getLayoutParams().height=num8.getLayoutParams().width=displayMetrics.widthPixels/5;
        num8.requestLayout();
        num9.getLayoutParams().height=num9.getLayoutParams().width=displayMetrics.widthPixels/5;
        num9.requestLayout();
        numE.getLayoutParams().height=numE.getLayoutParams().width=displayMetrics.widthPixels/5;
        numE.requestLayout();
        numF.getLayoutParams().height=numF.getLayoutParams().width=displayMetrics.widthPixels/5;
        numF.requestLayout();

        num0.getLayoutParams().height=displayMetrics.widthPixels/5;
        num0.getLayoutParams().width=displayMetrics.widthPixels/5*3;
        num0.requestLayout();
        BS.getLayoutParams().height=displayMetrics.widthPixels/5;
        BS.getLayoutParams().width=displayMetrics.widthPixels/5*2;
        BS.requestLayout();

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

        changeImage(v);

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

        changeImage(v);

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

        changeImage(v);

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

        changeImage(v);

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
        changeImage(v);
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
        String text = v.getTag().toString();
        text = Character.toString(text.charAt(text.length()-1)).toUpperCase();
        String copy = tv.getText().toString();
        if (((ImageView) v) != (ImageView) findViewById(R.id.imageViewBS)) {
            if (tv.getText().toString().length() < limit)
                tv.append(text);
            copy = tv.getText().toString();
        } else {
            if (copy != null && copy.length() > 0) {
                copy = copy.substring(0, copy.length() - 1);
                tv.setText(copy);
            }
        }
    }

    private void changeImage(View v){
        String name = v.getTag().toString() + "_on";
        resID = getResources().getIdentifier(name , "drawable", getPackageName());
        image = (ImageView) v;
        image.setImageResource(resID);

        name = v.getTag().toString() + "_off";
        resID = getResources().getIdentifier(name , "drawable", getPackageName());

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                image.setImageResource(resID);
            }
        }, 50);


    }

}
