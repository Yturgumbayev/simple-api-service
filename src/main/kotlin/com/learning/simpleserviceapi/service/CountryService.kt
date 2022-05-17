package com.learning.simpleserviceapi.service

import com.learning.simpleserviceapi.dto.CountryDto

interface CountryService {

    fun getAll(): List<CountryDto>
}