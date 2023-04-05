package com.echotrap.controller

import com.echotrap.model.Classification
import com.echotrap.repository.ClassificationRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/classifications")
class ClassificationController(val repository: ClassificationRepository) {
    private val logger = LoggerFactory.getLogger(ClassificationController::class.java)

    @GetMapping("/{id}")
    fun getClassificationById(@PathVariable id: Long): Optional<Classification> {
        return repository.findById(id)
    }

    @GetMapping
    fun getAllClassifications(): List<Classification> {
        return repository.findAll()
    }

    @PostMapping
    fun createClassification(@RequestBody classification: Classification): Classification {
        return repository.save(classification)
    }

    @PutMapping
    fun updateClassifications(@RequestBody classifications: List<Classification>): List<Classification> {
        return classifications.map { classification ->
            val existingClassification = repository.findById(classification.id).orElse(null)
            existingClassification?.apply {
                path = classification.path
                startTimeSeconds = classification.startTimeSeconds
                endTimeSeconds = classification.endTimeSeconds
                scientificName = classification.scientificName
                commonName = classification.commonName
                confidence = classification.confidence
                latitude = classification.latitude
                longitude = classification.longitude
                week = classification.week
            }
            logger.info(existingClassification.toString())
            repository.save(existingClassification!!)
        }
    }

    @PutMapping("/{id}")
    fun updateClassification(@PathVariable id: Long, @RequestBody classification: Classification): Classification {
        val existingClassification = repository.findById(id).orElse(null)
        existingClassification?.apply {
            path = classification.path
            startTimeSeconds = classification.startTimeSeconds
            endTimeSeconds = classification.endTimeSeconds
            scientificName = classification.scientificName
            commonName = classification.commonName
            confidence = classification.confidence
            latitude = classification.latitude
            longitude = classification.longitude
            week = classification.week
        }
        logger.info(existingClassification.toString())
        return repository.save(existingClassification!!)
    }

    @DeleteMapping("/{id}")
    fun deleteClassification(@PathVariable id: Long) {
        repository.deleteById(id)
    }

}