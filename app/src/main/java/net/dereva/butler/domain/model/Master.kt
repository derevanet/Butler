package net.dereva.butler.domain.model

import net.dereva.butler.domain.ServiceType
import kotlin.random.Random

/**
Class that represents someone who can respond to Customer's request
and suggest Service to Customer at certain time
 */
class Master constructor(name: String) {

    init {
        val id = Random.nextInt()
        var name = name.trim()
        val services = mutableSetOf<ServiceType>()
    }

}