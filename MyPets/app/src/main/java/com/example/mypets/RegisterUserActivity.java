package com.example.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUserActivity extends AppCompatActivity {

    private EditText user_name,passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        user_name = findViewById(R.id.txtusername);
        passwd = findViewById(R.id.txtpassword);
    }

    public void btnSignup (View view) {
        Database manager = new Database(this, "mypets",null,1);

        SQLiteDatabase mypets = manager.getWritableDatabase();

        String UNAME = user_name.getText().toString();
        String PASSWD = passwd.getText().toString();

        ContentValues data = new ContentValues();

        data.put("email",UNAME);
        data.put("password ",PASSWD);

        mypets.insert("users",null,data);
        mypets.close();

        Toast.makeText(this,"The user has been created", Toast.LENGTH_LONG).show();
    }
}