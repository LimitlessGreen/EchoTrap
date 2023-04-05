package com.echotrap.model

import jakarta.persistence.*

@Entity
@Table(name = "bird_user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val nationality: String,
    val email: String,
){
    @get:Transient
    val fullName: String
        get() = "$firstName $lastName"
}