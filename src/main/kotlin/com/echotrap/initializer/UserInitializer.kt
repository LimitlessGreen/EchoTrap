package com.echotrap.initializer

import com.echotrap.model.User
import com.echotrap.repository.UserRepository
import jakarta.annotation.PostConstruct
import jakarta.transaction.Transactional
import org.springframework.stereotype.Component

@Component
class UserInitializer(val userRepository: UserRepository) {

    @PostConstruct
    @Transactional
    fun init() {
        val users = listOf(
            User(0, "Max", "Mustermann", 30, "Germany", "max.mustermann@gmail.com"),
            User(0, "John", "Doe", 40, "USA", "john.doe@gmail.com"),
            User(0, "Jane", "Doe", 35, "USA", "jane.doe@gmail.com"),
            User(0, "Maria", "Garcia", 25, "Spain", "maria.garcia@gmail.com"),
            User(0, "Luis", "Fernandez", 27, "Spain", "luis.fernandez@gmail.com"),
            User(0, "Sophie", "Dubois", 22, "France", "sophie.dubois@gmail.com"),
            User(0, "Lucas", "Martin", 29, "France", "lucas.martin@gmail.com")
        )
        userRepository.saveAll(users)
    }
}
