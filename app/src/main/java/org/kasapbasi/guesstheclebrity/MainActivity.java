package org.kasapbasi.guesstheclebrity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    ImageView imCelep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button)findViewById(R.id.btnOpt1);
        btn2 =(Button)findViewById(R.id.btnOpt2);
        btn3 =(Button)findViewById(R.id.btnOpt3);
        btn4 =(Button)findViewById(R.id.btnOpt4);
    imCelep=(ImageView) findViewById(R.id.ivCeleb);

    }
}
