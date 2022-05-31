package com.example.sm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
   // TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ApiInterface apiInterface;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
        apiInterface.getpost().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response) {

                if (response.body().size()>0){
                    Toast.makeText(MainActivity.this, "List is not empty", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "List is empty", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<PostPojo>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();

            }
        });





    }
    public void  buttonToSignup(View view){
       // Toast.makeText(this,"working",Toast.LENGTH_SHORT).show();
        Intent intentToLoginPage = new Intent(this,log_sin.class);
        startActivity(intentToLoginPage);
    }
}