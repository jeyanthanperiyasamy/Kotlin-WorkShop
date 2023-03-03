import kotlin.test.Test

class FruitTest {

    @Test
    fun test(fruit2: Fruit2) {
        when(fruit2) {
            is Fruit2.Apple -> TODO()
            is Fruit2.Mango -> TODO()
        }
    }
}