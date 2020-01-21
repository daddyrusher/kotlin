package com.daddyrusher.springsecurity.controller

import com.daddyrusher.springsecurity.domain.Customer
import com.daddyrusher.springsecurity.repository.CustomerRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customer")
class RestAPI(private val customerRepository: CustomerRepository) {

    @PostMapping
    fun save() {
        customerRepository.save(Customer(1, "Jack", "Smith"))
        customerRepository.save(Customer(2, "Adam", "Johnson"))
        customerRepository.save(Customer(3, "Kim", "Smith"))
        customerRepository.save(Customer(4, "David", "Williams"))
        customerRepository.save(Customer(5, "Peter", "Davis"))
    }

    @GetMapping("/findAll")
    fun findAll(): MutableList<Customer> = customerRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = customerRepository.findById(id)

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName: String): List<Customer> = customerRepository.findByLastName(lastName)

}
