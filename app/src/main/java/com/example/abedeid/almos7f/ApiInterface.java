package com.example.abedeid.almos7f;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Abed Eid on 26/07/2016.
 */
public interface ApiInterface {

    @GET("mp3quran.json")
    Call<mp3quran_Result> getmp3quran();


}
