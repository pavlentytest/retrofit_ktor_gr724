package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YandexAPI {
    // https://predictor.yandex.net/api/v1/predict.json/complete?
// key=pdct.1.1.20240425T061733Z.fb512d364fe7cb18.428dd8c4f034a6692dfe1b162ec902b211372e20&
// q=Привет&
// lang=ru&
// limit=5

    @GET("/api/v1/predict.json/complete")
    fun complete(
        @Query("key") key456356dfg: String,
        @Query("q") test: String,
        @Query("lang") lang: String,
        @Query("limit") limit: Int
    ) : Call<Answer>
}