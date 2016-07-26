package com.example.abedeid.almos7f;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Home extends Fragment {
    RecyclerView recyclerView;
    private RecyclerView adapter;
    Communicator communicator;

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView) v.findViewById(R.id.recyle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<mp3quran_Result> mp3quran_resultCall = apiService.getmp3quran();

        mp3quran_resultCall.enqueue(new Callback<mp3quran_Result>() {
            @Override
            public void onResponse(Call<mp3quran_Result> call, Response<mp3quran_Result> response) {
                List<mp3quran> list = response.body().getMp3quranList();
                RecyleViewAdapter adapter = new RecyleViewAdapter(list, getContext());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

            }

            @Override
            public void onFailure(Call<mp3quran_Result> call, Throwable t) {

            }
        });

        return v;
    }


}
