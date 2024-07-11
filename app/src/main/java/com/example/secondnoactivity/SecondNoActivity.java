package com.example.secondnoactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondNoActivity extends AppCompatActivity {
    private String total = "hello";
//    public static int generateRandomNumber() {
//        // 创建 Random 对象
//        Random random = new Random();
//
//        // 生成在[min, max]范围内的随机整数
//        return random.nextInt(100);
//    }
    public static int generateRandomNumber(String tempString) {
        // 创建 Random 对象
        Random random = new Random();
        Log.d("one","generateNumber!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // 生成在[min, max]范围内的随机整数
        return random.nextInt(Integer.parseInt(tempString));
    }
    public static void staticsecret(){
        Log.d("one","jinlaile_one");
    }
    public void secret(){
        Log.d("two","jinlaile_two");
        total += "_secret";
    }
    public static int add(String a, String b) {
        int total = Integer.valueOf(a) + Integer.valueOf(b);
        return total;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_check = findViewById(R.id.check);
        TextView textView = findViewById(R.id.textView);
        bt_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(generateRandomNumber("300")));
            }
        });

    }
}