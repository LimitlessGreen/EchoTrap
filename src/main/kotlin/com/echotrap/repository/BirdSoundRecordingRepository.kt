package com.echotrap.repository

import com.echotrap.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface BirdSoundRecordingRepository : JpaRepository<User, Long>