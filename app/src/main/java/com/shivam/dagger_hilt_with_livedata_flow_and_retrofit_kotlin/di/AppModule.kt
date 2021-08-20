package com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.di

import android.net.Uri
import com.shivam.dagger_hilt_with_livedata_flow_and_retrofit_kotlin.network.PostApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.annotation.Signed
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providesBaseUrl1(): String = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun providesRetrofitBuilder(baseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providesPostApiService(retrofit: Retrofit): PostApiService =
        retrofit.create(PostApiService::class.java)
}