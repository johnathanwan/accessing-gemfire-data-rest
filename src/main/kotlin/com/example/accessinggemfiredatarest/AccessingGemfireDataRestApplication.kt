package com.example.accessinggemfiredatarest

import org.apache.geode.cache.client.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories

@SpringBootApplication
@ClientCacheApplication(name = "AccessingGemFireDataRestApplication")
@EnableEntityDefinedRegions(
    basePackageClasses = [Person::class],
    clientRegionShortcut = ClientRegionShortcut.LOCAL
)
@EnableGemfireRepositories
class AccessingGemfireDataRestApplication

fun main(args: Array<String>) {
    runApplication<AccessingGemfireDataRestApplication>(*args)
}
