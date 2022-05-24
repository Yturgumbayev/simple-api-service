package com.learning.simpleserviceapi.exceptions

import org.springframework.http.HttpStatus

abstract class CustomException(
    val httpStatus: HttpStatus,
    val apiError: ApiError,
): RuntimeException(apiError.description)