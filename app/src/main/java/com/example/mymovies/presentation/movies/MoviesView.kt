package com.example.mymovies.presentation.movies

import com.example.mymovies.domain.models.Movie

interface MoviesView {

    fun showPlaceholderMessage(isVisible: Boolean)

    fun showMoviesList(isVisible: Boolean)

    fun showProgressBar(isVisible: Boolean)

    fun changePlaceholderText(newPlaceholderText: String)

    fun updateMoviesList(newMoviesList: List<Movie>)

    fun showToast(additionalMessage: String)

}