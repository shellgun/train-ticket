package com.example.traintikets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.traintikets.ui.theme.secondActivity;
import com.example.traintikets.ui.theme.user;

public class MainActivity3 extends AppCompatActivity {

private EditText nameIn;
private EditText time;
private EditText place ;
private Button button;

private  String name ;
private String number ;
private String NameIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameIn = findViewById(R.id.editTextText);
        time=findViewById(R.id.editTextTime);
        place=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);

        button.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            name=nameIn.getText().toString();
            place=NameIn.getText().toString();
            time =number.getText().toString();

            user user = new user(name,number,NameIn);

            Intent intent=new Intent(getApplicationContext(), secondActivity.class);

            intent.putExtra(user.class.getSimpleName(),user);

            startActivity(intent);
        }

    };

}