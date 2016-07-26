package com.example.abedeid.almos7f;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communicator {
    com.example.abedeid.almos7f.Home home;
    android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        home=(com.example.abedeid.almos7f.Home) fragmentManager.findFragmentById(R.id.home);

        home.setCommunicator(this);
    }

    @Override
    public void send(String a ,String b ) {

        Intent intent=new Intent(this,Soura_Activity.class);
        intent.putExtra("json",a);
        intent.putExtra("j_Soura",b);
        startActivity(intent);


    }
}
