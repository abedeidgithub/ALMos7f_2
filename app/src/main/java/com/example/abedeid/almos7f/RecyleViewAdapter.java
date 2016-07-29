package com.example.abedeid.almos7f;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abed Eid on 26/07/2016.
 */
public class RecyleViewAdapter extends RecyclerView.Adapter<RecyleViewAdapter.MyHolder> {
    private Context context;
    List<mp3quran> mp3quren;

    public RecyleViewAdapter(List<mp3quran> mp3quren, Context context) {
        this.context = context;
        this.mp3quren = mp3quren;
    }

    @Override
    public RecyleViewAdapter.MyHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, null);
        return new MyHolder(view);

    }

    @Override
    public void onBindViewHolder(final RecyleViewAdapter.MyHolder holder, int position) {

        String Lan = mp3quren.get(position).getLanguage();
        final String json = mp3quren.get(position).getJson();
        final String Sura_name = mp3quren.get(position).getSura_name();
        holder.name.setText(Lan.substring(1, Lan.length()));
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//TODO json & soura_name to SouraFragment

            }
        });
    }

    @Override
    public int getItemCount() {
        return mp3quren.size();
    }


    public static class MyHolder extends RecyclerView.ViewHolder {
        private TextView name;


        public MyHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);

        }
    }
}