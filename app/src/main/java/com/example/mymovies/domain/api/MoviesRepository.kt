package com.example.mymovies.domain.api

import com.example.mymovies.domain.models.Movie

interface MoviesRepository {
    fun searchMovies(expression: String): List<Movie>
}