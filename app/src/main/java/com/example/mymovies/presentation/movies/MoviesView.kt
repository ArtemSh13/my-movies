package com.example.mymovies.presentation.movies

import com.example.mymovies.domain.models.Movie
import com.example.mymovies.ui.movies.MoviesState

interface MoviesView {

    // Методы, меняющие внешний вид экрана

    fun render(state: MoviesState)

    // Методы одноразовых событий

    fun showToast(additionalMessage: String)

}