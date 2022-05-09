package com.example.sm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    //    getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    }
    public void  buttonToSignup(View view){
       // Toast.makeText(this,"working",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,signup_Activity.class);
        startActivity(intent);
    }



}