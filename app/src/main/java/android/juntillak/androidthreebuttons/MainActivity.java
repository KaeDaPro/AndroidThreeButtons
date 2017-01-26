package android.juntillak.androidthreebuttons;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView changeButton1;
    private TextView changeButton2;
    private TextView changeButton3;
    private TextView changeButton4;
    private TextView changeButton5;
    private TextView changeButton6;
    private TextView changeButton7;
    private TextView changeButton8;
    private TextView changeButton9;

    public int playerOne = 1;
    public int playerTwo = 2;

    private int clickState1 = -1;
    private int clickState2 = -2;
    private int clickState3 = -3;
    private int clickState4 = -4;
    private int clickState5 = -5;
    private int clickState6 = -6;
    private int clickState7 = -7;
    private int clickState8 = -8;
    private int clickState9 = -9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeButton1 = (TextView) findViewById(R.id.circle1);
        changeButton2 = (TextView) findViewById(R.id.circle2);
        changeButton3 = (TextView) findViewById(R.id.circle3);
        changeButton4 = (TextView) findViewById(R.id.circle4);
        changeButton5 = (TextView) findViewById(R.id.circle5);
        changeButton6 = (TextView) findViewById(R.id.circle6);
        changeButton7 = (TextView) findViewById(R.id.circle7);
        changeButton8 = (TextView) findViewById(R.id.circle8);
        changeButton9 = (TextView) findViewById(R.id.circle9);

        clickState1 = playerOne;



    }

    public void circleChange1(View view){

        if( clickState1 ==1) {
            changeButton1.setText("O");
            clickState1=2;
        } else{
            changeButton1.setText("X");
            clickState1=1;
        }

        check3inarow();
    }

    public void circleChange2(View view){
        changeButton2.setText("O");
        if( clickState2 ==1) {
            changeButton2.setText("O");
            clickState2=2;
        } else{
            changeButton2.setText("X");
            clickState2=1;
        }

        check3inarow();

    }

    public void circleChange3(View view){
        changeButton3.setText("O");
        if( clickState3 ==1) {
            changeButton3.setText("O");
            clickState3=2;
        } else{
            changeButton3.setText("X");
            clickState3=1;
        }

        check3inarow();
    }

    public void circleChange4(View view){
        changeButton4.setText("O");
        if( clickState4 ==1) {
            changeButton4.setText("O");
            clickState4=2;
        } else{
            changeButton4.setText("X");
            clickState4=1;
        }

        check3inarow();
    }

    public void circleChange5(View view){
        changeButton5.setText("O");
        if( clickState5 ==1) {
            changeButton5.setText("O");
            clickState5=2;
        } else{
            changeButton5.setText("X");
            clickState5=1;
        }

        check3inarow();
    }

    public void circleChange6(View view){
        changeButton6.setText("O");
        if( clickState6 ==1) {
            changeButton6.setText("O");
            clickState6=2;
        } else{
            changeButton6.setText("X");
            clickState6=1;
        }

        check3inarow();
    }

    public void circleChange7(View view){
        changeButton7.setText("O");
        if( clickState7 ==1) {
            changeButton7.setText("O");
            clickState7=2;
        } else{
            changeButton7.setText("X");
            clickState7=1;
        }

        check3inarow();
    }

    public void circleChange8(View view){
        changeButton8.setText("O");
        if( clickState8 ==1) {
            changeButton8.setText("O");
            clickState8=2;
        } else{
            changeButton8.setText("X");
            clickState8=1;
        }

        check3inarow();
    }

    public void circleChange9(View view){
        changeButton9.setText("O");
        if( clickState9 ==1) {
            changeButton9.setText("O");
            clickState9=2;
        } else{
            changeButton9.setText("X");
            clickState9=1;
        }

        check3inarow();
    }

    public void check3inarow(){
            if (clickState1 == clickState2 && clickState3 == clickState2){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

            if (clickState4 == clickState5 && clickState6 == clickState5){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

            if (clickState7 == clickState8 && clickState9 == clickState8){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();
            }

            if (clickState1 == clickState4 && clickState7 == clickState4){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();
            }

            if(clickState2 == clickState5 && clickState8 == clickState5){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

            if(clickState3 == clickState6 && clickState9 == clickState6){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

            if(clickState1 == clickState5 && clickState9 == clickState5){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

            if(clickState3 == clickState5 && clickState7 == clickState5){
                CharSequence text = "You Won";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast myMessage= Toast.makeText(context, text, duration);
                myMessage.show();

            }

    }
}
