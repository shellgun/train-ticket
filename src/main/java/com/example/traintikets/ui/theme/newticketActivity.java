package com.example.traintikets.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.traintikets.MainActivity3;
import com.example.traintikets.R;

public class newticketActivity extends AppCompatActivity {

    private Button button ;

    private TextView newTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newticket);

        button=button.findViewById(R.id.button3);
        newTicket=newTicket.findViewById(R.id.newTicket);

    }
    public void onClickC(View view){
        Intent intent = new Intent(this,MainActivity3.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}