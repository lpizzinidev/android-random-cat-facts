package it.lucapizzini.randomcatfacts.service.api

import it.lucapizzini.randomcatfacts.model.CatFact
import retrofit2.http.GET

interface CatFactService {
    @GET
    suspend fun getCatFact(): CatFact
}