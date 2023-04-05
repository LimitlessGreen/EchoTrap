package com.echotrap.controller

import com.echotrap.model.User
import com.echotrap.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping("api/v1/users")
@RestController
class UserRestController(val service: UserService) {

    @GetMapping
    fun getAllPlayers() = service.getAll()

    @GetMapping("/{id}")
    fun getPlayer(@PathVariable id: Long) = service.getById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun savePlayer(@RequestBody user: User): User = service.create(user)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletePlayer(@PathVariable id: Long) = service.remove(id)

    @PutMapping("/{id}")
    fun updatePlayer(
        @PathVariable id: Long, @RequestBody user: User
    ) = service.update(id, user)
}