package com.echotrap.repository

import com.echotrap.model.Classification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ClassificationRepository : JpaRepository<Classification, Long>