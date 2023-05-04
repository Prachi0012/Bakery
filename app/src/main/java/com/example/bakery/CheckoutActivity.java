package com.example.bakery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class CheckoutActivity extends AppCompatActivity {
    TextView  completeord,status_text,continue_text;
    CircleImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        initview();
    }

    private void initview() {
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CheckoutActivity.this,CheckoutActivity2.class);
                startActivity(i);
            }
        });
        completeord=findViewById(R.id.completeord);
        Dialog dialog = new Dialog(CheckoutActivity.this);
        completeord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.setContentView(R.layout.dialog_layout);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

                status_text = dialog.findViewById(R.id.status_text);
                continue_text = dialog.findViewById(R.id.continue_text);

                status_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        Toast.makeText(CheckoutActivity.this, "Go to Cart", Toast.LENGTH_SHORT).show();
                    }
                });

                continue_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(CheckoutActivity.this, "Continue Shoping", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }

        });
    }
}