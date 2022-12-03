package com.kradwan.masteropensource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    Button btnRunTheCode;
    TextView tvResult;

    private final AtomicInteger counter = new AtomicInteger(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRunTheCode = findViewById(R.id.btn_run_the_code);
        tvResult = findViewById(R.id.tv_result);

        btnRunTheCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO There an Bug Here
                tvResult.setText( counter.incrementAndGet());
            }
        });
    }
}