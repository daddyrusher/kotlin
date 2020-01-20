package com.daddyrusher.springsecurity.repository

import com.daddyrusher.springsecurity.domain.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
    fun findByLastName(lastName: String): List<Customer>
}
