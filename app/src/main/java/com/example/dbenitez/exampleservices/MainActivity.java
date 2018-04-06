package com.example.dbenitez.exampleservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dbenitez.exampleservices.model.ApiServices;
import com.example.dbenitez.exampleservices.model.Schedules;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private final String HOST_BASE = "http://stage-api-yelmocines.cinepolis.com.es/";

    private ImageView mImageView;
    private TextView mNombre;
    private TextView mSimopsis;
    private TextView mHorarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.iv_movie);
        mNombre=findViewById(R.id.tv_nombre);
        mSimopsis=findViewById(R.id.tv_sinopsis);
        mHorarios=findViewById(R.id.tv_horario);
        callRetrofitServices("","");
    }


    private void callRetrofitServices(String user, String password) {
        // String endPoint=getString(R.string.host_api_storage);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiServices services = retrofit.create(ApiServices.class);
        services.getMembersLoyalty().enqueue(new Callback<Schedules>() {
            @Override
            public void onResponse(Call<Schedules> call, Response<Schedules> response) {

                mNombre.setText(response.body().getMovies().get(2).getName());
                mSimopsis.setText(response.body().getMovies().get(2).getSynopsis());
                String idMovie=response.body().getMovies().get(2).getId();
                ArrayList<Schedules.Schedule> shcedules=response.body().getSchedules();
                String date="";
                for(Schedules.Schedule s: shcedules){
                    if(idMovie.equals(s.getMovieId()+"")){
                        for(Schedules.Date date1: s.getDates()){
                            String aux=date1.getDate();
                            if(aux.equals("2018-04-19")) {
                                date +=date1.getDate().toString();
                                date += " \n";
                            }
                        }
                    }
                }
                mHorarios.setText(date);
                String ruta="";
                ruta+=response.body().getRoutes().get(1).getSizes().getMedium();
                ruta+=response.body().getMovies().get(2).getMedia().get(0).getResource();
                Picasso.get().load(ruta).into(mImageView);
                Log.e("erorr","error");
            }

            @Override
            public void onFailure(Call<Schedules> call, Throwable t) {
                Log.e("erorr","error");
            }
        });
    }



}
