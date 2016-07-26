package com.example.abedeid.almos7f;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class souraFragment extends Fragment {
    TextView txt;
    FragmentManager fragmentManager;
    Communicator communicator;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_soura, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator= (Communicator) getActivity();
        txt = (TextView)getActivity().findViewById(R.id.text);


    }

    public void get(String a, String b) {
        txt.setText(a + "\n" + b);

    }

}
