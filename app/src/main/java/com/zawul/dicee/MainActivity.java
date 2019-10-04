package com.zawul.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgleft;
    ImageView imgright;
    Button btnroll;
int[] imgDices =  {
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6,
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgleft = findViewById(R.id.imgleft);
        imgright = findViewById(R.id.imgright);
        btnroll = findViewById(R.id.btnroll);
        btnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rRandom = new Random();
                int numbers = rRandom.nextInt(6);
               imgleft.setImageResource(imgDices[numbers]);
               numbers = rRandom.nextInt(6);
               imgright.setImageResource(imgDices[numbers]);
            }
        });
    }
}
