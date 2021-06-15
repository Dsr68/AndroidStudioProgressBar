package com.dalisonsr.barradeprogresso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private Button botao;
    private int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.pHorizontal);
        progressBarCircular = findViewById(R.id.pCircular);
        botao = findViewById(R.id.btnProgresso);

        progressBarHorizontal.setMax(100);
        progressBarCircular.setVisibility(View.GONE);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progresso = progresso + 10;
                progressBarHorizontal.setProgress(progresso);
                progressBarCircular.setVisibility(View.VISIBLE);

                if(progresso == 100){
                    progressBarCircular.setVisibility(View.GONE);
                }
            }
        });
    }
}
