package com.example.tm01_22090043_akhmadyasin_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.mytext);
        btn=(Button) findViewById(R.id.mybutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("MESSAGE    : Data Received\n\nSTATUS       : Halo Siswa Algo2\n\nCOMMENT   : Anda Sudah Terkoneksi");
            }
        });
        Button btnMinimize = findViewById(R.id.btn_minimize);
        btnMinimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });

    }

    public void clickexit(View v)
    {
        moveTaskToBack(true);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}