package com.example.yazi_tura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt;
    ImageView img;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button2);
        txt=findViewById(R.id.textView2);
        img=findViewById(R.id.imageView4);
        img=findViewById(R.id.imageView5);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int val=random.nextInt(2);
        if (val==1){
            img.setImageResource(R.drawable.tura);
            txt.setText("TURA");

                }
        else{
            img.setImageResource(R.drawable.yazi);
            txt.setText("YAZI");
        }
            }
        }
        );
    }
}