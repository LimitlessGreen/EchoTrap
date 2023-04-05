package com.echotrap.model

import jakarta.persistence.*
import org.springframework.data.geo.Point;

@Entity
data class Location(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,

    @Column(nullable = false)
    val name: String,

    var coordinates: Point? = null,
    )
