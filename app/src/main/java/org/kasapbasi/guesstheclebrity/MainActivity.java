package org.kasapbasi.guesstheclebrity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    ImageView imCelep;
    String[] imgs= new String[100];
    String[] names= new String[100];

public class ContentDownloader extends AsyncTask<String,Void,String>{

//https://www.imdb.com/list/ls059786955/?sort=list_order,asc&mode=detail&page=1

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }
}


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
