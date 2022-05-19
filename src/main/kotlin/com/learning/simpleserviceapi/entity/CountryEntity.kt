package com.learning.simpleserviceapi.entity

import javax.persistence.*

@Entity
//@Table(name = "countries")

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
