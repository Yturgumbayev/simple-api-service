package com.learning.simpleserviceapi.service.impl

import com.learning.simpleserviceapi.dto.CountryDto
import com.learning.simpleserviceapi.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl : CountryService {
    override fun getAll(): List<CountryDto> {
        return listOf(
            CountryDto(1, "Казахстан", 19_500_000),
            CountryDto(2, "Украина", 40_000_000),
        )
    }
}