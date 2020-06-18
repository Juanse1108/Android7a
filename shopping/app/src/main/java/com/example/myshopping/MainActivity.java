package com.example.myshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private ArrayList<String> names;

    private EditText nproduc;
    private EditText cant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        names= new ArrayList<String>();
    }

    public void btnadd(View view){
        nproduc= (EditText) findViewById(R.id.editText3);
        cant= (EditText) findViewById(R.id.editText4);
        names.add(nproduc.getText().toString() + " \n"+cant.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter);
    }

    public void bntbuy(View view){
        names.clear();
        listview.setAdapter(null);
        nproduc.setText("");
        cant.setText("");
    }
}