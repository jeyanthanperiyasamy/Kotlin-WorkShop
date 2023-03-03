sealed class Fruit2(val x: String) {
    // Two subclasses of sealed class defined within
    class Apple : Fruit2("Apple")
    class Mango : Fruit2("Mango")
}