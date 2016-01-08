package com.tacademy.jeongho.hellopj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button btn;
    @Override
//    onXXX -> callback 메소드
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        R.layout.activity_main -> 리소스
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text_message);
        editText = (EditText)findViewById(R.id.edit_input);
        btn = (Button)findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });


    }
}
