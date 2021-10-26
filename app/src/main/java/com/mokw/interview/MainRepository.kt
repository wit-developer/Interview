package com.mokw.interview

import com.google.gson.GsonBuilder
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MainRepository {

    private val mainClient by lazy {
        Retrofit.Builder()
            .client(OkHttpClient.Builder()
                .readTimeout(30 * 1000L, TimeUnit.MILLISECONDS)
                .writeTimeout(30 * 1000L, TimeUnit.MILLISECONDS)
                .build())
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(MainApi::class.java)
    }

    fun loadSearch() : Single<SearchResp> {
        return mainClient.search()
    }

    fun loadContents(contentId: Long, size: Int) : Single<LoadResp> {
        return mainClient.loadContents(contentId, size)
    }
}