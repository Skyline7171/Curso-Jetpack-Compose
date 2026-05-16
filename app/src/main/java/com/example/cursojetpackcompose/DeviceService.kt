package com.example.cursojetpackcompose

import retrofit2.http.GET

interface DeviceService {

    @GET(Constants.OBJECTS_PATH)
    suspend fun GetAllObjects(): List<Device>
}