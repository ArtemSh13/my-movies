package com.example.mymovies.ui.poster

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.mymovies.util.Creator
import com.example.mymovies.R
import com.example.mymovies.presentation.poster.PosterPresenter
import com.example.mymovies.presentation.poster.PosterView

class PosterActivity : Activity(), PosterView {

    private lateinit var poster: ImageView

    private lateinit var posterPresenter: PosterPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poster)

        poster = findViewById(R.id.poster)

        val url = this.intent.extras?.getString("poster", "") ?: ""
        posterPresenter = Creator.providePosterPresenter(this, url)
        posterPresenter.onCreate()
    }

    override fun loadPosterByUrl(url: String) {
        if(url.isNotEmpty()) {
            Glide.with(this.applicationContext)
                .load(url)
                .into(poster)
        } else {
            poster.setImageResource(R.drawable.ic_launcher_background)
        }
    }
}