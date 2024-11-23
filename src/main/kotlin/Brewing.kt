
enum class CoffeeType(val brewTime: Long) {
    AMERICANO(300L),
    CAPPICCINO(950L),
    DRIP(100L),
    ESPRESSO(800L),
    LATTE(875L)
}

data class Coffee(val type: CoffeeType)
class CoffeeMaker {
    fun brewCoffee(type: CoffeeType, callback: OnCoffeeBrewedListener) {
        delay(type.brewTime) {
            val madeCoffee = Coffee(type)
            callback.onCoffeeBrewed(madeCoffee)
        }
    }

    interface OnCoffeeBrewedListener {
        fun onCoffeeBrewed(coffee: Coffee)
    }
}