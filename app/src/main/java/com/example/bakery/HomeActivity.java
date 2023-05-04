package com.example.bakery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    ImageView img1,profile,diallog;
    ImageButton cart,Order;
    TextView cart_text,continue_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initview();
    }

    private void initview() {
        img1=findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this , DetailsActivity.class);
                startActivity(i);
            }
        });
        profile=findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this , ProfileActivity.class);
                startActivity(i);
            }
        });
        cart=findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this , CartActivity.class);
                startActivity(i);
            }
        });
        Order=findViewById(R.id.Order);
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this , OrderActivity.class);
                startActivity(i);
            }
        });

        diallog=findViewById(R.id.diallog);
        Dialog dialog = new Dialog(HomeActivity.this);
        diallog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    dialog.setContentView(R.layout.dialog_layout);
                    dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    dialog.setCancelable(false);
                    dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

                    cart_text = dialog.findViewById(R.id.cart_text);
                    continue_text = dialog.findViewById(R.id.continue_text);

                    cart_text.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Toast.makeText(HomeActivity.this, "Go to Cart", Toast.LENGTH_SHORT).show();
                        }
                    });

                    continue_text.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                            Toast.makeText(HomeActivity.this, "Continue Shoping", Toast.LENGTH_SHORT).show();
                        }
                    });

                    dialog.show();

                }

        });

    }
}