package org.example

import kotlinx.coroutines.*
import Coffee
import CoffeeMaker
import CoffeeType

class Barista(private val name: String): CoffeeMaker.OnCoffeeBrewedListener {
    private val coffeeMaker = CoffeeMaker()

    fun acceptOrder(type: CoffeeType) {
        coffeeMaker.brewCoffee(type, this)
    }

    override fun onCoffeeBrewed(coffee: Coffee) {
        println("$name finished brewing ${coffee.type} in ${coffee.type.brewTime} millis")
    }

}