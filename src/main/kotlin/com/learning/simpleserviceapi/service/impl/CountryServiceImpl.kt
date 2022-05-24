package com.learning.simpleserviceapi.service.impl

import com.learning.simpleserviceapi.dto.CountryDto
import com.learning.simpleserviceapi.entity.CountryEntity
import com.learning.simpleserviceapi.exceptions.CountryNotFoundException
import com.learning.simpleserviceapi.repository.CountryRepository
import com.learning.simpleserviceapi.service.CountryService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl (

    private val countryRepository: CountryRepository
    ) : CountryService {

    override fun getAll(): List<CountryDto> {
        return countryRepository.findAll().map {it.toDto()}
    }

    override fun getById(id: Int): CountryDto {
        return countryRepository.findByIdOrNull(id)
            ?.toDto()
            ?: throw CountryNotFoundException(id)
    }

    override fun search(prefix: String): List<CountryDto> =
        countryRepository.findByCountryNameStartsWithOrderByCountryName(prefix)
            .map { it.toDto() }

    override fun create(dto: CountryDto): Int {
        return countryRepository.save(dto.toEntity()).id
    }

    override fun update(id: Int, dto: CountryDto) {
        val existingCountry = countryRepository.findByIdOrNull(id)
            ?: throw CountryNotFoundException(id)

        existingCountry.countryName = dto.countryName
        existingCountry.capital = dto.capital
        existingCountry.population = dto.population
        existingCountry.isNatoMember = dto.isNatoMember

        countryRepository.save(existingCountry)
    }

    override fun delete(id: Int) {
        val existingCountry = countryRepository.findByIdOrNull(id)
            ?: throw CountryNotFoundException(id)

        countryRepository.deleteById(existingCountry.id)
    }

    private fun CountryEntity.toDto(): CountryDto =
        CountryDto(
            id = this.id,
            countryName = this.countryName,
            capital = this.capital,
            population = this.population,
            isNatoMember = this.isNatoMember
        )

    private fun CountryDto.toEntity(): CountryEntity =
        CountryEntity(
            id = 0,
            countryName = this.countryName,
            capital = this.capital,
            population = this.population,
            isNatoMember = this.isNatoMember
        )
}