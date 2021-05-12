package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.ui.NewsActivity
import com.androiddevs.mvvmnewsapp.ui.NewsViewModel

class SavedNewsFragment : Fragment(R.layout.fragment_saved_news) {


    lateinit var viewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}