package com.echotrap.controller

import com.echotrap.model.User
import com.echotrap.service.UserService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class UserGraphQlController (val service: UserService){

    @QueryMapping
    fun allUsers(): List<User> {
        return service.getAll()
    }
}