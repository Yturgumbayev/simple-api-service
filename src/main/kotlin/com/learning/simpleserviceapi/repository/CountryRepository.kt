package com.learning.simpleserviceapi.repository

import com.learning.simpleserviceapi.entity.CountryEntity
import org.springframework.data.repository.CrudRepository

interface CountryRepository: CrudRepository<CountryEntity, Int> {
    fun findByCountryNameStartsWithOrderByCountryName(prefix: String): List<CountryEntity>
}