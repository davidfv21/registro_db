package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public  void onClick(View View) {
        Intent miIntent=null;

        switch (View.getId()){
            case R.id.btonopcionregistro:
                miIntent=new Intent(MainActivity.this,registrousuario.class);

                break;


        }
        if (miIntent!=null){
            startActivity(miIntent);
        }

    }
}
