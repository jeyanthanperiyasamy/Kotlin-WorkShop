import org.junit.Test

class SingletonTest {

    @Test
    fun test() {
        val obj2 = Singleton
        println(obj2)
        val obj1 = Singleton
        println(obj1)
    }
}

