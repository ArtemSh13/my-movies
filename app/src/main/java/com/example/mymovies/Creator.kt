package com.example.mymovies

import android.app.Activity
import com.example.mymovies.data.MoviesRepositoryImpl
import com.example.mymovies.data.network.RetrofitNetworkClient
import com.example.mymovies.domain.api.MoviesInteractor
import com.example.mymovies.domain.api.MoviesRepository
import com.example.mymovies.domain.impl.MoviesInteractorImpl
import com.example.mymovies.presentation.MoviesSearchController
import com.example.mymovies.presentation.PosterController
import com.example.mymovies.ui.movies.MoviesAdapter

object Creator {
    private fun getMoviesRepository(): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideMoviesInteractor(): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository())
    }

    fun provideMoviesSearchController(activity: Activity, adapter: MoviesAdapter): MoviesSearchController {
        return MoviesSearchController(activity, adapter)
    }

    fun providePosterController(activity: Activity): PosterController {
        return PosterController(activity)
    }
}