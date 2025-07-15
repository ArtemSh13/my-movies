package com.example.mymovies.presentation.poster

import android.app.Activity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.mymovies.R

class PosterPresenter(private val view: PosterView, private val posterUrl: String) {

    fun onCreate() {
        view.loadPosterByUrl(posterUrl)
    }
}