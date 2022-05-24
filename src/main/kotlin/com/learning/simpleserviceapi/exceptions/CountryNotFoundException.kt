package com.learning.simpleserviceapi.exceptions

import org.springframework.http.HttpStatus

class CountryNotFoundException(countryId: Int): CustomException(
    HttpStatus.NOT_FOUND,
    ApiError(
        errorCode = "country.not.found",
        description = "Страна не найдена по ID = $countryId"
    )
)