package com.example.bakery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class LogiinActivity extends AppCompatActivity {
    CardView loginbttn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logiin);
        initview();
    }

    private void initview() {
        loginbttn=findViewById(R.id.loginbttn);
        loginbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogiinActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
    }

}