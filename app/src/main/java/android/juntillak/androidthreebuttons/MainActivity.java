package android.juntillak.androidthreebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView changeButton1;
    private TextView changeButton2;
    private TextView changeButton3;

    private int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeButton1 = (TextView) findViewById(R.id.circle1);
        changeButton2 = (TextView) findViewById(R.id.circle2);
        changeButton3 = (TextView) findViewById(R.id.circle3);


    }

    public void circleChange1(View view){
        changeButton1.setText("O");
        if( x ==0) {
            changeButton1.setText("O");
            x=1;
        } else{
            changeButton1.setText("X");
            x=0;
        }
    }

    public void circleChange2(View view){
        changeButton2.setText("O");
        if( x ==0) {
            changeButton2.setText("O");
            x=1;
        } else{
            changeButton2.setText("X");
            x=0;
        }

    }

    public void circleChange3(View view){
        changeButton3.setText("O");
        if( x ==0) {
            changeButton3.setText("O");
            x=1;
        } else{
            changeButton3.setText("X");
            x=0;
        }
    }
}
