package com.learning.simpleserviceapi.exceptions

data class ApiError(
    val errorCode: String, // country.not.found
    val description: String,
)
