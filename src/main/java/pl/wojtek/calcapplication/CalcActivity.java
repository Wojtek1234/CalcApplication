package pl.wojtek.calcapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        setClickers();
    }

    private void setClickers() {

        Button but=(Button)findViewById(R.id.timesBut);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doTimes();
            }
        });

        Button but2=(Button)findViewById(R.id.byBut);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doBy();
            }

        });

        Button but3=(Button)findViewById(R.id.plusBut);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doPlus();
            }

        });

        Button but4=(Button)findViewById(R.id.minusBut);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMinus();
            }

        });


    }

    private void doMinus() {

        double result=getFirstArg()-getSecondArg();
        setResultText(String.valueOf(result));
    }

    private void doPlus() {
        double result=getFirstArg()+getSecondArg();
        setResultText(String.valueOf(result));
    }

    private void doBy() {

        double result=getFirstArg()/getSecondArg();

        setResultText(String.valueOf(result));
    }

    private void doTimes() {
        double result=getFirstArg()*getSecondArg();

        setResultText(String.valueOf(result));

    }
    private void setResultText(String text){
        TextView textView=(TextView)findViewById(R.id.resultView);
        textView.setText(text);
    }

    private double getFirstArg(){
        return getArg((EditText)findViewById(R.id.firstArgEdit));
    }
    private double getSecondArg(){
        return getArg((EditText)findViewById(R.id.secondArgEdit));
    }

    private double getArg(EditText editText){
      return   Double.parseDouble(editText.getText().toString());
    }
}
