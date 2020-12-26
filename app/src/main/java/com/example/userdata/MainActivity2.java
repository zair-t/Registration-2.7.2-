package com.example.userdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    EditText e_log;
    EditText e_pass;
    Button btn;
    String r_login;
    String r_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e_log = findViewById(R.id.editTextTextEmailAddress2);
        e_pass = findViewById(R.id.editTextTextPassword2);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }
    public void onClick(View v){
        r_login = e_log.getText().toString();
        r_password = e_pass.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("editTextTextEmailAddress", r_login);
        startActivity(i);
    }
}