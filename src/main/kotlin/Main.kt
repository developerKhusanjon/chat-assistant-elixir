package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val fred = Barista("Fred")
    val sam = Barista("Sam")

    fred.acceptOrder(CoffeeType.LATTE)
    sam.acceptOrder(CoffeeType.AMERICANO)
}