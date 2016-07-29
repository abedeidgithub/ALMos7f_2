package com.example.abedeid.almos7f;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Abed Eid on 26/07/2016.
 */
public class Soura_Activity extends Activity {
    souraFragment f;
    FragmentManager manager;

    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        setContentView(R.layout.soura_activity);
//        f = new souraFragment();
//        Intent intent = getIntent();
//        String s = intent.getStringExtra("json");
//        Bundle args = new Bundle();
//        args.putString("jsonKey", s);
//        f.setArguments(args);
//        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().add(R.id.home, f).commit();

        return super.onCreateView(name, context, attrs);
    }


}
