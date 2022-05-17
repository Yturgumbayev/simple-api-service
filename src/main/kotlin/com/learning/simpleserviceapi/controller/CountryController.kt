package com.learning.simpleserviceapi.controller

import com.learning.simpleserviceapi.dto.CountryDto
import com.learning.simpleserviceapi.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/countries")
class CountryController(
    private val countryService: CountryService,
) {

    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAll()
}