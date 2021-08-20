package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.network

import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.model.Post
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getPost(): List<Post>
}