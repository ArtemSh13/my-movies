package com.example.mymovies

data class MoviesSearchResponse(val searchType: String,
                                val expression: String,
                                val results: List<Movie>)