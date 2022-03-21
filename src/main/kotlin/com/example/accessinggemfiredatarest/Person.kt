package com.example.accessinggemfiredatarest

import org.springframework.data.annotation.*
import org.springframework.data.gemfire.mapping.annotation.*
import java.util.concurrent.atomic.AtomicLong

@Region("People")
data class Person(
    var firstName: String? = null,
    var lastName: String? = null,
    @Id
    var id: Long? = generatedId()
) {
    companion object {
        private val COUNTER = AtomicLong(0L)

        private fun generatedId(): Long {
            return COUNTER.incrementAndGet()
        }
    }
}