package com.example.mymovies

import com.example.mymovies.data.MoviesRepositoryImpl
import com.example.mymovies.data.network.RetrofitNetworkClient
import com.example.mymovies.domain.api.MoviesInteractor
import com.example.mymovies.domain.api.MoviesRepository
import com.example.mymovies.domain.impl.MoviesInteractorImpl

object Creator {
    private fun getMoviesRepository(): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideMoviesInteractor(): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository())
    }
}