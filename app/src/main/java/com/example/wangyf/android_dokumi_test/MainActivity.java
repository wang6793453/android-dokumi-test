package com.example.wangyf.android_dokumi_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.test1);
        textView.setText("aaaaaaaaaaaaaaaaaaaa");


        if (true){
            Integer i = null;
            i.toString();

        }

        method();
    }

    public void method() {
        String text = null;
        System.out.println("text.length=" + text.length());

        try {
            InputStream in = new FileInputStream(new File("./test"));
        } catch (IOException e) {
        }
    }

}
