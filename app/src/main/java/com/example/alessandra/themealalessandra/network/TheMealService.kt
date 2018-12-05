package com.example.alessandra.themealalessandra.network

import com.example.alessandra.themealalessandra.entities.RefeicaoList
import retrofit2.Call
import retrofit2.http.GET

interface TheMealService {

    companion object {
        private const val API_KEY = "1"
        private const val id = 0
    }

    @GET ("latest.php?$API_KEY")
    fun getLatest(): Call<RefeicaoList>

}