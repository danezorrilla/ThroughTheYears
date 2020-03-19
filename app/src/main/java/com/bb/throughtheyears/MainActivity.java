package com.bb.throughtheyears;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ageTextView;
    private TextView messageTextView;

    private String appAge = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageTextView = findViewById(R.id.age);
        messageTextView = findViewById(R.id.special_message);

        appAge = ageTextView.getText().toString();

        ageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG_X", appAge);

                int age = Integer.parseInt(appAge);
                age++;

                if(age > 0 ){messageTextView.setText("Infant");}
                if(age > 2){messageTextView.setText("Toddler");}
                if(age > 4){messageTextView.setText("Childhood");}
                if(age > 11){messageTextView.setText("Teenager");}
                if(age == 16){messageTextView.setText("You can drive!!!");}
                if(age == 18){messageTextView.setText("You can vote!!!");}
                if(age > 19){messageTextView.setText("Adult");}
                if(age == 21){messageTextView.setText("You can drink!!!");}
                if(age > 54){messageTextView.setText("Senior");}
                if(age == 65){messageTextView.setText("You can retire");}
                if(age == 79){messageTextView.setText("Death");
                    age = 0;
                    messageTextView.setText("New Born");
                }

                appAge = age + "";

                ageTextView.setText(appAge);
            }
        });

    }
}
