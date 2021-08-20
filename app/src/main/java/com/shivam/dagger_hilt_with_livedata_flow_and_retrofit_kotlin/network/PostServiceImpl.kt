package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.network

import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.model.Post
import javax.inject.Inject

class PostServiceImpl
@Inject
constructor(private val postServiceApi: PostApiService) {

    suspend fun getPost():List<Post> = postServiceApi.getPost()
}