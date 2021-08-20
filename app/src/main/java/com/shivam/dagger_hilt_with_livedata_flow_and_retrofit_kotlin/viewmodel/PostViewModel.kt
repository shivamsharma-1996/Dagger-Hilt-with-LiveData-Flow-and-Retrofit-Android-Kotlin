package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.model.Post
import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.repository.PostRepository
import kotlinx.coroutines.flow.catch
import retrofit2.http.POST

class PostViewModel
@ViewModelInject
constructor(private val postRepository: PostRepository): ViewModel() {

    val response:LiveData<List<Post>> = postRepository.getPost()
        .catch { e ->
            Log.d("main", "${e.message}")
        }.asLiveData()
}