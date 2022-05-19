package com.learning.simpleserviceapi.dto

data class CountryDto(
    val id: Int? = null,
    val countryName: String,
    val capital: String,
    val population: Long,
    val isNatoMember: Boolean
)
