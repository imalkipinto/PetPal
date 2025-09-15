package com.petpal.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    
    // Example API endpoint - replace with actual PetPal endpoints
    @GET("pets")
    suspend fun getPets(): Response<List<Any>> // Replace Any with actual data models
    
    // Add more API endpoints as needed
}