package com.example.abedeid.almos7f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Abed Eid on 26/07/2016.
 */
public class Soura_Activity extends Activity implements Communicator {
    com.example.abedeid.almos7f.souraFragment souraFragment;
    android.support.v4.app.FragmentManager fragmentManager;

    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        setContentView(R.layout.soura_activity);
        Intent intent = getIntent();
        String json = intent.getStringExtra("json");
        String json_soura = intent.getStringExtra("j_Soura");
        souraFragment f = new souraFragment();
        f.get(json, json_soura);
        return super.onCreateView(name, context, attrs);
    }


    @Override
    public void send(String a, String b) {

    }
}
