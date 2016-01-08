package com.tacademy.jeongho.hellopj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
//    onXXX -> callback 메소드
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        R.layout.activity_main -> 리소스
        setContentView(R.layout.activity_main);
    }
}
