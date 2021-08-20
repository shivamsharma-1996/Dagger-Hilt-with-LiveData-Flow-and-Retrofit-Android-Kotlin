package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.repository

import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.model.Post
import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.network.PostServiceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository
@Inject
constructor(private val postApiServiceImpl: PostServiceImpl) {

    fun getPost():Flow<List<Post>> = flow {
        val response = postApiServiceImpl.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)
}