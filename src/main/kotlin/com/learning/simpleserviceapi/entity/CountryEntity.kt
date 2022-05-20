package com.learning.simpleserviceapi.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name = "countries", schema = "public")
@JsonIgnoreProperties("hibernateLazyInitializer", "handler")
class CountryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @Column(name = "country_name")
    var countryName: String = "",
    var capital: String = "",
    var population: Long = 0,
    @Column(name = "is_nato_member")
    var isNatoMember: Boolean = true
)
