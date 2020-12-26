package com.example.userdata;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText password;
    private EditText login;
    private TextView textView;
    final String real_pass = "MyPasswordIs";
    final String real_log = "MyLoginIs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.editTextTextEmailAddress);
        Button check = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String getIntentText = intent.getStringExtra("editTextTextEmailAddress");
        login.setText(getIntentText);
        check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String enter_log = login.getText().toString();
        String enter_pass = password.getText().toString();
        if(real_log.equals(enter_log) && real_pass.equals(enter_pass)){
            textView.setTextColor(Color.parseColor("#00FF00"));
            textView.setText(getResources().getString(R.string.right));
        }
        else{
            password.setText("");
            Intent openActivity2 = new Intent(this, MainActivity2.class);
            startActivity(openActivity2);
        }
    }
}