package com.pranay.moviespro.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import com.pranay.moviespro.R;
import com.pranay.moviespro.databinding.ActivityMainBinding;
import com.pranay.moviespro.databinding.ActivityMovieBinding;
import com.pranay.moviespro.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
//        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activityMovieBinding = DataBindingUtil.setContentView(this,R.layout.activity_movie);
        Intent i = getIntent();

        if(i.hasExtra("movie")){
            movie = getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            getSupportActionBar().setTitle(movie.getTitle());
        }

    }



}