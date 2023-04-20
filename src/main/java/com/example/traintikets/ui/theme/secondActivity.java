package com.example.traintikets.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.traintikets.MainActivity3;
import com.example.traintikets.R;

public class secondActivity extends AppCompatActivity {
    private TextView textView7 ;
    private Button button;
    private user user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView7=findViewById(R.id.textView7);
        button=findViewById(R.id.button2);

        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent != null){

         user = (user) bundleIntent.getSerializable(user.class.getSimpleName());
         textView7.setText("Имя"+user.getName()+"\n" +
                 "отправление /прибытие"+user.getNameIn()+"\n"
                 +"время"+user.getNumber());
        }
        button.setOnClickListener(listener);

    }
    private View.OnClickListener listener=new OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent =new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);

        }
    };
}