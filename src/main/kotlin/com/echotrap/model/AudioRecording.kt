package com.echotrap.model

import jakarta.persistence.*

@Entity
data class AudioRecording(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    val startTime: String,
    val endTime: String,
)
