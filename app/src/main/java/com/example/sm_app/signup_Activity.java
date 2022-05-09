package com.example.sm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class signup_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

    }
    public void  buttonToLogin(View view){
//        Toast.makeText(this,"working",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,login_Activity.class);
        startActivity(intent);
    }
}