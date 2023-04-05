package com.echotrap.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.Nationalized

@Entity
data class Classification(
    @Id @Nationalized @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    var path: String,
    var startTimeSeconds: Float,
    var endTimeSeconds: Float,
    var scientificName: String,
    @Nationalized
    var commonName: String,
    var confidence: Float,
    var latitude: Float,
    var longitude: Float,
    var week: Int
)