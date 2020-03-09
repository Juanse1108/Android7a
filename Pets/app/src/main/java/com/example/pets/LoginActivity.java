package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_Login(View view){
        Toast.makeText(this, "Your have pressed Login Button", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(  this,  InboxActivity.class);
        startActivity(intent);
    }
    public void btn_Signup(View view){
        Toast.makeText(this, "Your have pressed Sign up Button", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(  this,  InboxActivity.class);
        startActivity(intent);
    }

}
