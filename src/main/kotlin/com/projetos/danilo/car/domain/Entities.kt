package com.projetos.danilo.car.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Motoristas
 */
@Entity
data class Driver(
    @Id
    var id: Long? = null,
    val name: String,
    val birthDate: LocalDate
)