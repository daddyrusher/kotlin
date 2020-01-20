package com.daddyrusher.springsecurity.domain

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        @Column(name = "firstname")
        val firstName: String = "",
        @Column(name = "lastname")
        val lastName: String = ""
)
