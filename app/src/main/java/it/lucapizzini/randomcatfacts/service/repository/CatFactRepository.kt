package it.lucapizzini.randomcatfacts.service.repository

import it.lucapizzini.randomcatfacts.model.CatFact
import it.lucapizzini.randomcatfacts.service.api.CatFactService

class CatFactRepository(
    private val catFactService: CatFactService
) {
    suspend fun getCatFact(): CatFact = catFactService.getCatFact()
}