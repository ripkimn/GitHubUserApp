package com.dicoding.picodiploma.githubuser.api

import com.dicoding.picodiploma.githubuser.data.DetailUserResponse
import com.dicoding.picodiploma.githubuser.data.User
import com.dicoding.picodiploma.githubuser.data.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}