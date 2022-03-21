package com.example.accessinggemfiredatarest

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@Suppress("unused")
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository: CrudRepository<Person, Long> {

    fun findByLastName(@Param("name") name: String): List<Person>

}