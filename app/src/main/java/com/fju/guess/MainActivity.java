package com.fju.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText num;
    Button send;
    int secret = 87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) this.findViewById(R.id.secret);
        send = (Button) this.findViewById(R.id.send);
        Random r = new Random();
        secret = r.nextInt(99)+1;
    }

    public void Answer(View view){
        String s1 = num.getText().toString();
        int n1 = Integer.parseInt(s1);
        String msg;

        if (n1 == secret){
            msg = "Yes, the number is 87";
            send.setEnabled(false);
        } else if (n1>secret){
            msg = " 1 to " + secret;
        } else {
            msg = secret + "to 100";
        }
        //為什麼程式開不起來....已經山窮水盡了

    }
}
