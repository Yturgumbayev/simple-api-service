package com.learning.simpleserviceapi.service

import com.learning.simpleserviceapi.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>

    fun getById(id: Int): CountryDto

    fun search(prefix: String): List<CountryDto>

    fun create(dto: CountryDto): Int

    fun update(id: Int, dto: CountryDto)

    fun delete(id: Int)
}