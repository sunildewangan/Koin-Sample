package com.test.koinsample.data.api

import com.test.koinsample.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService):ApiHelper {
    override suspend fun getUsers(): Response<List<User>>  = apiService.getUsers()
}