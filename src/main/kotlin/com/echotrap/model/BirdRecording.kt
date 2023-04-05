package com.echotrap.model

import java.time.LocalDate

data class BirdSoundRecording(
    val name: String,
    val filePath: String,
    val recordingDate: LocalDate,
    val recordingLocation: String,
    val species: String,
    val durationInSeconds: Int
)
