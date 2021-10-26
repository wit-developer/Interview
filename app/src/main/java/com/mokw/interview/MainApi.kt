package com.mokw.interview

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {
    @GET("api/v1/search")
    fun search() : Single<SearchResp>

    @GET("api/v1/load/contents")
    fun loadContents(@Query("lastContentId") lastContentId: Long, @Query("size") size: Int) : Single<LoadResp>
}





