package com.example.abedeid.almos7f;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Abed Eid on 26/07/2016.
 */
public class mp3quran_Result {
    @SerializedName("mp3quran")
    List<mp3quran> mp3quran;

    public List<mp3quran> getMp3quranList() {
        return mp3quran;
    }

    public void setMp3quranList(List<mp3quran> mp3quran) {
        this.mp3quran = mp3quran;
    }
}
