package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.viewmodel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val postViewModel: PostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postViewModel.response.observe(this, { response ->
            Log.d("main", "$response")
        })
    }

}