package com.example.mymovies.util

import android.app.Activity
import android.content.Context
import com.example.mymovies.data.MoviesRepositoryImpl
import com.example.mymovies.data.network.RetrofitNetworkClient
import com.example.mymovies.domain.api.MoviesInteractor
import com.example.mymovies.domain.api.MoviesRepository
import com.example.mymovies.domain.impl.MoviesInteractorImpl
import com.example.mymovies.presentation.movies.MoviesSearchPresenter
import com.example.mymovies.presentation.poster.PosterPresenter
import com.example.mymovies.presentation.movies.MoviesView
import com.example.mymovies.presentation.poster.PosterView

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchPresenter(
        moviesView: MoviesView,
        context: Context
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            view = moviesView,
            context = context
        )
    }

    fun providePosterPresenter(view: PosterView, posterUrl: String): PosterPresenter {
        return PosterPresenter(view, posterUrl)
    }
}