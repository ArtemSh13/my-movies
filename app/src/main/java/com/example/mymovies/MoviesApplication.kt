package com.example.mymovies

import android.app.Application
import com.example.mymovies.presentation.movies.MoviesSearchPresenter

class MoviesApplication : Application() {

    var moviesSearchPresenter: MoviesSearchPresenter? = null

}