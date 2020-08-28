package com.blogapp.aws.movieuitemplate.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.adapters.MovieAdapter;
import com.blogapp.aws.movieuitemplate.adapters.MovieItemClickListener;
import com.blogapp.aws.movieuitemplate.models.Movie;
import com.blogapp.aws.movieuitemplate.utils.DataSource;

public class ActionActivity extends AppCompatActivity implements MovieItemClickListener {



    private RecyclerView Rv_category_action;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        iniViews();
        iniActionMovies();




    }



     private void iniActionMovies() {

            MovieAdapter actionMovieAdapter =new MovieAdapter(this,DataSource.getActionMovies(),this);
            Rv_category_action.setAdapter(actionMovieAdapter);
            Rv_category_action.setLayoutManager(new GridLayoutManager(this,3));



    }

    private void iniViews() {

        Rv_category_action= findViewById(R.id.Rv_category_action);

    }



    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        Intent intent = new Intent(this,MovieDetailActivity.class);
        // send movie information to deatilActivity
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("imgURL",movie.getThumbnail());
        intent.putExtra("imgCover",movie.getCoverPhoto());
        intent.putExtra("describe",movie.getDescription());
        intent.putExtra("detailsRate",movie.getRating());
        intent.putExtra("StreamLink",movie.getStreamingLink());
        // lets crezte the animation
        ActivityOptions options = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            options = ActivityOptions.makeSceneTransitionAnimation(ActionActivity.this,
                    movieImageView,"sharedName");
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent,options.toBundle());
        }


        // i l make a simple test to see if the click works

        Toast.makeText(this,"İyi Seyirler : " + movie.getTitle(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}