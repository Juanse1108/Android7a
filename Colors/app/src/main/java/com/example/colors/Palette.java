package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Palette extends AppCompatActivity
        implements SeekBar.OnSeekBarChangeListener {

    private SeekBar vRed = null;
    private SeekBar vGreen = null;
    private SeekBar vBlue = null;
    private SeekBar vAlpha = null;
    private View vFilter = null;
    private TextView color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

       // iteHelp itehelp =(itHelp)findViewById(R.id.iteHelp);
        //itehelp.setOnClickListener(this);

        //Code here .....
        //Get components' id's
        vRed = findViewById(R.id.sbrRed);
        vGreen = findViewById(R.id.sbrGreen);
        vBlue = findViewById(R.id.sbrBlue);
        vAlpha = findViewById(R.id.sbrAlpha);
        vFilter = findViewById(R.id.vieColors);
        color = (TextView) findViewById(R.id.color);

        vRed.setOnSeekBarChangeListener(this);
        vGreen.setOnSeekBarChangeListener(this);
        vBlue.setOnSeekBarChangeListener(this);
        vAlpha.setOnSeekBarChangeListener(this);

        //Show the context menu WHEN I do a long press in the component
        registerForContextMenu(vFilter);
    }

    //#############################################
    //OPTIONS MENU
    //#############################################
    //Show the options menu on the Device.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);

    }

    //Item actions.
    @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){

            case R.id.icHelp :
                Intent intent = new Intent(this, Activity_help.class);
                startActivity(intent);
                break;

            case R.id.icTransparent :
                vAlpha.setProgress(0);
              break;

                  case R.id.iteColors:
     vAlpha.setProgress(0);
                Toast.makeText(this, "This color is going to change", Toast.LENGTH_SHORT).show();
              break;

               case R.id.iteReset:
              vAlpha.setProgress(0);
              vRed.setProgress(0);
              vGreen.setProgress(0);
              vBlue.setProgress(0);

              break;


          case R.id.iteCloseapp:
              System.exit(0);
              break;

          case R.id.iteWhite :
                //Code to change white
              vRed.setProgress(255);
              vGreen.setProgress(255);
              vBlue.setProgress(255);
              vAlpha.setProgress(200);
              color.setText("Blanco");
              break;

                  case R.id.iteRed :
              vRed.setProgress(255);
              vGreen.setProgress(0);
              vBlue.setProgress(0);
              vAlpha.setProgress(128);
                      color.setText("Rojo");
              break;

              case R.id.iteGreen :
                  //Change color to green
              vRed.setProgress(0);
              vGreen.setProgress(255);
              vBlue.setProgress(0);
              vAlpha.setProgress(128);
                  color.setText("Verde");
              break;

              case R.id.iteBlue :
                //Change color to blue
              vRed.setProgress(0);
              vGreen.setProgress(0);
              vBlue.setProgress(255);
              vAlpha.setProgress(128);
                  color.setText("Azul");
              break;

              case R.id.iteCyan :
                  //Change color to Cyan
                  vRed.setProgress(0);
                vGreen.setProgress(255);
                vBlue.setProgress(255);
                vAlpha.setProgress(200);
                  color.setText("Cyan");
              break;

          case R.id.iteMagenta :
              //Change color to magenta
              vRed.setProgress(255);
              vGreen.setProgress(0);
              vBlue.setProgress(255);
              vAlpha.setProgress(200);
              color.setText("Magenta");
              break;

          case R.id.iteYellow :
              //Change color to yellow
              vRed.setProgress(255);
              vGreen.setProgress(255);
              vBlue.setProgress(0);
              vAlpha.setProgress(200);
              color.setText("Amarillo");
              break;

           case R.id.iteBkack :
               //Change color to yellow
               vRed.setProgress(0);
               vGreen.setProgress(0);
               vBlue.setProgress(0);
               vAlpha.setProgress(200);
               color.setText("Negro");
               break;
           case R.id.iteTransparent :
               //Change color to transparent
               vRed.setProgress(0);
               vGreen.setProgress(0);
               vBlue.setProgress(0);
               vAlpha.setProgress(0);
               color.setText("Trasparente");
               break;
           case R.id.iteSemiTransparent :
               //Change color to semitransparet
               vRed.setProgress(128);
               vGreen.setProgress(128);
               vBlue.setProgress(128);
               vAlpha.setProgress(128);
               color.setText("SemiTrasparente");
               break;
           case R.id.iteOpaque:
               vAlpha.setProgress(128);
               vRed.setProgress(0);
               vGreen.setProgress(0);
               vBlue.setProgress(0);
               color.setText("Opaco");
               break;
           case R.id.iteAboutof :
               //Go/jump to Aboutof Activity
               Intent intent2 = new Intent(this, AboutofActivity.class);
                 startActivity(intent2);
               break;


    }

       return super.onOptionsItemSelected(item);
    }


    //#############################################
    //CONTEXT MENU
    //#############################################


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater2 = getMenuInflater();
        inflater2.inflate(R.menu.menu2, menu);
    }

    @Override
        public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.iteHelp :
                Intent intent = new Intent(this, Activity_help.class);
                startActivity(intent);
                break;
            case R.id.iteAboutof :
                Toast.makeText(this, "You've pressed Help icon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iteReset:
                vAlpha.setProgress(0);
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                break;

        }

        return super.onContextItemSelected(item);
    }

    //#############################################
    //SEEKBARS
    //#############################################
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        //1. Get Seekbar values
        int r = vRed.getProgress();
        int g = vGreen.getProgress();
        int b = vBlue.getProgress();
        int a = vAlpha.getProgress();

        //2. Convert values (in step 1) to ARGB function
        int filter_color = Color.argb(a,r,g,b); //Alpha, Red, Green, Blue

        /*
        int filter_color = Color.argb(
            vRed.getProgress(),
            vGreen.getProgress(),
            vBlue.getProgress(),
            vAlpha.getProgress()
        );
        */

        //3. Set the new color to Image (View)
        vFilter.setBackgroundColor(filter_color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
