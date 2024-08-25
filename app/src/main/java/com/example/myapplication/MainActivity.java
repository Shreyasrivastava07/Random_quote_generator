package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.tv1);
        button= (Button) findViewById(R.id.btn);
        String quotes[]={"Everything has beauty, but not everyone sees it",
                "Time is money","Honesty is the best policy",
                "Believe you can and you are halfway there",
                "Every saint has a past and every sinner has a future",
                "Perfection is not attainable but if we catch perfection we can attain excellence",
                "The way I see it, if you want the rainbow, you gotta put up the rain",
                "Nothing is impossible, the word itself says 'I'm possible",
                "When you have a dream, go grab it and never let go",
                "Either you run the day or the day runs you",
                "If you can change your mind, you can change your life",
                "Life is made of ever so many partings together",
                "If you change the way you look at things, the things you look at change",
                "Only do what your heart tells you",
                "Happiness held is the seed, happiness shared is the flower",
                "Just one small positive thought in the morning can change your whole day",
                "You are just enough as you are!",
                "You are the greatest project you will ever work on.",
                "When you've a dream, you've got to grab it and never let go"
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random= new Random();
                int num = random.nextInt(quotes.length);
                textView.setText(quotes[num]);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}