package com.example.abedeid.almos7f;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class souraFragment extends Fragment {
    TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_soura, container, false);
//        txt = (TextView)view.findViewById(R.id.text);
//
//        Bundle bundle=this.getArguments();
//        String jsonKey = bundle.getString("jsonKey");
//        txt.setText(jsonKey);
        return view;
    }
}
